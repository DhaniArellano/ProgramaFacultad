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
public class Estudiante extends Persona {
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(Curso curso, String id, String nombre, String apellido, String eCivil) {
        super(id, nombre, apellido, eCivil);
        this.curso = curso;
    }

    public String devolverCurso(){
        return curso.getNombreCurso();
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getEstInfo(){
        String info;
        info = String.format("El estudiante %s está en el curso %s",this.getNombre(),this.devolverCurso()); 
        return info;
    }
    
    
    
    
}
    

