# java-fundamentals

## files/methods contained within this repo

### 1. basics

#### methods contained within the file

Main :

pluralize : Method that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

flipNHeads: Method that accepts an integer n and flips coins until n heads are flipped in a row. flipping a coin by choosing a random number between 0 and 1. Numbers below 0.5 are considered tails. Numbers at and above 0.5 are considered heads.

clock: Method that print out the current time to the console each second.

### 2. basiclibrary

#### methods contained within basiclibrary

Library:

Rolling Dice: a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

containsDuplicates:a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

calculateAverage: a method that accepts an array of integers and calculates and returns the average of all the values in the array.

getBackLowAvgArray:a method calculate the average value for each array in the main array and return the array with the lowest average.

analyzingWeatherData:
Use the October Seattle weather data. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

Tally:a method that accepts a List of Strings representing votes and returns one string to show what got the most votes.

### 3.JavaScript Linter

#### methods contained within Linter

linter:a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

### 4.Inheritance and Interfaces

#### Methods contained within this lab

#### **Place**

* Methods:

  * `getName()`
    * returns the name
  * `getNumOfStars()`
    * returns the double value of the stars
  * `getPriceCategory`
    * returns the price category
  * `addReview(Review review)`
    * adds a new review to the reviews ArrayList
  * `setPriceCategory(int price)`
    * return the price as string of $
  * `setNumOfStars(int numOfStars)`
    * set the average rating as reviews added

#### **Restaurant**

* Methods:
  
  * `toString()`
    * Returns a formated string for the restaurant

#### **Review**

* Methods:
  * `getBody()`
    * returns the body of the review
  * `getAuthor()`
    * returns the author
  * `getNumOfStars()`
    * returns the stars
  * `toString()`
    * returns the review as an organized string

#### **Shop**

* Methods:
  * `getDescription()`
    * returns the description of the shop
  * `toString()`
    * returns the review of shop as an organized string

#### **Theater**

* Methods:
  * `getMoviesList()`
    * returns the movies in the moviesList
  * `addMovie(String movieName)`
    * Add movie to movieList
  * `removeMovie(String movieName)`
    * remove movie from movieList
  * `addMovieReview(Review review,String movieName)`
    * add review which contain movie
  * `toString()`
    * returns the review of theater as an organized string

**you can test this code by running ./gradlew test.Also you can copy this code on intllij and run it.**
