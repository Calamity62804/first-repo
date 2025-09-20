package bencodes;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter x (decimal > 1): ");
        double x = sc.nextDouble();

        System.out.print("Enter y (decimal > 1): ");
        double y = sc.nextDouble();

        // Perform calculations
        double sum = x + y;
        double product = x * y;
        double division = x / y;
        double power = Math.pow(x, y);              // x^y
        double logBaseYofX = Math.log(x) / Math.log(y); // log base y of x

        // Show results
        System.out.println("x + y    = " + sum);
        System.out.println("x * y    = " + product);
        System.out.println("x / y    = " + division);
        System.out.println("x ^ y    = " + power);
        System.out.println("log_y(x) = " + logBaseYofX);

        sc.close();
    }
}
