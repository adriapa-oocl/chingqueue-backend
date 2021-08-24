package com.wowowin.chingqueue.models.requests;

public class MovieDetailsRequest {

    private Integer movie_Id;
    private String movie_Description;
    private String movie_Genre;

    public MovieDetailsRequest(Integer movie_Id, String movie_Description, String movie_Genre) {
        this.movie_Id = movie_Id;
        this.movie_Description = movie_Description;
        this.movie_Genre = movie_Genre;
    }

    public MovieDetailsRequest() {
    }

    public Integer getMovie_Id() {
        return movie_Id;
    }

    public void setMovie_Id(Integer movie_Id) {
        this.movie_Id = movie_Id;
    }

    public String getMovie_Description() {
        return movie_Description;
    }

    public void setMovie_Description(String movie_Description) {
        this.movie_Description = movie_Description;
    }

    public String getMovie_Genre() {
        return movie_Genre;
    }

    public void setMovie_Genre(String movie_Genre) {
        this.movie_Genre = movie_Genre;
    }
}
