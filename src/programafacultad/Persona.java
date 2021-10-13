/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafacultad;

/**
 *
 * @author STARTUP
 */
public class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private String eCivil;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, String eCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eCivil = eCivil;
    }
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the eCivil
     */
    public String geteCivil() {
        return eCivil;
    }

    /**
     * @param eCivil the eCivil to set
     */
    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }
    
    
    
}
