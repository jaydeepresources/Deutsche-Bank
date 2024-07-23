package service;

public class Car extends Vehicle{

    protected String transmissionType;

    Car(){

    }

    public Car(String name, String color, String transmissionType) {
        super(name, color);
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCar{" +
                "transmissionType='" + transmissionType + '\'' +
                '}';
    }
}
