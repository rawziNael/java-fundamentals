package inheritance;
import java.util.LinkedList;

public class Theater implements reviewable{
    private String name;
    private LinkedList<String> showingMovies;
    private LinkedList<Review> reviews;

    public Theater(String name) {
        this.name = name;
        this.showingMovies = new LinkedList<>();
        this.reviews = new LinkedList<>();
    }
    //addMovie
    public void addMovie(String movie) {
        showingMovies.add(movie);
    }

    // remove movie
    public void removeMovie(String movie) {
        showingMovies.remove(movie);
    }

    //String movie
    public String movieString(LinkedList<String> movieString)
    {
        String result = "";
        for (int i = 0; i < movieString.size(); i++) {
            result += movieString.get(i);
        }

        return result;
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
        return "Theater{" +
                "name='" + name + '\'' +
                ", showingMovies=" + showingMovies +
                ", reviews=" + reviews +
                '}';
    }
}
