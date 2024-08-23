package org.example;

import java.util.List;

public class Hotel extends Place implements Reviewable{
    private String phoneNumber;
    private String email;
    private List<Review> reviews;
    private List<Room> rooms;

    public Hotel(String name, double latitude, double longitude, String description, String phoneNumber, String email, List<Review> reviews, List<Room> rooms) {
        super(name, latitude, longitude, description);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reviews = reviews;
        this.rooms = rooms;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public List<Review> getReviews() {
        return reviews;
    }
}
