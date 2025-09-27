
import java.util.Scanner;

public class Week4Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for age
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Ask about mood
        System.out.print("How are you doing today? ");
        String mood = scanner.nextLine().toLowerCase();

        // Give responses based on input
        if (age < 13 && mood.contains("good")) {
            System.out.println("Glad to hear that! Enjoy being a kid while it lasts!");
        } else if (age >= 13 && age <= 19 && mood.contains("tired")) {
            System.out.println("Teen life can be exhausting — make sure to rest up!");
        } else if (age >= 20 && age <= 30 && mood.contains("great")) {
            System.out.println("Awesome! Your 20s are a great time to chase your dreams.");
        } else if (age > 30 && mood.contains("okay")) {
            System.out.println("Life can get busy, but you’re doing fine. Keep going!");
        } else if (mood.contains("bad") || mood.contains("sad")) {
            System.out.println("Sorry you’re feeling that way. Things will get better soon!");
        } else {
            System.out.println("Thanks for sharing! Have a wonderful day.");
        }

        scanner.close();




    }
}
