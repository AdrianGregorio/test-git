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
public class Contacto {

    private int id;
    private String nombre, tlfn;
    private static int contador;

    public Contacto(String nombre, String tf) throws Exception {
        if (nombre == null || nombre.isEmpty()){
            throw new Exception ("No se puede crear contacto sin nombre");
        }
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.tlfn = tf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTf(String tf) {
        this.tlfn = tf;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTlfn() {
        return tlfn;
    }
    
    
    
}
