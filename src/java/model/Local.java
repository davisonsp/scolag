package model;
// Generated Oct 3, 2017 1:01:15 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Local generated by hbm2java
 */
public class Local  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String coordenadas;
     private char estado;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set localHasInsumos = new HashSet(0);
     private Set abastecimientosForLocalIdDestino = new HashSet(0);
     private Set abastecimientosForLocalIdOrigen = new HashSet(0);

    public Local() {
    }

	
    public Local(String nombre, String coordenadas, char estado, Date fechaCreacion) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }
    public Local(String nombre, String coordenadas, char estado, Date fechaCreacion, Date fechaModificacion, Set localHasInsumos, Set abastecimientosForLocalIdDestino, Set abastecimientosForLocalIdOrigen) {
       this.nombre = nombre;
       this.coordenadas = coordenadas;
       this.estado = estado;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.localHasInsumos = localHasInsumos;
       this.abastecimientosForLocalIdDestino = abastecimientosForLocalIdDestino;
       this.abastecimientosForLocalIdOrigen = abastecimientosForLocalIdOrigen;
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
    public String getCoordenadas() {
        return this.coordenadas;
    }
    
    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
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
    public Set getLocalHasInsumos() {
        return this.localHasInsumos;
    }
    
    public void setLocalHasInsumos(Set localHasInsumos) {
        this.localHasInsumos = localHasInsumos;
    }
    public Set getAbastecimientosForLocalIdDestino() {
        return this.abastecimientosForLocalIdDestino;
    }
    
    public void setAbastecimientosForLocalIdDestino(Set abastecimientosForLocalIdDestino) {
        this.abastecimientosForLocalIdDestino = abastecimientosForLocalIdDestino;
    }
    public Set getAbastecimientosForLocalIdOrigen() {
        return this.abastecimientosForLocalIdOrigen;
    }
    
    public void setAbastecimientosForLocalIdOrigen(Set abastecimientosForLocalIdOrigen) {
        this.abastecimientosForLocalIdOrigen = abastecimientosForLocalIdOrigen;
    }




}


