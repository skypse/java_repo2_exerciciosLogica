package javaW3sDataTypes;

public class W3sDataTypes02 {
    public static void main(String[] args) {
        /*Números primitivos são divididos em 2 grupos:
        * - Os inteiros: Exemplo 123 ou -123
        *   - Tipos válidos
        *       - byte, short, int e long
        *
        * - O tipo das vírgulas flutuantes: são representados por números que podem ser fracionados
        * contendo um ou mais decimal.
        *   - Tipos válidos:
        *       - float e double
        * - Observação: mesmo possuindo muitos tipos numéricos em java os mais usados de forma comum é o
        * int para números inteiro e o double para números flutuantes.*/

        /*Tipos Inteiros Exemplo:
        * Byte: pode armazenar números inteiros de -128 a 127, pode ser utilizado no lugar de int para poupar memória*/
        byte myByte = 100;
        System.out.println(myByte);

        //Short: pode guardar números inteiros de -32768 até 32767
        short myShort = 5000;
        System.out.println(myShort);

        //Int: pode armazenar números inteiros de -2147483648 até 2147483647.
        int myInt = 100000;
        System.out.println(myInt);

        //Long: pode armazenar números inteiros -9223372036854775808 até 9223372036854775807.
        //Observação ao final do número necessita adicionar o 'L'
        long myLong = 15000000000L;
        System.out.println(myLong);

        /*Tipos das vírgulas flutuantes exemplos:
        * Deve se utilizar esse tipo sempre que precisar de um número decimal, como 9,99 ou 3,14515
        * Os dados do tipo float e double podem armazenar esses números fracionados, mas note-se que
        * devem terminar com um valor "F" para float e "D" para double*/
        float myFloat = 10.99f;
        System.out.println(myFloat);

        double myDouble = 10.99;
        System.out.println(myDouble);

        /*Usar o float ou double?
        * Bom a precisão do float é apenas de seis ou sete dígitos decimais, enquanto o double possui
        * um alcance de certa 16 dígitos, por isso na maioría dos casos para cálculo é utilizado double*/

        /*Número Científico:
        * Também é um dado que é virgula flutuante que pode ser um número científico que leva "E" no final dos números para indicar a potência de 10*/
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        /*Tipos Booleanos:
        * Bastante comum quando você precisa de dados que somente pode ser dois valores, exemplo:
        * - YES / NO
        * - ON / OFF
        * - TRUE / FALSE
        * Para o java só pode conter os valores TRUE OR FALSE*/
        boolean isJavaFun = false;
        boolean isPizzaTasty = false;
        System.out.println(isJavaFun);     // Outputs false
        System.out.println(isPizzaTasty);   // Outputs true

        /*Tipo char:
        * É utilizado para armazenar um character somente, precisa estar em volta de aspas simples 'A' or 'c'*/
        char myChar = 'A';
        System.out.println(myChar);
        // Há uma alternativa que você pode utilizar os valores ASCII values para mostrar os caracteres
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        /*Tipo de strings:
        * É utilizado para armazenar uma sequência de caracteres (text), os valores precisam estar em volta de "EXEMPLO"*/
        String greeting = "Hello World!";
        System.out.println(greeting);

        /*O tipo string é bastante utilizado no java e integrado em java que pode ser chamado de "nono tipo especial"
        * Uma string em java é, na verdade, um tipo de dados não primitivo, porque se refere a um objeto.*/
    }
}
