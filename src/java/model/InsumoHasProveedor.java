package model;
// Generated Oct 3, 2017 1:01:15 AM by Hibernate Tools 4.3.1



/**
 * InsumoHasProveedor generated by hbm2java
 */
public class InsumoHasProveedor  implements java.io.Serializable {


     private InsumoHasProveedorId id;
     private Insumo insumo;
     private Proveedor proveedor;

    public InsumoHasProveedor() {
    }

    public InsumoHasProveedor(InsumoHasProveedorId id, Insumo insumo, Proveedor proveedor) {
       this.id = id;
       this.insumo = insumo;
       this.proveedor = proveedor;
    }
   
    public InsumoHasProveedorId getId() {
        return this.id;
    }
    
    public void setId(InsumoHasProveedorId id) {
        this.id = id;
    }
    public Insumo getInsumo() {
        return this.insumo;
    }
    
    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }




}


