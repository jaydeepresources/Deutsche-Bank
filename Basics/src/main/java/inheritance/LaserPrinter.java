package inheritance;

public class LaserPrinter extends Printer {
    String quality;

    LaserPrinter() {
        // implicit
        super();
        System.out.println("LaserPrinter");
    }

    public LaserPrinter(String name, float price, String quality) {
        // explicit
        super(name, price);
        this.quality = quality;
    }

    @Override
    public String toString() {
        return super.toString() + "\tLaserPrinter{" +
                "quality='" + quality + '\'' +
                '}';
    }

    @Override
    void print() {
        System.out.println("Printing pages with high quality.");
    }
}