package inheritance;

public class Printer {
    String name;
    float price;

    Printer(){
        System.out.println("Printer");
    }

    public Printer(String name, float price) {
        this.name = name;
        this.price = price;
    }

    void print(){
        System.out.println("Printing pages.");
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}