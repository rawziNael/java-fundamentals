package inheritance;

import java.util.LinkedList;

public interface Reviewable{
    String toString();
    void addReview(Review review);
    LinkedList<Review> getReviews();
}
