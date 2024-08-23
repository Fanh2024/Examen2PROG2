package org.example;

import java.time.LocalDate;

public class Review {
    private String userName;
    private String email;
    private int rating;
    private String comment;
    private LocalDate date;

    public Review(String userName, String email, int rating, String comment, LocalDate date) {
        this.userName = userName;
        this.email = email;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDate getDate() {
        return date;
    }
}


