/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosArrays;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Adrián Rosón
 */
public class Ejemplo2 {

    public static void main(String[] args) {
//        int[] array = {2, 5, 8, 9};
//        int pos = Arrays.binarySearch(array, 10);
//        System.out.println(pos);
        
        Persona[] personas = new Persona[5];
        System.out.println(Arrays.toString(personas));
        
        personas[0] = new Persona("Pepe", 20, "ñalkjsdf");
        personas[1] = new Persona("Maria", 18, "45asdf54");
        personas[2] = new Persona("Luis", 55, "a sdf654as");
        System.out.println(Arrays.toString(personas));
        
        // Buscar persona
        Arrays.sort(personas, 0, 3);
        System.out.println(Arrays.toString(personas));
        int pos = Arrays.binarySearch(personas, 0, 2, new Persona("Pepe", 20, "ñalkjsdf"));
        System.out.println(pos);
        
        // Ordenación descendente
        // Arrays.sort(personas, 0, 3, Collections.reverseOrder());
        // System.out.println(Arrays.toString(personas));
        
        // Probación de ordenes totales
        Arrays.sort(personas, 0, 3, new PersonaPorEdad());
        System.out.println(Arrays.toString(personas));
        
        Arrays.sort(personas, 0, 3, new PersonaPorDni());
        System.out.println(Arrays.toString(personas));
        
    }
    
}
