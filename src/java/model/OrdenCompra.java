package model;
// Generated Nov 13, 2017 12:33:12 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrdenCompra generated by hbm2java
 */
public class OrdenCompra  implements java.io.Serializable {


     private Integer id;
     private EstadoOrdenCompra estadoOrdenCompra;
     private Proveedor proveedor;
     private double montoTotal;
     private String observacion;
     private Date fechaRecepcion;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set ordenCompraHasPresentacionInsumos = new HashSet(0);

    public OrdenCompra() {
    }

	
    public OrdenCompra(EstadoOrdenCompra estadoOrdenCompra, Proveedor proveedor, double montoTotal) {
        this.estadoOrdenCompra = estadoOrdenCompra;
        this.proveedor = proveedor;
        this.montoTotal = montoTotal;
    }
    public OrdenCompra(EstadoOrdenCompra estadoOrdenCompra, Proveedor proveedor, double montoTotal, String observacion, Date fechaRecepcion, Date fechaCreacion, Date fechaModificacion, Set ordenCompraHasPresentacionInsumos) {
       this.estadoOrdenCompra = estadoOrdenCompra;
       this.proveedor = proveedor;
       this.montoTotal = montoTotal;
       this.observacion = observacion;
       this.fechaRecepcion = fechaRecepcion;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.ordenCompraHasPresentacionInsumos = ordenCompraHasPresentacionInsumos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public EstadoOrdenCompra getEstadoOrdenCompra() {
        return this.estadoOrdenCompra;
    }
    
    public void setEstadoOrdenCompra(EstadoOrdenCompra estadoOrdenCompra) {
        this.estadoOrdenCompra = estadoOrdenCompra;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public double getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Date getFechaRecepcion() {
        return this.fechaRecepcion;
    }
    
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
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
    public Set getOrdenCompraHasPresentacionInsumos() {
        return this.ordenCompraHasPresentacionInsumos;
    }
    
    public void setOrdenCompraHasPresentacionInsumos(Set ordenCompraHasPresentacionInsumos) {
        this.ordenCompraHasPresentacionInsumos = ordenCompraHasPresentacionInsumos;
    }




}


