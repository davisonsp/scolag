package model;
// Generated Oct 31, 2017 7:02:24 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Insumo generated by hbm2java
 */
public class Insumo  implements java.io.Serializable {


     private Integer id;
     private UnidadMedida unidadMedida;
     private String nombre;
     private String descripcion;
     private int stockMinimo;
     private char estado;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set abastecimientoHasInsumos = new HashSet(0);
     private Set presentacionInsumos = new HashSet(0);
     private Set localHasInsumos = new HashSet(0);

    public Insumo() {
    }

	
    public Insumo(UnidadMedida unidadMedida, String nombre, int stockMinimo, char estado) {
        this.unidadMedida = unidadMedida;
        this.nombre = nombre;
        this.stockMinimo = stockMinimo;
        this.estado = estado;
    }
    public Insumo(UnidadMedida unidadMedida, String nombre, String descripcion, int stockMinimo, char estado, Date fechaCreacion, Date fechaModificacion, Set abastecimientoHasInsumos, Set presentacionInsumos, Set localHasInsumos) {
       this.unidadMedida = unidadMedida;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.stockMinimo = stockMinimo;
       this.estado = estado;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.abastecimientoHasInsumos = abastecimientoHasInsumos;
       this.presentacionInsumos = presentacionInsumos;
       this.localHasInsumos = localHasInsumos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public UnidadMedida getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getStockMinimo() {
        return this.stockMinimo;
    }
    
    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
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
    public Set getAbastecimientoHasInsumos() {
        return this.abastecimientoHasInsumos;
    }
    
    public void setAbastecimientoHasInsumos(Set abastecimientoHasInsumos) {
        this.abastecimientoHasInsumos = abastecimientoHasInsumos;
    }
    public Set getPresentacionInsumos() {
        return this.presentacionInsumos;
    }
    
    public void setPresentacionInsumos(Set presentacionInsumos) {
        this.presentacionInsumos = presentacionInsumos;
    }
    public Set getLocalHasInsumos() {
        return this.localHasInsumos;
    }
    
    public void setLocalHasInsumos(Set localHasInsumos) {
        this.localHasInsumos = localHasInsumos;
    }




}


