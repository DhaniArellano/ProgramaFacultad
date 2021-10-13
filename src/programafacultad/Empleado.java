/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafacultad;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author STARTUP
 */
public class Empleado extends Persona {
    
    Despacho despacho;
    private Date fechaIncor;

    public Empleado() {
    }

    public Empleado(Despacho despacho, Date fechaIncor, String id, String nombre, String apellido, String eCivil) {
        super(id, nombre, apellido, eCivil);
        this.despacho = despacho;
        this.fechaIncor = fechaIncor;
        
    }
    
    public Despacho getDespacho(){
        return this.despacho; 
    }

    
    public String getEmpInfo(){
        String info;
        info = String.format("%s y está en el despacho %s y se incorporo el %s ",this.getNombre(),this.getDespacho() ,this.getFechaIncor() ); 
        return info;
    }

    public String getFechaIncor() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String strDate = formatter.format(fechaIncor); 
        return strDate;
    }

    public void setFechaIncor(Date fechaIncor) {
        this.fechaIncor = fechaIncor;
    }

    

    
    

}
