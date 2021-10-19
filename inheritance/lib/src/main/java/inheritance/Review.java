package inheritance;

public class Review {
    private final String author;
    private final String body;
    private int numOfStars;

    public Review(String author, String body, int numOfStars) {
        this.author = author;
        this.body = body;

        if (numOfStars >= 0 && numOfStars <=5){
            this.numOfStars = numOfStars;
        } else {
            System.out.println("Please enter a number between 0 and 5");
            this.numOfStars=-1;
        }

    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getNumOfStars() {

        return numOfStars;

    }



    @Override
    public String toString() {

            return "[Author: " + getAuthor()
                    + " , Body: \"" + getBody()
                    + "\", Rating out of 5: "
                    + getNumOfStars() + "]";

    }
}
