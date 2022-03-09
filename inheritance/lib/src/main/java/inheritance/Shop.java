package inheritance;
import java.util.LinkedList;

public class Shop implements reviewable {
    // Instance properties
    private String name;
    private String description;
    private double price;
    private LinkedList<Review> reviews;


    // Constructor
    public Shop(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new LinkedList();
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void getStars() {

    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

}

