/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.vectores;

import java.util.Arrays;

/**
 *
 * @author Adrián Rosón
 */
public class ListaAleatoria {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int random = 0;
        for (int i = 0; i < arr.length; i++) {
            do{
            random = 1 + (int)(Math.random() * ((10 - 1) + 1));
            } while (contains(arr, random));
            arr[i] = random;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static boolean contains(int[] arr, int n){
        for (int m: arr) {
            if (m == n){
                return true;
            }
        }
        return false;
    }
    
}
