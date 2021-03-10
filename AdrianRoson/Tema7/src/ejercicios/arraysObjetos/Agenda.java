/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.arraysObjetos;

/**
 *
 * @author Adrián Rosón
 */
public class Agenda {

    public static int posicion = 0;
    private static int T;
    private Contacto[] agenda;
    
    public Agenda(int tamanio){
        T = tamanio;
        agenda = new Contacto[T];
    }
        
    public boolean isCompleta(){
        return posicion == T;
    }
    
    public String buscarPorNombre(String nombre){
        return buscar(nombre, null);
    }
    
    public String buscarPorTf(String tf){
        return buscar(null, tf);
    }
    
    public boolean anianir(Contacto c) {
        agenda[posicion] = c;
        posicion++;
        return true;
    }
    
    public Contacto getContacto(int posicion){
        return this.agenda[posicion];
    }
    
    private String buscar(String s1, String s2){
        boolean encontrado = false;
        int orden = 1;
        String resultado = "";
        
        for (int i = 0; i < posicion; i++) {
            if(s1 != null){
                if((agenda[i].getNombre().equalsIgnoreCase(s1))){
                    resultado += orden + ", " + agenda[i].toString() + "\n";
                    orden++;
                    encontrado = true;
                }
            } else if (s2 != null){
                if((agenda[i].getTlfn().equalsIgnoreCase(s2))){
                    resultado += orden + ", " + agenda[i].toString() + "\n";
                    orden++;
                    encontrado = true;
                }
            }
        }
        if(encontrado){
            return resultado;
        }else{
            return null;
        }
    }
    
}
