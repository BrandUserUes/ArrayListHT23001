
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_4 {
    
    public static void main(String[] args) {
        
        //Recuperar un elemento de un índice especificado:
        
        ArrayList<String> pokemons =
     new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax","Vulpix" ));
        
        System.out.println(pokemons.get(2));
        
        
    }
    
}
