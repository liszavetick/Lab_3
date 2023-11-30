package Sneakers;

import Shoes.Shoes;
import WriteInfo.WriteInfo;

public class Sneakers extends Shoes {
    private String soleType;

    public Sneakers(){
        super();
        this.soleType = "Unknown";
    }
    public Sneakers(String soleType, int size, String color, String manufacturer){
        super(size, color, manufacturer);
        this.soleType = soleType;
    }
    public String getSoleType(){
        return soleType;
    }
    public void brand(){
        System.out.println("Brand: Sneakers");
    }
    public void showSneakersInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
        System.out.println("Sole type: " + soleType);
    }
}
