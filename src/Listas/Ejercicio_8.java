
package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_8 {
    public static void main(String[] args) {
        //Ordenar el ArrayList:
        
        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        System.out.println("Sin ordenar");

        for (String pokemon : pokemons) {
            System.out.print(pokemon + "");

        }

        Collections.sort(pokemons);

        System.out.println("Ordenados alfabéticamente");
        for (String pokemon : pokemons) {
            System.out.print(pokemon + "");

        }
        
        
        
        
        
        
    }
    
}
