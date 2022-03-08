package inheritance;
import java.util.LinkedList;

public interface RestaurantReview{
    String toString();
    void addReview(Review review);
    String getName();
    void getStars();
    LinkedList<Review> getReviews();
}
