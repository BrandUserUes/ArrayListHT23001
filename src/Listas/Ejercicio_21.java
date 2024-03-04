
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_21 {

    public static void main(String[] args) {
        //Reemplazar el segundo elemento de un ArrayList:
        String remplazo = "Venusaur";
        int posicion = 2;

        ArrayList<String> pokemons = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        for (String pokemon : pokemons) {
            System.out.print(pokemon + " ,");

        }
           pokemons.set((posicion - 1), remplazo);
        
        
        System.out.println("\nRemplazado:");
        
     

        for (String pokemon : pokemons) {
            System.out.print(pokemon + " ,");

        }

    }
    
}
