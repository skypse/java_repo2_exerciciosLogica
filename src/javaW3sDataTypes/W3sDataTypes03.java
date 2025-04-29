package javaW3sDataTypes;

public class W3sDataTypes03 {
    public static void main(String[] args) {
        // Criando variáveis de tipos diferentes
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Números de item: " + items);
        System.out.println("Custo por item: " + costPerItem + currency);
        System.out.println("Custo total = " + totalCost + currency);
    }
}
