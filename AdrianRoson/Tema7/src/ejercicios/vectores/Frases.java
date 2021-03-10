/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.vectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrián Rosón
 */
public class Frases {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] frases = new String[5];
        for (int i = 0; i < frases.length; i++) {
            System.out.println("Introduzca " + i);
            frases[i] = sc.nextLine();
        }
        System.out.println("Imprimiendo frases");
        imprimeFrases(frases);
        mayorFrase(frases);
        menorFrase(frases);
    }
    
    private static void imprimeFrases(String[] f){
        System.out.println(Arrays.toString(f));
    }
    
    private static void mayorFrase(String[] f){
        int mayorIndice = 0;
        int mayorTamanio = 0;
        for (int i = 0; i < f.length; i++) {
            int l = f[i].length();
            if (l > mayorTamanio){
                mayorTamanio = l;
                mayorIndice = i;
            }
        }
        System.out.println("Mayor Frase: " + f[mayorIndice]);
        System.out.println("Mayor Indice: " + mayorIndice);
    }
    
    private static void menorFrase(String[] f){
        int menorIndice = 0;
        int menorTamanio = -1;
        for (int i = 0; i < f.length; i++) {
            int l = f[i].length();
            if (l < menorTamanio || menorTamanio == -1){
                menorTamanio = l;
                menorIndice = i;
            }
        }
        System.out.println("Menor Frase: " + f[menorIndice]);
        System.out.println("Menor Indice: " + menorIndice);
    }
    
}
