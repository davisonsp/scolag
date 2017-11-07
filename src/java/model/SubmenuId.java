package model;
// Generated Nov 7, 2017 10:59:56 AM by Hibernate Tools 4.3.1



/**
 * SubmenuId generated by hbm2java
 */
public class SubmenuId  implements java.io.Serializable {


     private int id;
     private int menuId;

    public SubmenuId() {
    }

    public SubmenuId(int id, int menuId) {
       this.id = id;
       this.menuId = menuId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SubmenuId) ) return false;
		 SubmenuId castOther = ( SubmenuId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getMenuId()==castOther.getMenuId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getMenuId();
         return result;
   }   


}


