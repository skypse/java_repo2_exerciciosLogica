package javaW3sStrings;

public class W3sString01 {
    public static void main(String[] args) {
        /*Java Strings:
        * String é utilizada para armazenar textos exemplo "Hello"*/
        String nome = "Gabriel";
        System.out.println(nome);

        /*String length
        * Uma string em java é basicamente um objeto, que contém métodos que conseguem performar operações
        * com  strings, por exemplo, qual o tamanho de uma string com o method 'length()'*/
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("O tamanho da string é: " + txt.length());

        /*Exemplo com 'toUpperCase' && 'toLowerCase'*/
        String teste = "Hello World";
        System.out.println(teste.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(teste.toLowerCase());   // Outputs "hello world"

        /*Achar o caractere na string
        * O method indexOf()
        * retorna o índice (a posição)  da primeira ocorrência de um texto especificado numa cadeia de
        * caracteres (incluindo espaços em branco)*/
        String txtExample = "Please locate where 'locate' occurs!";
        System.out.println(txtExample.indexOf("locate")); // Outputs 7
        /*String Concatenation:
        * O operador "+" pode ser utilizado para combinar as strings, isso é chamado de concatenação*/
        String primeiroNome = "Gabriel";
        String sobrenome = "do Amaral";
        System.out.println(primeiroNome + " " + sobrenome);
        System.out.println(primeiroNome.concat(" ").concat(sobrenome));
    }
}
