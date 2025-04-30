package javaW3sIfElse;

public class W3sIfElse01 {
    public static void main(String[] args) {
        /* Java Conditions e If Statements
        * menor que: a < b
        * menor que ou igual a: a <= b
        * maior que: a > b
        * maior que ou igual a: a >= b
        * igual a: a == b
        * não é igual a: a != b
        * */

        /* Java possui os seguintes estados condicionais:
        * Use 'if' to specify a block of code to be executed, if a specified condition is true
        * Use 'else' to specify a block of code to be executed, if the same condition is false
        * Use 'else if' to specify a new condition to test, if the first condition is false
        * Use 'switch' to specify many alternative blocks of code to be executed*/

        if (10 > 9)
        {
            System.out.println("10 é maior que 9");
        }

        int plyScore = 3;
        int scoreToPass = 5;
        if (plyScore < scoreToPass)
        {
            System.out.println("You don't have the enough points to pass, currently you have " + plyScore + " points.");
            System.out.println("You need " + (scoreToPass - plyScore) + " more points to pass.");
        } else
        {
            System.out.println("You passed!");
        }
    }
}
