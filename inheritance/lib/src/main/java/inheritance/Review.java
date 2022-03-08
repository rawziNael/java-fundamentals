package inheritance;

public class Review {

    private String body;
    private int numOfStars;
    private String author;

    //constructor
    public Review(String body, String author, int numOfStars)
    {
        if ( numOfStars > 5 || numOfStars < 0 ){
            System.out.println("Error");
        }
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    //getters
    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    // Returns a string with this instance of the Review's info
    @Override
    public String toString() {
        return "Review{" +
                "reviewText='" + getBody() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", numOfStars=" + getNumOfStars() +
                '}';
    }
}
