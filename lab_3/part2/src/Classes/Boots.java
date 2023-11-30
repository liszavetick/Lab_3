package Classes;

import Interfaces.Object;
import Interfaces.Shoes;

public class Boots implements Shoes, Object {
    private int size;
    private String color;
    private String manufacturer;
    private String heelSize;
    private String type;
    public Boots(int size, String color, String manufacturer, String heelSize, String type){
        this.size = size;
        this.color = color;
        this.manufacturer = manufacturer;
        this.heelSize = heelSize;
        this.type = type;
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
        System.out.println("Brand: Boots");
    }
    public void print(){
        System.out.println("Printing Boots");
    }
    public void showBootsInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
        System.out.println("Heel size: " + heelSize);
        System.out.println("Type: " + type);
    }

}
