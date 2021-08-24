package com.wowowin.chingqueue.models.requests;

public class MovieDetailsRequest {

    private Integer movieId;
    private String movieDescription;
    private String movieGenre;

    public MovieDetailsRequest(Integer movieId, String movie_Description, String movieGenre) {
        this.movieId = movieId;
        this.movieDescription = movie_Description;
        this.movieGenre = movieGenre;
    }

    public MovieDetailsRequest() {
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
