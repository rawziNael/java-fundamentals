package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant {

    // Instance properties
    private String name;
    private double numOfStars;
    private double price;
    private LinkedList<Review> reviews;
    private List<Double> starRate;

    // Constructor
    public Restaurant(String name, double priceCategory, double numOfStars) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.price = priceCategory;
        this.reviews = new LinkedList();
        this.starRate = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public double getPrice() {
        return price;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
        updateRestaurantStars(review.getStars());
    }

    // Updates this instance of the Restaurant's star rating
    protected void updateRestaurantStars(double stars) {
        this.starRate.add(stars);
        double total = 0;
        for (double star : starRate) {
            total += star;
        }
        this.numOfStars = total / starRate.size();
    }

    // Returns a string

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", price=" + price +
                ", reviews=" + reviews +
                '}';
    }
}
