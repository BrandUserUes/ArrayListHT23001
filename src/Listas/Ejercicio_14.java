
package Listas;

import java.util.ArrayList;
import java.util.Arrays;


public class Ejercicio_14 {
    
    public static void main(String[] args) {
        //Intercambiar dos elementos en el ArrayList 0 -> 4, 4 <- 0
        String dato1="";
        String dato2="";
         ArrayList<String> pokemons
        = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
         
         System.out.println("Sin intercambiar");
        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }
         
         dato1= pokemons.get(0);
         dato2=pokemons.get(4);
       
         
         
          pokemons.set(0, dato2);
         pokemons.set(4, dato1);
         
         
         
         System.out.println("\nIntercambiados");
        for (String pokemon : pokemons) {
            System.out.print(pokemon + ",");

        }
        
         
         System.out.println("\n");
         
         
        
        
    }
            
            
}
