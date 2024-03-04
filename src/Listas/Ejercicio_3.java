
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        //Insertar un elemento en el ArrayList en la primera posición:

        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        System.out.println("Pokemóns:");
        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }
        System.out.println("\n");

        pokemons.add(0, "Pikachu");

        System.out.println("Pokemóns(agregando a 'Pikachu'): ");
        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }

        
        
    }
            
    
}
