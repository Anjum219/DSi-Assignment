package showroom.of.vehicle;

//import java.io.*;
//import java.lang.*;
//import java.util.ArrayList;

public class ShowroomOfVehicle {

    public static void main(String[] args) {
        vehicleShowroom vs = new vehicleShowroom();
        heavyVehicle hVehicle = new heavyVehicle();
        vs.heavyVehicles.add(hVehicle);
        System.out.println(vs.heavyVehicles.get(0).getEngineType());
    }
    
}
