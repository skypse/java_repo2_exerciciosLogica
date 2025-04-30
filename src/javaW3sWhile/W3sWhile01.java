package javaW3sWhile;

public class W3sWhile01 {
    public static void main(String[] args) {
        /*Loops:
        * Pode executar um bloco de código ao longo do tempo até que uma condição seja atingida*/
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // do while
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 5);

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("ihuuuuuu!!");
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("não foi dessa vez");
            } else {
                System.out.println("bingo!");
            }
            dice = dice + 1;
        }
    }
}
