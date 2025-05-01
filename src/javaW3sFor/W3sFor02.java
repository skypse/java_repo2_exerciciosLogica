package javaW3sFor;

public class W3sFor02 {
    public static void main(String[] args) {
        // Nested Loops!
        // Outer loop
        for (int i = 1; i <= 2; i++)
        {
            System.out.println("Outer Loop: " + i); // 2 times

            // Inner loop
            for (int a = 1; a <= 3; a++ )
            {
                System.out.println("Inner Loop: " + a); // 3 times (2 * 3 = 6 times)
            }
        }
    }
}
