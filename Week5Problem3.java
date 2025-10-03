import java.util.Scanner;

public class Week5Problem3 {
    public static void main(String[] args) {
        System.out.print("Enter a number (3–20): ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        // Print the top header row
        System.out.print("+\t");
        for (int col = 1; col <= num; col++) {
            System.out.print(col + "\t");
        }
        System.out.println();

        // Print each row
        for (int row = 1; row <= num; row++) {
            System.out.print(row + "\t"); // row label
            for (int col = 1; col <= num; col++) {
                System.out.print((row + col) + "\t");
            }
            System.out.println(); // move to next line
        }
    }
}
