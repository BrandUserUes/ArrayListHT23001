
package Listas;

import java.util.ArrayList;
import java.util.Arrays;


public class Ejercicio_7 {
    
    public static void main(String[] args) {
        
        //Buscar un elemento en el ArrayList indicar si se encuentra y en qué posición:
        String elm_buscado = "Squirtle";
        boolean encontrado=false;

        ArrayList<String> pokemons
                = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        for (int i = 0; i < pokemons.size(); i++) {

            if (pokemons.get(i).equals(elm_buscado)) {

                System.out.println("Se encontro: " + elm_buscado + "\nEn la posicion " + i);
                encontrado = true;
            }

        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el elemento " + elm_buscado);

        }

            

       
        }

         
    }
    

