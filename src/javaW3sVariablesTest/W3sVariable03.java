package javaW3sVariablesTest;

public class W3sVariable03 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        // você pode simplificar escrevendo:
        int x2 = 5, y2 = 6, z2 = 51;
        System.out.println(x2 + y2 + z2);

        // também é possivel colocar o mesmo valor para as variáveis dessa forma:
        int x3, y3, z3;
        x3 = y3 = z3 = 50;
        System.out.println(x3 + y3 + z3);
    }
}
