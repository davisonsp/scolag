package model;
// Generated Oct 3, 2017 1:01:15 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String nombreContacto;
     private String telefono;
     private String correo;
     private char estado;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set insumoHasProveedors = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String nombre, String nombreContacto, String telefono, char estado, Date fechaCreacion) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }
    public Proveedor(String nombre, String nombreContacto, String telefono, String correo, char estado, Date fechaCreacion, Date fechaModificacion, Set insumoHasProveedors) {
       this.nombre = nombre;
       this.nombreContacto = nombreContacto;
       this.telefono = telefono;
       this.correo = correo;
       this.estado = estado;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.insumoHasProveedors = insumoHasProveedors;
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
    public String getNombreContacto() {
        return this.nombreContacto;
    }
    
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getInsumoHasProveedors() {
        return this.insumoHasProveedors;
    }
    
    public void setInsumoHasProveedors(Set insumoHasProveedors) {
        this.insumoHasProveedors = insumoHasProveedors;
    }




}


