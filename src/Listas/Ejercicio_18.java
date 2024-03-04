package Listas;

import java.util.Arrays;
import java.util.ArrayList;

public class Ejercicio_18 {

    public static boolean vacio(ArrayList a) {

        if (a.isEmpty()) {
            return true;

        }

        return false;
    }

    public static void main(String[] args) {
        //Comprobar si un ArrayList está vacío o no:

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> nums_1 = new ArrayList<>(Arrays.asList());

        if (vacio(nums_1)) {
            System.out.println("Esta vacio");
        } else {
            System.out.println("No esta vacio");
        }

    }

}
