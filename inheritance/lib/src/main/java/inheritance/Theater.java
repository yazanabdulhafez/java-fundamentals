package inheritance;

import java.util.ArrayList;

public class Theater extends Place {

    private ArrayList<String> moviesList = new ArrayList<>();


    public Theater(String name) {
        super(name);

    }


    public ArrayList<String> getMoviesList() {
        return moviesList;
    }



    public void addMovie(String movieName){
        boolean notFound= true;
        for (String s : moviesList) {
            if (s.contains(movieName)) {
                System.out.println("Movie already in the list");
                notFound= false;
                break;
            }
        }
        if (notFound) {
            moviesList.add(movieName);
        }
    }

    public void removeMovie(String movieName){
        moviesList.remove(movieName);
    }


    private boolean found = true;

    public void addMovieReview(Review review,String movieName) {
        String newReview = "{Author: " + review.getAuthor()
                + ", body: " + review.getBody()  + ", Rate: "
                + review.getNumOfStars()+  ", Watched movie: "
                + movieName + "}";
        int stars = review.getNumOfStars();
        if (getReviews().isEmpty()) {

            if (stars >= 0 && stars <= 5) {
                setNumOfStars(stars);
                getReviews().add(newReview);
            }
        } else {

            for (int i = 0; i < getReviews().size(); i++) {


                if (getReviews().get(i).contains(review.getAuthor())) {
                    System.out.println("your review is already added");
                    found = false;
                    break;
                }

            }
            if (found) {

                if (stars >= 0 && stars <= 5) {
                    setNumOfStars(stars);
                    getReviews().add(newReview);
                }
            }

        }
    }

    public String toString(){
        return "[name: "+getName()+" stars: "+
                getNumOfStars()+" movies: "+getMoviesList()+" reviews: "+getReviews()+"]";
    }

}
