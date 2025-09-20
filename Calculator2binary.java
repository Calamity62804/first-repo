package bencodes;
import java.util.Scanner;

public class Calculator2binary {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input binary numbers as strings
            System.out.print("Enter first binary number (x): ");
            String xStr = sc.nextLine();

            System.out.print("Enter second binary number (y): ");
            String yStr = sc.nextLine();

            // Convert binary strings to integers
            int x = Integer.parseInt(xStr, 2);
            int y = Integer.parseInt(yStr, 2);

            // Perform operations
            int sum = x + y;
            int diff = x - y;
            int prod = x * y;
            int quot = x / y; // integer division

            // Print results in binary
            System.out.println("x + y = " + Integer.toBinaryString(sum));
            System.out.println("x - y = " + Integer.toBinaryString(diff));
            System.out.println("x * y = " + Integer.toBinaryString(prod));
            System.out.println("x / y = " + Integer.toBinaryString(quot));

            sc.close();
        }
    }