package model;
// Generated Oct 25, 2017 6:15:37 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Abastecimiento generated by hbm2java
 */
public class Abastecimiento  implements java.io.Serializable {


     private Integer id;
     private EstadoAbastecimiento estadoAbastecimiento;
     private Local localByLocalIdOrigen;
     private Local localByLocalIdDestino;
     private String observacion;
     private Date fechaEnvio;
     private Date fechaRecepcion;
     private Set abastecimientoHasInsumos = new HashSet(0);

    public Abastecimiento() {
    }

	
    public Abastecimiento(Local localByLocalIdDestino) {
        this.localByLocalIdDestino = localByLocalIdDestino;
    }
    public Abastecimiento(EstadoAbastecimiento estadoAbastecimiento, Local localByLocalIdOrigen, Local localByLocalIdDestino, String observacion, Date fechaEnvio, Date fechaRecepcion, Set abastecimientoHasInsumos) {
       this.estadoAbastecimiento = estadoAbastecimiento;
       this.localByLocalIdOrigen = localByLocalIdOrigen;
       this.localByLocalIdDestino = localByLocalIdDestino;
       this.observacion = observacion;
       this.fechaEnvio = fechaEnvio;
       this.fechaRecepcion = fechaRecepcion;
       this.abastecimientoHasInsumos = abastecimientoHasInsumos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public EstadoAbastecimiento getEstadoAbastecimiento() {
        return this.estadoAbastecimiento;
    }
    
    public void setEstadoAbastecimiento(EstadoAbastecimiento estadoAbastecimiento) {
        this.estadoAbastecimiento = estadoAbastecimiento;
    }
    public Local getLocalByLocalIdOrigen() {
        return this.localByLocalIdOrigen;
    }
    
    public void setLocalByLocalIdOrigen(Local localByLocalIdOrigen) {
        this.localByLocalIdOrigen = localByLocalIdOrigen;
    }
    public Local getLocalByLocalIdDestino() {
        return this.localByLocalIdDestino;
    }
    
    public void setLocalByLocalIdDestino(Local localByLocalIdDestino) {
        this.localByLocalIdDestino = localByLocalIdDestino;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Date getFechaEnvio() {
        return this.fechaEnvio;
    }
    
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public Date getFechaRecepcion() {
        return this.fechaRecepcion;
    }
    
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    public Set getAbastecimientoHasInsumos() {
        return this.abastecimientoHasInsumos;
    }
    
    public void setAbastecimientoHasInsumos(Set abastecimientoHasInsumos) {
        this.abastecimientoHasInsumos = abastecimientoHasInsumos;
    }




}


