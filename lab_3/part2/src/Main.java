import Classes.Boots;
import Classes.FlipFlops;
import Classes.Sneakers;
import Classes.Wedges;

public class Main {
    public static void main(String[] args) {
        FlipFlops flipFlops = new FlipFlops(38, "Red", "Puma");
        Wedges wedges = new Wedges(35, "Blue", "Megatop");
        Boots boots = new Boots(42, "Black", "Martens", "2cm", "Demi-season");
        Sneakers sneakers = new Sneakers(39, "White", "Nike", "Rubber");

        flipFlops.brand();
        flipFlops.print();
        flipFlops.showFlipFlopsInfo();
        System.out.println();

        wedges.brand();
        wedges.print();
        wedges.showWedgesInfo();
        System.out.println();

        boots.brand();
        boots.print();
        boots.showBootsInfo();
        System.out.println();

        sneakers.brand();
        sneakers.print();
        sneakers.showSneakersInfo();
    }
}