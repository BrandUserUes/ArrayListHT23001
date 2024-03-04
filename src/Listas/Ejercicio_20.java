
package Listas;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejercicio_20 {
    
    public static void main(String[] args) {
        
        //Aumentar el tamaño de un ArrayList:
        
        ArrayList<String> pokemons= new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur"));
        
        pokemons.add(null);
        pokemons.add(null);
        
        
        for (String pokemon : pokemons) {
            System.out.println(pokemon+"");
            
        }
    }
    
}
