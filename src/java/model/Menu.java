package model;
// Generated Nov 7, 2017 10:59:56 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Menu generated by hbm2java
 */
public class Menu  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String outcome;
     private char estado;
     private Set submenus = new HashSet(0);

    public Menu() {
    }

	
    public Menu(String nombre, String outcome, char estado) {
        this.nombre = nombre;
        this.outcome = outcome;
        this.estado = estado;
    }
    public Menu(String nombre, String outcome, char estado, Set submenus) {
       this.nombre = nombre;
       this.outcome = outcome;
       this.estado = estado;
       this.submenus = submenus;
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
    public String getOutcome() {
        return this.outcome;
    }
    
    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getSubmenus() {
        return this.submenus;
    }
    
    public void setSubmenus(Set submenus) {
        this.submenus = submenus;
    }




}


