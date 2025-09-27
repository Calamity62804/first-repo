import java.util.Scanner;
public class Week4Problem2

    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask for x
        System.out.print("Enter a number x: ");
        double x = scanner.nextDouble();
        double result;

        // Piecewise definition
        if (x < 0) {
            result = 3 * x + 7;
        } else if (x <= 10) { // means 0 <= x <= 10
            result = x * x + 8;
        } else { // x > 10
            result = x * x * x - 6 * x * x;
        }

        // Output
        System.out.println("f(" + x + ") = " + result);

        scanner.close();


    }
}
