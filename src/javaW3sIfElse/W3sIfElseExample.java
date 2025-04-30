package javaW3sIfElse;

public class W3sIfElseExample {
    public static void main(String[] args) {
        int doorCode = 007;
        if (doorCode == 123) {
            System.out.println("Correct code!");
        } else {
            System.out.println("Wrong code!");
        }

        int yourNumber = 10;
        if (yourNumber > 0)
        {
            System.out.println("Your number is positive.");
        } else if (yourNumber < 0)
        {
            System.out.println("Your number is negative.");
        } else
        {
            System.out.println("Your number is zero.");
        }

        int myAge = 25;
        if (myAge >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }

        int myNum = 5;
        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }
    }
}
