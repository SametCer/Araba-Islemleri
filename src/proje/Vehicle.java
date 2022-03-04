
package proje;

public class Vehicle implements Comparable<Vehicle> {
    private String plaka;
    private String model;
    private String marka;
    
    public Vehicle(String plaka,String model,String marka){
        this.plaka=plaka;
        this.model=model;
        this.marka=marka;
    }
    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
   
    @Override
    public String toString( ){
        return (plaka + " " +model+" "+marka);
    }
    @Override
    public int compareTo(Vehicle otherVehicle){
        if(plaka.equals(otherVehicle.plaka)){
            return 0;
        }
        else if(plaka.compareTo(otherVehicle.plaka)<0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
