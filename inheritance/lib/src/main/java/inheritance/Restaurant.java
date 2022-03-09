package inheritance;
import java.util.LinkedList;
import java.util.List;

public class Restaurant implements reviewable {

        // Instance properties
        private String name;
        private int numOfStars;
        private double priceCategory;
        private LinkedList<Review> reviews;
        private List<Integer> starRate;

        // Constructor
        public Restaurant(String name, double priceCategory, int numOfStars) {
            this.name = name;
            this.numOfStars = 0;
            this.priceCategory = priceCategory;

        }

        public String getName() {
            return name;
        }

        @Override
        public void getStars() {

        }

        public int getNumOfStars() {
            return numOfStars;
        }

        public double getPrice() {
            return priceCategory;
        }

        // AddsReview method
        public void addReview(Review review){
            reviews.add(review);
        }

        @Override
        public LinkedList<Review> getReviews() {
            return this.reviews;
        }

        // Updates method
        public void updateRestaurantStars(int numStars) {
            this.starRate.add(numStars);
            Integer sum = 0;
            for (Integer star : starRate) {
                sum += star;
            }
                this.numOfStars = sum / starRate.size();
        }


        // Returns a string
        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + getName() + '\'' +
                    ", price=" + getPrice() +
                    ", numOfStars=" + getNumOfStars() +
                    ", reviewRestaurant=" + getReviews() +
                    '}';
        }
}
