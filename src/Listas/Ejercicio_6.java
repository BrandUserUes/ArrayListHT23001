
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        //Eliminar el tercer elemento del ArrayList:
        
        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

         pokemons.remove(2);
         
         for (String pokemon : pokemons) {
             System.out.print(pokemon+",");
            
        }
         System.out.println("\n");
        
    }
    
}
