package javaW3sFor;

public class W3sForEach01 {
    public static void main(String[] args) {
        /*For-Each LOOP
        * Utilizado exclusivamente para passar atráves de elementos seja uma array or dataset
        * for (type variavelNome : arrayNome)*/

        String[] pokemons = {"Charmander", "Chikorita", "Pikachu"};
        for (String i : pokemons)
        {
            System.out.println(i);
        }
    }
}
