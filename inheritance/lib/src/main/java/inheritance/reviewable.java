package inheritance;
import java.util.LinkedList;

public interface reviewable {
    String toString();
    void addReview(Review review);
    String getName();
    void getStars();
    LinkedList<Review> getReviews();
}
