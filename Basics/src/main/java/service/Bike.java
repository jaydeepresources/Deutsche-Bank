package service;

public class Bike extends Vehicle{

    protected int stroke;

    Bike(){

    }

    public Bike(String name, String color, int stroke) {
        super(name, color);
        this.stroke = stroke;
    }

    @Override
    public String toString() {
        return super.toString() + "\tBike{" +
                "stroke=" + stroke +
                '}';
    }
}
