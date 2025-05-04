package javaW3sArray;

public class W3sArray04 {
    public static void main(String[] args) {
        /*Multimensional Arrays
        * As matrizes multidimensionais são úteis quando se pretende armazenar dados numa forma tabular,
        * como uma tabela com linhas e colunas.
        * Para criar uma matriz bidimensional, adicione cada matriz dentro do seu próprio conjunto de []:*/
        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        System.out.println(myNumbers[1][2]);

        // loop multidimensional
        for (int i = 0; i < myNumbers.length; i++){
            for (int j = 0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }

        // loop multidimensional for-each
        for (int[] test : myNumbers){
            for (int i : test){
                System.out.println(i);
            }
        }
    }
}
