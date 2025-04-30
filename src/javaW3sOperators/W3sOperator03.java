package javaW3sOperators;

public class W3sOperator03 {
    public static void main(String[] args) {
        /*Java Assignment Operators
        * É nos usamos o operador (=), para atribuir um valor para a variável*/
        int x1 = 10;
        System.out.println(x1);

        // Addition with assignment operator
        int x2 = 10;
        x2 += 5;
        System.out.println(x2);

        // Subtraction with assignment operator
        int x3 = 10;
        x3 -= 5;
        System.out.println(x3);

        // Multiplication with assignment operator
        int x4 = 10;
        x4 *= 5;
        System.out.println(x4);
        // Division with assignment operator
        int x5 = 10;
        x5 /= 5;
        System.out.println(x5);

        // Modulus with assignment operator
        int x6 = 5;
        x6 %= 2;
        System.out.println(x6);

        // &= (AND bit a bit)
        int a = 6; // binário: 110
        a &= 3; // 110 & 011 = 010
        System.out.println(a); // 2

        // |= (OR bit a bit com atribuição)
        int b = 6;  // binary: 110
        b |= 3;     // 110 | 011 = 111 (que é 7)
        System.out.println(b); // 7

        // ^= (XOR bit a bit com atribuição)
        int c = 6; // binário: 110
        c ^= 3;    // 110 ^ 011 = 101 (que é 5)
        System.out.println(c); // 5

        // >>= (Deslocamento à direita com atribuição)
        int d = 16; // binário: 100000
        d >>= 2;    // desloca 2 bits à direita 100 (que é 4)
        System.out.println(d); // 4

        // <<= (deslocamento à esquerda com atribuição)
        int e = 3; // binário: 11
        e <<= 2;   // desloca 2 bits à esquerda 1100 (que é 12)
        System.out.println(e); // 12
    }
}
