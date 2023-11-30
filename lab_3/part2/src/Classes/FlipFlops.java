package Classes;

public class FlipFlops extends Sandals{
    public FlipFlops(int size, String color, String manufacturer){
        super(size, color, manufacturer);
    }
    @Override
    public void print(){
        System.out.println("Printing Flipflops");
    }
    public void showFlipFlopsInfo(){
        WriteInfo.showInfo(getSize(), getColor(), getManufacturer());
    }
}
