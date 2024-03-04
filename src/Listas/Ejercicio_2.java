
package Listas;
import java.util.Arrays;
import java.util.ArrayList;


public class Ejercicio_2 {
    public static void main(String[] args) {
       
        
       // Recorrer e imprimir todos los elementos en un ArrayList:
       
        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"));

        ArrayList<Integer> numeros
                = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ArrayList<Character> letras
                = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));
        
        
        System.out.println("Pokemóns");
        for (String pokemon : pokemons) {
            System.out.print(pokemon+",");
            
        }
         System.out.println("\nNúmeros");
        for (int numero : numeros) {
            System.out.print(numero+",");
            
        }
         System.out.println("\nLetra");
        for (Character letra : letras) {
            System.out.print(letra+",");
            
        }
        System.out.println("\n");
        
        
        
    }
    
}
