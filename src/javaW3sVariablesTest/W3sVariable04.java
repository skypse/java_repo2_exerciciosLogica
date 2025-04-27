package javaW3sVariablesTest;

public class W3sVariable04 {
    public static void main(String[] args) {
        /*
        * Identifiers
        * Em Java as variáveis tendem ser identificadas com nomes únicos.
        * Esses nomes únicos podem ser curtos ou longos.
        * — > Exemplos de variáveis curtas (x ou y)
        * — > Exemplos de variáveis longas/explicativas (nomeCompleto ou nomeDoUsuario)
        * */
        // Exemplo bom
        int minutosPorHora = 60;

        // Exemplo OK, mas não é tão explicativa e por isso não é tão recomendado
        int m = 60;
        /*
        * Regras gerais para nomear as variáveis são:
        * 1- Nomes podem conter letras, dígitos, sublinhado e o sinal de $dollar
        * 2- Nomes precisam começar com uma letra
        * 3- Nomes deveria começar com uma letra minúscula, e não pode conter espaços em branco
        * 4- Nomes também podem começar com símbolo do dollar('$') e sublinhado ('_')
        * 5- Nomes são case-sensitive ("myVar" e "myvar" são diferentes)
        * 6- Atento a palavras reservadas do Java (exemplo, int, float, char) não podem ser usada como variáveis.
        * */
    }
}
