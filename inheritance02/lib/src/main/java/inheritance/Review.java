package inheritance;

public class Review {

    private String body;
    private double stars;
    private String author;

    //constructor
    public Review(String body, String author, double stars) {
        if ( stars > 5 || stars < 0 ){
            System.out.println("Error");
        }
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //getters
    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public double getStars() {
        return stars;
    }

    // Returns a string with this instance of the Review's info
    @Override
    public String toString() {
        return "Review{" +
                "reviewText='" + getBody() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", numOfStars=" + getStars() +
                '}';
    }
}
