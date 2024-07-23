package interfaces;

public class Tyre implements Bounceable{

    @Override
    public void bounce() {
        System.out.println("Tyre is bouncy.");
    }

    public void fillAir(){
        System.out.println("Air is being filled.");
    }
}