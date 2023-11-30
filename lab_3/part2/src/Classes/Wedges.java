package Classes;

public class Wedges extends Sandals{
    public Wedges(int size, String color, String manufacturer){
        super(size, color, manufacturer);
    }
    @Override
    public void print(){
        System.out.println("Printing Wedges");
    }
    public void showWedgesInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
    }
}
