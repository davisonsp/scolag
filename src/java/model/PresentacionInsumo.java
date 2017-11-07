package model;
// Generated Nov 7, 2017 10:59:56 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PresentacionInsumo generated by hbm2java
 */
public class PresentacionInsumo  implements java.io.Serializable {


     private Integer id;
     private Imagen imagen;
     private Insumo insumo;
     private String codigoBarra;
     private String nombre;
     private double rendimiento;
     private double precioCosto;
     private char estado;
     private Set ordenCompraHasPresentacionInsumos = new HashSet(0);

    public PresentacionInsumo() {
    }

	
    public PresentacionInsumo(Insumo insumo, String nombre, double rendimiento, double precioCosto, char estado) {
        this.insumo = insumo;
        this.nombre = nombre;
        this.rendimiento = rendimiento;
        this.precioCosto = precioCosto;
        this.estado = estado;
    }
    public PresentacionInsumo(Imagen imagen, Insumo insumo, String codigoBarra, String nombre, double rendimiento, double precioCosto, char estado, Set ordenCompraHasPresentacionInsumos) {
       this.imagen = imagen;
       this.insumo = insumo;
       this.codigoBarra = codigoBarra;
       this.nombre = nombre;
       this.rendimiento = rendimiento;
       this.precioCosto = precioCosto;
       this.estado = estado;
       this.ordenCompraHasPresentacionInsumos = ordenCompraHasPresentacionInsumos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Imagen getImagen() {
        return this.imagen;
    }
    
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
    public Insumo getInsumo() {
        return this.insumo;
    }
    
    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    public String getCodigoBarra() {
        return this.codigoBarra;
    }
    
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getRendimiento() {
        return this.rendimiento;
    }
    
    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }
    public double getPrecioCosto() {
        return this.precioCosto;
    }
    
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getOrdenCompraHasPresentacionInsumos() {
        return this.ordenCompraHasPresentacionInsumos;
    }
    
    public void setOrdenCompraHasPresentacionInsumos(Set ordenCompraHasPresentacionInsumos) {
        this.ordenCompraHasPresentacionInsumos = ordenCompraHasPresentacionInsumos;
    }




}


