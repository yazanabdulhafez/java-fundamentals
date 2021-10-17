/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void restaurantWithNoReviewTest(){
        Restaurant testRestaurant=new Restaurant("MacDonald's");
        testRestaurant.setNumOfStars(1);
        testRestaurant.setPriceCategory(2);
        String expectedOutput="[Restaurant name: MacDonald's Total Rating out of five: 1.0 priceCategory: $$ Review []]";
    assertEquals(expectedOutput,testRestaurant.toString());
    }

    @Test void restaurantWithReviewTest(){
        Restaurant testRestaurant=new Restaurant("amman");
        testRestaurant.setPriceCategory(2);
        testRestaurant.addReview("yazan","not good restaurant",2);
        testRestaurant.addReview("rami","better restaurant ever",4);
        String expectedOutput="[Restaurant name: amman Total Rating out of five: 3.0 priceCategory: $$ Review [[Author: yazan , Body: \"not good restaurant\", Rating out of 5: 2], [Author: rami , Body: \"better restaurant ever\", Rating out of 5: 4]]]";
        assertEquals(expectedOutput,testRestaurant.toString());
    }

    @Test void reviewTest(){
        Review testReview=new Review("yazan","best restaurant ever",5);
        assertEquals("yazan",testReview.getAuthor());
        assertEquals("best restaurant ever",testReview.getBody());
        assertEquals(5.0,testReview.getNumOfStars());
    }
}
