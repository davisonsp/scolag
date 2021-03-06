package model;
// Generated Nov 13, 2017 12:33:12 PM by Hibernate Tools 4.3.1



/**
 * OrdenCompraHasPresentacionInsumo generated by hbm2java
 */
public class OrdenCompraHasPresentacionInsumo  implements java.io.Serializable {


     private OrdenCompraHasPresentacionInsumoId id;
     private OrdenCompra ordenCompra;
     private PresentacionInsumo presentacionInsumo;
     private double precioUnitario;
     private int cantidad;

    public OrdenCompraHasPresentacionInsumo() {
    }

    public OrdenCompraHasPresentacionInsumo(OrdenCompraHasPresentacionInsumoId id, OrdenCompra ordenCompra, PresentacionInsumo presentacionInsumo, double precioUnitario, int cantidad) {
       this.id = id;
       this.ordenCompra = ordenCompra;
       this.presentacionInsumo = presentacionInsumo;
       this.precioUnitario = precioUnitario;
       this.cantidad = cantidad;
    }
   
    public OrdenCompraHasPresentacionInsumoId getId() {
        return this.id;
    }
    
    public void setId(OrdenCompraHasPresentacionInsumoId id) {
        this.id = id;
    }
    public OrdenCompra getOrdenCompra() {
        return this.ordenCompra;
    }
    
    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    public PresentacionInsumo getPresentacionInsumo() {
        return this.presentacionInsumo;
    }
    
    public void setPresentacionInsumo(PresentacionInsumo presentacionInsumo) {
        this.presentacionInsumo = presentacionInsumo;
    }
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


