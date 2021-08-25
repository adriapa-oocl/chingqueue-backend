package com.wowowin.chingqueue.models.requests;

public class MovieRequest {
    private String movie_name;
    private String movie_img;


    public MovieRequest(String movie_name, String movie_img) {
        this.movie_name = movie_name;
        this.movie_img = movie_img;
    }

    public MovieRequest() {

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
}
