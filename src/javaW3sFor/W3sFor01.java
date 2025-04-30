package javaW3sFor;

public class W3sFor01 {
    /*
    * Statement 1 is executed (one time) before the execution of the code block.
    * Statement 2 defines the condition for executing the code block.
    * Statement 3 is executed (every time) after the code block has been executed.
    * The example below will print the numbers 0 to 4:*/
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
