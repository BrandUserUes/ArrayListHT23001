
package Listas;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejericio_13 {
    
    public static boolean comparar(ArrayList a, ArrayList b) {
        boolean comparacion = false;
        int mayor;

        if (a.size() > b.size()) {
            mayor = a.size();
        } else {
            mayor = b.size();

        }

        for (int i = 0; i < mayor; i++) {

            if (a.get(i).equals(b.get(i))) {
                comparacion = true;
            }

        }

        return comparacion;
    }

    public static void main(String[] args) {

        //Comparar dos ArrayLists:
        ArrayList<String> conjunto1 = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur"));
        ArrayList<String> conjunto2 = new ArrayList<>(Arrays.asList("Bulbasaur", "Squirtle", "Jigglypuff"));

        if (comparar(conjunto1, conjunto2)) {
            System.out.println("Son iguales");

        } else {

            System.out.println("Los conjuntos son diferentes");
        }


    }
    
}
