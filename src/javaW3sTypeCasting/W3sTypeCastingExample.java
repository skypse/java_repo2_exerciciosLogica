package javaW3sTypeCasting;

public class W3sTypeCastingExample {
    public static void main(String[] args) {
        // maximum score
        int maxScore = 200;
        // actual score
        int actualScore = 63;
        /*Calculando a porcentagem de pontos do usuário em relação com o maximo de pontos disponíveis.
        * Convertendo o actualScore para float para ter certeza que a divisão vai funcionar corretamente.*/
        float percentage = (float) actualScore / maxScore * 100.0f;
        System.out.println(percentage);
    }
}
