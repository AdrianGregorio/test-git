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
 * Orden total DNI
 */
public class PersonaPorDni implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
    
}
