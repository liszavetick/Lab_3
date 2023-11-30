package Classes;

import Interfaces.Object;
import Interfaces.Shoes;

abstract public class Sandals implements Shoes, Object {
    private int size;
    private String color;
    private String manufacturer;
    public Sandals(int size, String color, String manufacturer){
        this.size = size;
        this.color = color;
        this.manufacturer = manufacturer;
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
        System.out.println("Brand: Sandals");
    }
}
