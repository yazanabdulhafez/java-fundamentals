package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private final String name;
    private double numOfStars;
    private String priceCategory;
    private final ArrayList<String> customersReviews = new ArrayList<>();


    public Restaurant(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public ArrayList<String> getCustomersReviews() {
        return customersReviews;
    }

    public void setPriceCategory(int price) {
        StringBuilder finalPrice = new StringBuilder();
        if (price > 0) {
            finalPrice.append("$".repeat(price));
            this.priceCategory = finalPrice.toString();
        } else {
            this.priceCategory = "price not available";
        }

    }
    private int starsTotal = 0;
    private int starsCount = 0;
    public void setNumOfStars(int numOfStars) {


            starsCount++;
            starsTotal += numOfStars;
            this.numOfStars = starsTotal/starsCount;


    }
    private boolean found=true;
    public void addReview(String author, String body, int numOfStars){

        if (customersReviews.isEmpty()){
            Review review=new Review(author,body,numOfStars);
            if (numOfStars>=0&&numOfStars<=5) {
                setNumOfStars(numOfStars);
                customersReviews.add(review.toString());
            }
        }else {

            for (int i = 0; i <customersReviews.size() ; i++) {


                if (customersReviews.get(i).contains(author)) {
                    System.out.println("your review is already added");
                    found=false;
                    break;
                }

            }
                if (found) {
                    Review review = new Review(author, body, numOfStars);
                    if (numOfStars >= 0 && numOfStars <= 5) {
                        setNumOfStars(numOfStars);
                        customersReviews.add(review.toString());
                    }
                }

        }
        }



    @Override
    public String toString() {
        if (numOfStars == 0.0) {
            return "[Restaurant name: " + name + " Total Rating out of five: " +
                    numOfStars + "priceCategory: " + priceCategory + " Review:there is no review " + "]";
        } else {
            return "[Restaurant name: " + name + " Total Rating out of five: " +
                    numOfStars + " priceCategory: " + priceCategory + " Review " + customersReviews + "]";
        }


    }
}
