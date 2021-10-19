package inheritance;

public class Restaurant extends Place {


    public Restaurant(String name) {
        super(name);

    }


    @Override
    public String toString() {
        if (getNumOfStars() == 0.0) {
            return "[Restaurant name: " +getName() + " Total Rating out of five: " +
                    getNumOfStars() + " priceCategory: " + getPriceCategory() + " Review:there is no review " + "]";
        } else {
            return "[Restaurant name: " + getName() + " Total Rating out of five: " +
                    getNumOfStars() + " priceCategory: " + getPriceCategory() + " Review " + getReviews() + "]";
        }


    }
}
