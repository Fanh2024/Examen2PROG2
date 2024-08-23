package org.example;

import java.util.List;

public class NaturalPark extends Place implements Reviewable{
    List<Hotel> hotelNearby;
    List<Review> reviews;

    public NaturalPark(String name, double latitude, double longitude, String description, List<Hotel> hotelNearby, List<Review> reviews) {
        super(name, latitude, longitude, description);
        this.hotelNearby = hotelNearby;
        this.reviews = reviews;
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
