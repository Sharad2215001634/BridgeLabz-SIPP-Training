package Workshop.IceCreamRush;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
}
public class IceCreamRush {
    public static void main(String[] args) {
        Flavor[] flavors = {
            new Flavor("Vanilla", 120),
            new Flavor("Chocolate", 150),
            new Flavor("Strawberry", 90),
            new Flavor("Mango", 130),
            new Flavor("Pistachio", 60),
            new Flavor("Butterscotch", 80),
            new Flavor("Cookie Dough", 110),
            new Flavor("Mint", 100)
        };
        for (int i = 0; i < flavors.length - 1; i++) {
            for (int j = 0; j < flavors.length - i - 1; j++) {
                if (flavors[j].sales < flavors[j + 1].sales) {
                
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
        System.out.println("Flavors sorted by popularity (sales):");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.name + ": " + flavor.sales + " sales");
        }
    }
}
