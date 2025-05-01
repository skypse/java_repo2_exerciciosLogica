package javaW3sFor;

public class W3sFor04 {
    public static void main(String[] args) {
        /*Java Break Conditional Statement*/
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.println(i);
        }
        // Java Continue Conditional Statement
        for (int a = 1; a <= 10; a++)
        {
            if (a == 5)
            {
                continue;
            }
            System.out.println(a);
        }
    }
}
