
package proje;

public class Car extends Vehicle{
    private int kapi;
    
    public Car(String plaka,String model,String marka,int kapi){
        super(plaka,model,marka);
        this.kapi=kapi;
    }

   
    public int getKapi() {
        return kapi;
    }
    public void setKapi(int kapi) {
        this.kapi = kapi;
    }
    
    @Override
    public String toString( ){
        if(getKapi()==2){
            return ("Spor araba"+" "+getPlaka()+ " " + getModel()+ " " + getMarka()+ " "+kapi);
        }else if(getKapi()==4){
            return ("Standart araba"+" "+getPlaka()+ " " + getModel()+ " " + getMarka()+ " "+kapi);
        }else if(getKapi()==5){
            return ("SWagon Araba"+" "+getPlaka()+ " " + getModel()+ " " + getMarka()+ " "+kapi);
        }else{
            return ("Öyle bir araba henüz yok :D");
        }
    }
}
