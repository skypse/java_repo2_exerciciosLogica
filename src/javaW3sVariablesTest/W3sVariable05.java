package javaW3sVariablesTest;

public class W3sVariable05 {
    public static void main(String[] args) {
        /*
        * Exemplo 01
        * → Geralmente no dia a dia, nós simplificamos os nomes das variáveis para fazer sentido com o tipo que foi setado para ela,
        * (exemplo: myInt or myNum ser para uma variável do tipo INT; myChar para variáveis do tipo CHAR...)
        * */
        // Dados do estudante:
        String nomeEstudante = "Gustavo Teixeira";
        int estudanteID = 1;
        int estudanteIdade = 19;
        float estudanteMensalidade = 75.25f;
        char estudanteNota = 'A';
        // Mostrar as variáveis:
        System.out.println("Nome do estudante: " + nomeEstudante);
        System.out.println("ID do estudante: " + estudanteID);
        System.out.println("Idade do estudante: " + estudanteIdade);
        System.out.println("Mensalidade do estudante: " + estudanteMensalidade);
        System.out.println("Nota do estudante: " + estudanteNota);

        /*
        * Exemplo 02
        * → Calcule a área de um retângulo:
        * */
        // variáveis:
        int length = 4;
        int width = 6;
        int area;

        // calcule a área do retângulo:
        area = length * width;
        System.out.println("A área do retângulo é: " + area);
    }
}
