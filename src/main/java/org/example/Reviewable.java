package org.example;

import java.util.List;

public interface Reviewable {
    void addReview (Review review);
    List<Review> getReviews();
}
