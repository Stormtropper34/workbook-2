package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle: ");

        Vehicle vehicle = new Vehicle(4000004L, "Skyline", "Black", 223645, 2500000f);

        System.out.println(vehicle);


//        vehicle.setVehicleId(4552521525L);
//        vehicle.setColor("Black");
//        vehicle.setMakeModel("Skyline");
//        vehicle.setPrice(23_111_111);
//        vehicle.setOdometerReading(22545);
//
//        System.out.println(vehicle.getVehicleId());
//        System.out.println(vehicle.getColor());
//        System.out.println(vehicle.getMakeModel());
//        System.out.println(vehicle.getPrice());
//        System.out.println(vehicle.getOdometerReading());
    }
}
