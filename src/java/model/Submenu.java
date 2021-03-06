package model;
// Generated Nov 13, 2017 12:33:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Submenu generated by hbm2java
 */
public class Submenu  implements java.io.Serializable {


     private SubmenuId id;
     private Menu menu;
     private String nombre;
     private String outcome;
     private char estado;
     private Set perfilHasSubmenus = new HashSet(0);

    public Submenu() {
    }

	
    public Submenu(SubmenuId id, Menu menu, String nombre, String outcome, char estado) {
        this.id = id;
        this.menu = menu;
        this.nombre = nombre;
        this.outcome = outcome;
        this.estado = estado;
    }
    public Submenu(SubmenuId id, Menu menu, String nombre, String outcome, char estado, Set perfilHasSubmenus) {
       this.id = id;
       this.menu = menu;
       this.nombre = nombre;
       this.outcome = outcome;
       this.estado = estado;
       this.perfilHasSubmenus = perfilHasSubmenus;
    }
   
    public SubmenuId getId() {
        return this.id;
    }
    
    public void setId(SubmenuId id) {
        this.id = id;
    }
    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
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
    public Set getPerfilHasSubmenus() {
        return this.perfilHasSubmenus;
    }
    
    public void setPerfilHasSubmenus(Set perfilHasSubmenus) {
        this.perfilHasSubmenus = perfilHasSubmenus;
    }




}


