package com.wowowin.chingqueue.models.responses;

public class MovieDetailsResponse {

    private Integer movieDetailsId;
    private Integer movieId;
    private String movieDescription;
    private String movieGenre;

    public MovieDetailsResponse(Integer movieDetailsId, Integer movieId, String movieDescription, String movieGenre) {
        this.movieDetailsId = movieDetailsId;
        this.movieId = movieId;
        this.movieDescription = movieDescription;
        this.movieGenre = movieGenre;
    }

    public MovieDetailsResponse() {
    }

    public Integer getMovieDetailsId() {
        return movieDetailsId;
    }

    public void setMovieDetailsId(Integer movieDetailsId) {
        this.movieDetailsId = movieDetailsId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
