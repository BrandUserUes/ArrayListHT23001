
package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_17 {
    public static void main(String[] args) {
        
         //Vaciar un ArrayList:
        ArrayList<Character> pitagoras = new ArrayList<>(Arrays.asList('a', 'b', 'c'));

        for (Character pitagora : pitagoras) {
            System.out.print(pitagora + " ,");

        }

        pitagoras.clear();

        for (Character pitagora : pitagoras) {
            System.out.print(pitagora + " ,");

        }

    }
    
}
