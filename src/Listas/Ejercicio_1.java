
package Listas;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        // Crear un ArrayList, agregar nombres de Pokémon e imprima la colección:
        ArrayList<String> pokemons = new ArrayList<>();
        pokemons.addAll(Arrays.asList("Pikachu", "Charizard", "Bulbasur", "Squirtle", "Jigglypug"));

        for (String pokemon : pokemons) {

            System.out.println(pokemon);

        }

        
    }
    
    
}
