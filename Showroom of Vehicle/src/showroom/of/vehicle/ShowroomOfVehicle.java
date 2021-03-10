package showroom.of.vehicle;

//import java.io.*;

import java.util.ArrayList;

//import java.lang.*;
//import java.util.ArrayList;

public class ShowroomOfVehicle {

    public static void main(String[] args) {
        vehicleShowroom vs = new vehicleShowroom();
        vs.addVehicles("heavy");
        vs.showVehicles();
        vs.addVehicles("rickshaw");
        vs.showVehicles();
        vs.addVehicles("sports");
        vs.showVehicles();
        
    }
    
}
