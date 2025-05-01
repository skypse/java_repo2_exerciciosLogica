package javaW3sArray;

public class W3sArray03 {
    public static void main(String[] args) {
        // array de idades
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        int lowestAge = ages[0];

        // pegar a length da array
        int length = ages.length;

        // percorrendo a array
        for (int age : ages){
            sum += age;
            if (lowestAge > age){
                lowestAge = age;
            }
        }

        // calculando a média de idades dividindo pelo tamanho da array
        avg = sum / length;
        System.out.println("A média de idade é: " + avg + " anos");
        System.out.println("A menor idade na array é: " + lowestAge + " anos");
    }
}
