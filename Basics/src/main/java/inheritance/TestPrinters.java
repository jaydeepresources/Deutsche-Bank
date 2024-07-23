package inheritance;

public class TestPrinters {

    public static void main(String[] args) {
        LaserPrinter lp = new LaserPrinter("HP-43G",100,"High");

        Printer p = new LaserPrinter();
        // Every ______RHS is-a ______LHS
        LaserPrinter l = (LaserPrinter)p;

        // P----->C: DownCasting: Vulnerable
        // C----->P: Upcasting: Safest





    }

}