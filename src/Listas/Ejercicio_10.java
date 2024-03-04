
package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Ejercicio_10 {
    
    public static void main(String[] args) {
        //Mezclar los elementos en el ArrayList:

        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        System.out.println("Normal: ");

        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }
        Collections.shuffle(pokemons);

        System.out.println("\nMezclado: ");

        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }
        System.out.println("\n");
          
          
          
          
        
    }
    
}
