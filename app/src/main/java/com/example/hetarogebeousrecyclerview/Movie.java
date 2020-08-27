package com.example.hetarogebeousrecyclerview;

public class Movie {
    private String movieName;
    private String category;

    public Movie(String movieName, String category) {
        this.movieName = movieName;
        this.category = category;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
