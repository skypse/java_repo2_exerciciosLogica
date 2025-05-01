package javaW3sArray;

public class W3sArray02 {
    public static void main(String[] args) {
        /*looping through an array*/
        String[] jogos = {"Football", "Basketball", "Tennis", "Ping-Pong"};
        for (int i = 0; i < jogos.length; i++){
            System.out.println(jogos[i]);
        }

        for (String a : jogos){
            System.out.println(a);
        }
    }
}
