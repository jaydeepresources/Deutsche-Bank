package service;

public class TestServiceCenter {
    public static void main(String[] args) {
        ServiceCentre serviceCentre = new ServiceCentre();
        serviceCentre.add(new Car("Skoda Rapid", "White", "MT"));
        serviceCentre.add(new Car("Honda City", "Brown", "AMT"));
        serviceCentre.add(new Car("Nissan Magnite", "Grey", "CVT"));
        serviceCentre.add(new Bike("Suzuki V-Strom", "Yellow", 4));

        serviceCentre.printVehicles();
    }
}