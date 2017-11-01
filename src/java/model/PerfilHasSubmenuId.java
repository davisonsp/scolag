package model;
// Generated Oct 31, 2017 7:02:24 PM by Hibernate Tools 4.3.1



/**
 * PerfilHasSubmenuId generated by hbm2java
 */
public class PerfilHasSubmenuId  implements java.io.Serializable {


     private int id;
     private int perfilId;
     private int menuId;
     private int submenuId;

    public PerfilHasSubmenuId() {
    }

    public PerfilHasSubmenuId(int id, int perfilId, int menuId, int submenuId) {
       this.id = id;
       this.perfilId = perfilId;
       this.menuId = menuId;
       this.submenuId = submenuId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getPerfilId() {
        return this.perfilId;
    }
    
    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }
    public int getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public int getSubmenuId() {
        return this.submenuId;
    }
    
    public void setSubmenuId(int submenuId) {
        this.submenuId = submenuId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PerfilHasSubmenuId) ) return false;
		 PerfilHasSubmenuId castOther = ( PerfilHasSubmenuId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getPerfilId()==castOther.getPerfilId())
 && (this.getMenuId()==castOther.getMenuId())
 && (this.getSubmenuId()==castOther.getSubmenuId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getPerfilId();
         result = 37 * result + this.getMenuId();
         result = 37 * result + this.getSubmenuId();
         return result;
   }   


}


