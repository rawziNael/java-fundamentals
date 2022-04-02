package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewable{
    private String name;
    private String description;
    private String price;
    protected LinkedList<Review> reviews;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new LinkedList();
    }

    // Add review method
    public void addReview(Review review) {
        reviews.add(review);
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
