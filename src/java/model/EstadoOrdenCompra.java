package model;
// Generated Nov 9, 2017 1:52:21 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoOrdenCompra generated by hbm2java
 */
public class EstadoOrdenCompra  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set ordenCompras = new HashSet(0);

    public EstadoOrdenCompra() {
    }

	
    public EstadoOrdenCompra(String nombre) {
        this.nombre = nombre;
    }
    public EstadoOrdenCompra(String nombre, Set ordenCompras) {
       this.nombre = nombre;
       this.ordenCompras = ordenCompras;
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
    public Set getOrdenCompras() {
        return this.ordenCompras;
    }
    
    public void setOrdenCompras(Set ordenCompras) {
        this.ordenCompras = ordenCompras;
    }




}


