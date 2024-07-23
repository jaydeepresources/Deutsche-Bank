package service;

public class Vehicle {

    protected String name;
    protected String color;

    Vehicle() {

    }

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
