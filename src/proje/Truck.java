
package proje;

public class Truck extends Vehicle {
    private int yukKapasite;

    public Truck(String plaka,String model,String marka,int yukKapasitesi){
        super(plaka,model,marka);
        this.yukKapasite=yukKapasitesi;
    
    }
    public int getYukKapasite() {
        return yukKapasite;
    }

    public void setYukKapasite(int yukKapasite) {
        this.yukKapasite = yukKapasite;
    }
    public String toString( ){
        return ("Tır"+" "+getPlaka()+ " " + getModel()+ " " + getMarka()+ " "+yukKapasite);
    }
    
    
}
