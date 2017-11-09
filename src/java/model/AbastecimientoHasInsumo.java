package model;
// Generated Nov 9, 2017 1:52:21 AM by Hibernate Tools 4.3.1



/**
 * AbastecimientoHasInsumo generated by hbm2java
 */
public class AbastecimientoHasInsumo  implements java.io.Serializable {


     private AbastecimientoHasInsumoId id;
     private Abastecimiento abastecimiento;
     private Insumo insumo;
     private double cantidad;

    public AbastecimientoHasInsumo() {
    }

    public AbastecimientoHasInsumo(AbastecimientoHasInsumoId id, Abastecimiento abastecimiento, Insumo insumo, double cantidad) {
       this.id = id;
       this.abastecimiento = abastecimiento;
       this.insumo = insumo;
       this.cantidad = cantidad;
    }
   
    public AbastecimientoHasInsumoId getId() {
        return this.id;
    }
    
    public void setId(AbastecimientoHasInsumoId id) {
        this.id = id;
    }
    public Abastecimiento getAbastecimiento() {
        return this.abastecimiento;
    }
    
    public void setAbastecimiento(Abastecimiento abastecimiento) {
        this.abastecimiento = abastecimiento;
    }
    public Insumo getInsumo() {
        return this.insumo;
    }
    
    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }




}


