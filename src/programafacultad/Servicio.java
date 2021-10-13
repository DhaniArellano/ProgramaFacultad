/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafacultad;

import java.util.Date;

/**
 *
 * @author STARTUP
 */
public class Servicio extends Empleado {
    private Seccion sec;

    public Servicio() {
    }

    public Servicio(Seccion sec, Despacho despacho, Date fechaIncor, String id, String nombre, String apellido, String eCivil) {
        super(despacho, fechaIncor, id, nombre, apellido, eCivil);
        this.sec = sec;
    }

    

    public Seccion getSec() {
        return sec;
    }

    public void setSec(Seccion sec) {
        this.sec = sec;
    }
    public String devolverSec(){
        return sec.getNomSeccion();
    }
    public String devolverDesp(){
        return despacho.getNomDespacho();
    }
    public String getServInfo(){
        String msg;
        msg = String.format("El Empleado de servicio %s está asignado al la seccion %s se incorporó %s ",this.getNombre(), this.devolverSec(), this.getFechaIncor());
        return msg;
    }

    
    
}
