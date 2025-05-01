package javaW3sArray;

public class W3sArray01 {
    public static void main(String[] args) {
        /*Arrays:
        * São utilizadas para guardar múltiplos valores em somente uma variável, invés de
        * declarar separadamente cada um dos valores. Como declarar um array: Exemplo abaixo:*/
        String[] jogos = {"Football", "Basketball", "Tennis"};
        int[] numeros = {1, 2, 3, 4, 5};
        // Acessando um valor do array
        System.out.println(jogos[0]);
        jogos[0] = "Fut Mesa";
        System.out.println(numeros[2]);
        System.out.println(jogos[0]);
        // Puxar o tamanho do array
        System.out.println(jogos.length);
        System.out.println(numeros.length);
    }
}
