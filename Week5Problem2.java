import java.util.Random;
import java.util.Scanner;

public class Week5Problem2 {
    public static void main(String[] args) {

        // Create objects for random numbers and user input
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String choice = "y";  // starting condition

        // Loop keeps running while the user wants to roll again
        while (choice.equalsIgnoreCase("y")) {

            // Roll two dice (each 1 to 6)
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;

            // Calculate and display results
            int sum = die1 + die2;
            System.out.println("You rolled:");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            // Ask if the user wants to roll again
            System.out.print("Roll again? (y/n): ");
            choice = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}
