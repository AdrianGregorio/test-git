/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosArrays;

import java.util.Comparator;

/**
 * @author Adrián Rosón
 * 
 * Orden total por edad
 */
public class PersonaPorEdad implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getEdad() - o2.getEdad();
    }

}
