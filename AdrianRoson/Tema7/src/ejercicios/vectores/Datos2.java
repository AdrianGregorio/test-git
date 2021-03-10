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
public class Datos2 {

    public static void main(String[] args) {
        int[] array = {1, 89, 8546, 31, 45464, 543, 645, 21, 354, 94};
        
        int cuenta = 0;
        int suma = 0;
        for (int i = 0; i < array.length; i+=2) {
            if (array[i] % 2 == 0){
                System.out.println(i + ":" + array[i]);
                cuenta++;
                suma += array[i];
            }
        }
        System.out.println("-----\nSuma: " + suma + "\nCuenta: " + cuenta);
    }
    
}
