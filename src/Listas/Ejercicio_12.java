
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_12 {
    public static void main(String[] args) {
        
        // Extraer una porción del ArrayList: 
                
    ArrayList<String> pokemons
        = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

    
        for (int i=1; i<=pokemons.size()-2; i++){
            System.out.println(pokemons.get(i)+"");
            
        }
    
    
        
        
        
    }
    
}
