
package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio_19 {
    
    public static void main(String[] args) {
        
        //Reducir la capacidad de un ArrayList:
        ArrayList<String> normal = new ArrayList(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        System.out.println("Normal");
        for (String x : normal) {
            System.out.print(x + ",");

        }

        List<String> si = normal.subList(0, 3);

        ArrayList<String> reducido = new ArrayList<>(si);
        
        System.out.println("\nReducido");

        for (String x : reducido) {
            System.out.print(x + ",");

        }

        
        
    }
    
}
