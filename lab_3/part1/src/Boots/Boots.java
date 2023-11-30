package Boots;

import Shoes.Shoes;
import WriteInfo.WriteInfo;

public class Boots extends Shoes {
    private String heelSize;
    private String type;

    public Boots(){
        super();
        this.heelSize = "Unknown heel size";
        this.type = "Unknown type";
    }
    public Boots(String heelSize, String type, int size, String color, String manufacturer){
        super(size, color, manufacturer);
        this.heelSize = heelSize;
        this.type = type;
    }
     public String getHeelSize(){
        return heelSize;
     }
     public String getType(){
        return type;
     }
    @Override
    public void brand(){
        System.out.println("Brand: Boots");
    }
     public void showBootsInfo(){
         WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
         System.out.println("Heel size: " + heelSize);
         System.out.println("Type: " + type);
     }
}
