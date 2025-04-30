package javaW3sBoolean;

public class W3sBoolean {
    public static void main(String[] args) {
        /* YES/NO
        *  ON/OFF
        *  TRUE/FALSE*/

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
