
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_11 {
    public static void main(String[] args) {
        //Invertir los elementos en el ArrayList:
        int indice = 0;
        String nueva;
        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        ArrayList<String> pokemos2 = new ArrayList<>();

        for (int i = pokemons.size() - 1; i >= 0; i--) {
            nueva = pokemons.get(i);

            pokemos2.add(indice, nueva);
            indice++;
            nueva = "";

        }

        System.out.println("\nArrayList invertido");

        for (String pokemon : pokemos2) {
            System.out.print(pokemon + ", ");

        }
            
           
           
           
           
        }
        

        
    }
    

