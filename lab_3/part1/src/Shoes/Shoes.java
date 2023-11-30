package Shoes;

import WriteInfo.WriteInfo;

public class Shoes {
    private int size;
    private String color;
    private String manufacturer;

    public Shoes() {
        this.size = 0;
        this.color = "Unknown color";
        this.manufacturer = "Unknown manufacturer";
    }
    public Shoes(int size, String color, String manufacturer){
        this.size = size;
        this.color = color;
        this.manufacturer = manufacturer;
    }
    public int getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void brand(){
        System.out.println("Brand: Shoes");
    }
    public void showShoesInfo(){
        WriteInfo.showInfo(size, color, manufacturer);
    }
}
