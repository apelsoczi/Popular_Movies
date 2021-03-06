package com.pelsoczi.popularmovies.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ReviewsResponse {

    @SerializedName("id")
    private Integer id;
    @SerializedName("page")
    private Integer page;
    @SerializedName("results")
    private List<Review> reviews = new ArrayList<Review>();
    @SerializedName("total_pages")
    private Integer totalPages;
    @SerializedName("total_results")
    private Integer totalResults;

    /**
     * No args constructor for use in serialization
     */
    public ReviewsResponse() {}

    /**
     *
     * @param id
     * @param reviews
     * @param totalResults
     * @param page
     * @param totalPages
     */
    public ReviewsResponse(Integer id, Integer page, List<Review> reviews, Integer totalPages, Integer totalResults) {
        this.id = id;
        this.page = page;
        this.reviews = reviews;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @param page
     * The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     *
     * @return
     * The reviews
     */
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     *
     * @param reviews
     * The reviews
     */
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     *
     * @return
     * The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     *
     * @param totalPages
     * The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     *
     * @return
     * The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     *
     * @param totalResults
     * The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

}