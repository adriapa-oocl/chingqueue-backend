package com.wowowin.chingqueue.models.responses;

public class MovieResponse {
    private Integer movie_id;
    private String movie_name;
    private String movie_img;
    private String genre;

    public MovieResponse(Integer movie_id, String movie_name, String movie_img, String genre) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_img = movie_img;
        this.genre = genre;
    }


    public MovieResponse() {
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_img() {
        return movie_img;
    }

    public void setMovie_img(String movie_img) {
        this.movie_img = movie_img;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }
}
