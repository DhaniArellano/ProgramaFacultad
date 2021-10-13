/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafacultad;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author STARTUP
 */
public class Profesor extends Empleado {
    private Departamento depto;
    

    public Profesor() {
    }

    public Profesor(Departamento depto, Despacho despacho, Date fechaIncor, String id, String nombre, String apellido, String eCivil) {
        super(despacho, fechaIncor, id, nombre, apellido, eCivil);
        this.depto = depto;
    }



    

    
    
    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }
    public String devolverDpto(){
        return depto.getNomDepto();
    }
    public String devolverDesp(){
        return despacho.getNomDespacho();
    }
    public String getProfesorInfo(){
        String msg;
        msg = String.format("el profesor %s está asignado al dpto %s se incorporó %s ",this.getNombre(), this.devolverDpto(), this.getFechaIncor());
        return msg;
    }
    
}
