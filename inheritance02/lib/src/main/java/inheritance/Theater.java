package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater implements Reviewable {
    private String name;
    private LinkedList<String> movies;
    private LinkedList<Review> reviews;


    public Theater(String name) {
        this.name = name;
        this.movies = new LinkedList<>();
        this.reviews = new LinkedList<>();
    }

    public LinkedList<String> getMoviesList() {
        return movies;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public String movieString(LinkedList<String> movieString)
    {
        String result = "";
        for (int i = 0; i < movieString.size(); i++) {
            result += movieString.get(i);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }
}


