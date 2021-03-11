package showroom.of.vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomOfVehicle {

    public static void main(String[] args) {
        vehicleShowroom vs = new vehicleShowroom();
        ArrayList<vehicle> v = new ArrayList<>();
        
        //current storage
        v.add(new normalVehicle("Land Cruiser Prado", "oil", 140, 235));
        v.add(new normalVehicle("Toyota Corolla", "gas", 125, 220));
        v.add(new normalVehicle("Hiace", "gas", 165, 248));
        v.add(new normalVehicle("Toyota Corolla", "gas", 125, 220));
        v.add(new normalVehicle("HILUX", "oil", 138, 233));
        v.add(new normalVehicle("BMW", "oil", 155, 240));
        
        v.add(new sportsVehicle("Ferrari", 170, 225, "TwinAir"));
        v.add(new sportsVehicle("Peugeot", 180, 225, "TwinAir"));
        v.add(new sportsVehicle("Ford", 175, 225, "TwinAir"));
        v.add(new sportsVehicle("VolksWagen GTI", 180, 220, "TwinAir"));
        v.add(new sportsVehicle("Nissan 370Z", 180, 215, "TwinAir"));
        
        v.add(new heavyVehicle("Scania", 220, 340, 2080));
        v.add(new heavyVehicle("Tanker", 220, 340, 2630));
        v.add(new heavyVehicle("TATA 2020", 220, 340, 2080));
        v.add(new heavyVehicle("TATA 2020", 220, 340, 2080));
        
        vs.setVehicles(v);
        
        String press = "";
        
        while( !press.equalsIgnoreCase("E") ){
            System.out.println("Press ");
            System.out.print("\tA to add vehicle ");
            System.out.print("\tR to remove vehicle ");
            System.out.print("\tS to see vehicles ");
            System.out.print("\tV to see expected visitor count ");
            System.out.print("\tE to exit ");
            
            Scanner input = new Scanner(System.in);
            press = input.next();
            
            if( press.equalsIgnoreCase("A") ){
                vs.addVehicles();
            }
            else if( press.equalsIgnoreCase("R") ){
                vs.removeVehicle();
            }
            else if( press.equalsIgnoreCase("S") ){
                vs.showVehicles();
            }
            else if( press.equalsIgnoreCase("V") ){
                vs.showVisitorCount();
            }
        }
    }
    
}
