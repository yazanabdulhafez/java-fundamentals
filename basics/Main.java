import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
        clock();
    }

    public static String pluralize(String animal, int count) {
        if (count == 1) {
            return animal;
        } else {
            return animal + "s";
        }
    }


    public static void flipNHeads(int n) {
        int count = 0;
        int numberOfHeads = 0;
        while (numberOfHeads < n) {
            double number = Math.random();
            if (number < 0.5) {
                count = count + 1;
                numberOfHeads=0;
                System.out.println("tails");
            } else {
                numberOfHeads = numberOfHeads + 1;
                count = count + 1;
                System.out.println("heads");
            }
        }
        String output = "It took " + count + " flips to flip " + numberOfHeads + " head in a row.";
        System.out.println(output);

    }

    public static void clock() {

        int second = 1;
        int previousValue ;

        String time ;
        while (second >= 0) {
            LocalDateTime now = LocalDateTime.now();
            previousValue = second;
            second = now.getSecond();

            if (second != previousValue) {
                time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println("time" + time);
            }

        }
    }
}
