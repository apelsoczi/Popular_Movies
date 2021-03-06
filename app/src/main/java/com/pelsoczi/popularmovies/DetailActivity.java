package com.pelsoczi.popularmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.pelsoczi.popularmovies.models.Movie;
import com.pelsoczi.popularmovies.ui.DetailFragment;

public class DetailActivity extends AppCompatActivity {

    private static final String LOG_TAG = DetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Movie movie = intent.getExtras().getParcelable(Movie.TAG);
        int index = intent.getExtras().getInt(DetailFragment.MOVIE_INDEX);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_detail, DetailFragment.newInstance(movie, index), DetailFragment.TAG)
                    .commit();
        }
    }
}