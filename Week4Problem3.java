import java.util.Scanner;

public class Week4Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score (0-100): ");
        int testscore = scanner.nextInt();
        String grade;

        if (testscore >= 93 && testscore <= 100) {
            grade = "A";
        } else if (testscore >= 90) {
            grade = "A-";
        } else if (testscore >= 87) {
            grade = "B+";
        } else if (testscore >= 83) {
            grade = "B";
        } else if (testscore >= 80) {
            grade = "B-";
        } else if (testscore >= 77) {
            grade = "C+";
        } else if (testscore >= 73) {
            grade = "C";
        } else if (testscore >= 70) {
            grade = "C-";
        } else if (testscore >= 67) {
            grade = "D+";
        } else if (testscore >= 63) {
            grade = "D";
        } else if (testscore >= 60) {
            grade = "D-";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}
