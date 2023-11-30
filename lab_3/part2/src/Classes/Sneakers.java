package Classes;

import Interfaces.Object;
import Interfaces.Shoes;

public class Sneakers implements Shoes, Object {
    private int size;
    private String color;
    private String manufacturer;
    private String soleType;
    public Sneakers(int size, String color, String manufacturer, String soleType){
        this.size = size;
        this.color = color;
        this.manufacturer = manufacturer;
        this.soleType = soleType;
    }
    @Override
    public int getSize(){
        return size;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public String getManufacturer(){
        return manufacturer;
    }
    @Override
    public void brand(){
        System.out.println("Brand: Sneakers");
    }
    @Override
    public void print(){
        System.out.println("Printing Sneakers");
    }
    public void showSneakersInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
        System.out.println("Sole type: " + soleType);

    }
}
