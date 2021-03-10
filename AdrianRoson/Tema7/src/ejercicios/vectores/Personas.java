/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.vectores;

import java.util.Scanner;

/**
 *
 * @author Adrián Rosón
 */
public class Personas {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] personas = new String[20];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introduzca " + i);
            personas[i] = sc.nextLine();
        }
        System.out.println("Imprimiendo personas (wtf? xD)");
        imprimePersonas(personas);
        System.out.println("Imprimiendo pares");
        pares(personas);
    }
    
    private static void imprimePersonas(String[] p){
        for (String persona: p){
            System.out.println(persona);
        }
    }
    
    private static void pares(String[] p){
        boolean isPar = true;
        for (String persona: p) {
            if (isPar){
                System.out.println(persona);
            }
            isPar = !isPar;
        }
    }
    
}
