package javaW3sTypeCasting;

public class W3sTypeCasting {
    public static void main(String[] args) {
        /*Java Type Casting
        * É uma conversão de tipos quando se atribui um valor de um tipo de dados primitivo
        * a outro tipo.
        *
        * Em java existe 2 tipos de casting
        * 1- Casting de ampliação (Widening Casting)
        *   - Convertendo um tipo menor para um tipo de tamanho maior:
        *     - byte -> short -> char -> int -> long -> float -> double
        * 2- Casting de diminuição (Narrowing Casting)
        *   - Convertendo um tipo maior para um tipo de tamanho menor
              - double -> float -> long -> int -> char -> short -> byte*/
        // Widening Casting
        // É feita automaticamente quando se passa um tipo de tamanho mais pequeno para um tipo de tamanho maior!
        // Exemplo:
        int myInt = 10;
        double myDouble = myInt; // automaticamente convertendo o int para double
        System.out.println(myInt);      // Output: 10
        System.out.println(myDouble);   // Output: 10.0

        // Narrowing Casting
        // Deve ser feito manualmente colocando o tipo do dado entre () na frente do valor que se deseja converter
        // Exemplo:
        double myDouble2 = 10.98d;
        int myInt2 = (int) myDouble2; // Casting manual de double para int
        System.out.println(myDouble2);  // Output: 10.98
        System.out.println(myInt2);     // Output: 10
    }
}
