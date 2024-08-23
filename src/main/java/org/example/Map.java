package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<NaturalPark> parks;
    private List<Hotel> hotels;

    public Map(List<NaturalPark> parks, List<Hotel> hotels) {
        this.parks = parks;
        this.hotels = hotels;
    }

    public Map() {
        parks = new ArrayList<>();
        hotels = new ArrayList<>();
    }

    public void addPark(NaturalPark park) {
        parks.add(park);
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void addrReview (Reviewable item, Review review) {
        item.addReview(review);
    }

    public List<Review> getAllReviews () {
        List<Review> allReviews = new ArrayList<>();
        for (Hotel hotel : hotels) {
            allReviews.addAll(hotel.getReviews());
        }
        for (NaturalPark park : parks) {
            allReviews.addAll(park.getReviews());
        }


        return allReviews;
    }

    public Hotel findBestHotel () {
        Hotel bestHotel = null;
        int maxParks = 0;
        for (Hotel hotel : hotels) {

        }
    }
}
