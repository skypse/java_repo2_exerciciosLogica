package javaW3sOperators;

public class W3sOperator05 {
    public static void main(String[] args) {
        // && (and)
        int a1 = 5;
        int b1 = 3;
        int c1 = 10;
        System.out.println(a1 > b1 && a1 < c1); // retorna true, porque 5 é maior que 3 e 5 é menor que 10
        // || (or)
        int a2 = 5;
        int b2 = 3;
        int c2 = 4;
        System.out.println(a2 > b2 || a2 < c2); // retorna true, porque uma das condições são verdadeiras!
        // 5 é maior que 3, mas 5 não é menor que 4.
        // ! (not)
        int a3 = 5;
        int b3 = 3;
        int c3 = 10;
        System.out.println(!(a3 > b3 && a3 < c3)); // retorna false, porque '! (not)' é utilizado para inverter o resultado
    }
}
