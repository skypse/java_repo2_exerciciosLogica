package javaW3sIfElse;

public class W3sIfElse02 {
    public static void main(String[] args) {
        /*O 'else if', é uma condição caso a primeira seja falsa*/
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
