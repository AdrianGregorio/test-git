/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.vectores;

/**
 *
 * @author Adrián Rosón
 */
public class Datos {

    private static double sumaPares(int[] a){
        double s = 0;
        for (int i = 0; i < a.length; i+=2) {
            System.out.println(a[i]);
            s += a[i];
        }
        return s;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(sumaPares(array));
        
    }
    
}
