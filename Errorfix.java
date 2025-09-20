package bencodes;

import java.util.Scanner;

public class Errorfix {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = userinput.nextInt();   // read an integer

        int futureAge = age + 5;
        System.out.println("In 5 years you will be " + futureAge + " years old.");

        boolean isTeen = (age >= 13 && age <= 19);
        System.out.println("It is " + isTeen + " that you are a teenager.");

        System.out.println("I am such a smart cookie.");

        userinput.close();
    }
}
