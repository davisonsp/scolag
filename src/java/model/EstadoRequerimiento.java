package model;
// Generated Oct 31, 2017 7:02:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoRequerimiento generated by hbm2java
 */
public class EstadoRequerimiento  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set requerimientos = new HashSet(0);

    public EstadoRequerimiento() {
    }

	
    public EstadoRequerimiento(String nombre) {
        this.nombre = nombre;
    }
    public EstadoRequerimiento(String nombre, Set requerimientos) {
       this.nombre = nombre;
       this.requerimientos = requerimientos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getRequerimientos() {
        return this.requerimientos;
    }
    
    public void setRequerimientos(Set requerimientos) {
        this.requerimientos = requerimientos;
    }




}


