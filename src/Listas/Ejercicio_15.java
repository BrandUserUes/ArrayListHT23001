
package Listas;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_15 {

    public static void main(String[] args) {
        //Unir dos ArrayLists:

        ArrayList<String> conjunto1 = new ArrayList(Arrays.asList("Pikachu", "Charizard", "Bulbasaur"));
        ArrayList<String> conjunto2 = new ArrayList(Arrays.asList("Squirtle", "Jigglypuff"));

        System.out.println("Conjunto 1");
        for (String y : conjunto1) {
            System.out.print(y + ", ");

        }

        System.out.println("\nConjunto 2");
        for (String x : conjunto2) {
            System.out.print(x + ", ");

        }
        conjunto1.addAll(conjunto2);
        System.out.println("\nConjuntos unidos");

        for (String u : conjunto1) {
            System.out.print(u + ", ");

        }
        System.out.println("\n");


        
        
    }
    
}
