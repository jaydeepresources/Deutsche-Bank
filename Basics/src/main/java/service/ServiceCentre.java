package service;

public class ServiceCentre {

    private Vehicle[] vehicles = new Vehicle[5];
    private static int count=0;

    public void add(Vehicle vehicle){
        vehicles[count++] = vehicle;
    }

    public void printVehicles(){
        for(Vehicle vehicle: vehicles){
            if(vehicle == null)
                break;
            System.out.println(vehicle.toString());
        }
    }

}