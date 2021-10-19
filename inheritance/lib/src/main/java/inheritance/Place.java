package inheritance;

import java.util.ArrayList;

public class Place {

    private String name;
    private double numOfStars;
    private String priceCategory;
    private ArrayList<String> reviews=new ArrayList<>();


    public Place(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        StringBuilder finalPrice = new StringBuilder();
        if (priceCategory > 0) {
            finalPrice.append("$".repeat(priceCategory));
            this.priceCategory = finalPrice.toString();
        } else {
            this.priceCategory = "price not available";
        }

    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    private int starsTotal = 0;
    private int starsCount = 0;

    public void setNumOfStars(int numOfStars) {


        starsCount++;
        starsTotal += numOfStars;
        this.numOfStars = starsTotal / starsCount;


    }

    private boolean found = true;

    public void addReview(Review review) {
        int stars = review.getNumOfStars();
        if (reviews.isEmpty()) {

            if (stars >= 0 && stars <= 5) {
                setNumOfStars(stars);
                reviews.add(review.toString());
            }
        } else {

            for (int i = 0; i < reviews.size(); i++) {


                if (reviews.get(i).contains(review.getAuthor())) {
                    System.out.println("your review is already added");
                    found = false;
                    break;
                }

            }
            if (found) {

                if (stars >= 0 && stars <= 5) {
                    setNumOfStars(stars);
                    reviews.add(review.toString());
                }
            }

        }
    }

}
