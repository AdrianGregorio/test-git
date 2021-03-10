/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrián Rosón
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[]vector = null;
        //System.out.println(vector.length);
        vector = new double[25];
        System.out.println(vector.length);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce valor para la posicion " + i + ": ");
            vector[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(vector));
        Arrays.fill(vector, 99.9);
        System.out.println(Arrays.toString(vector));
    }
    
}
