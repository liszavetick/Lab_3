package Sandals;

import Shoes.Shoes;
import WriteInfo.WriteInfo;

public class Sandals extends Shoes {
    private String openness;

    public Sandals(){
        super();
        this.openness = "Unknown openness";
    }

    public Sandals(String openness, int size, String color, String manufacturer){
        super(size, color, manufacturer);
        this.openness = openness;
    }
    public String getOpenness(){
        return openness;
    }
    @Override
    public void brand(){
        System.out.println("Brand: Sandals");
    }
    public void showSandalsInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
        System.out.println("Openness: " + openness);
    }

}
