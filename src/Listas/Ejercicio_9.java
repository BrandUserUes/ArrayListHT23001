
package Listas;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejercicio_9 {
    public static void main(String[] args) {
        
        //Copiar un ArrayList en otro:
        
        ArrayList<String> colores= new ArrayList<>(Arrays.asList("Amarillo","Rojo","Morado"));
        
        ArrayList<String> colores2= new ArrayList<>(colores);
        
         System.out.println("Original:");
        for (String color : colores) {
            System.out.print(color+", ");
            
        }
        
        System.out.println("\nCopia:");
          for (String color : colores2) {
            System.out.print(color+", ");
        }
          System.out.println("\n");
        
        
    }
    
    
}
