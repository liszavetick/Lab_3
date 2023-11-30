import Boots.Boots;
import Sandals.Sandals;
import Shoes.Shoes;
import Sneakers.Sneakers;

public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes(35, "Pink", "Addidas");
        Boots boots = new Boots("4cm", "Демисезон", 45, "Blue", "Martens");
        Sandals sandals = new Sandals("Открытые", 39, "Brown", "Ecco");
        Sneakers sneakers = new Sneakers("Резина", 42, "Green", "Nike");
        shoes.brand();
        shoes.showShoesInfo();
        System.out.println();
        boots.brand();
        boots.showBootsInfo();
        System.out.println();
        sandals.brand();
        sandals.showSandalsInfo();
        System.out.println();
        sneakers.brand();
        sneakers.showSneakersInfo();
    }
}