
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejericio_5 {
    
    public static void main(String[] args) {
        //Actualizar un elemento del ArrayList con un elemento dado:
        
        String act_pokemon = "Dragonite";

        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        pokemons.add(1, act_pokemon);

        for (String pokemon : pokemons) {

            System.out.print(pokemon + ",");

        }
        System.out.println("\n");

    }
    
}
