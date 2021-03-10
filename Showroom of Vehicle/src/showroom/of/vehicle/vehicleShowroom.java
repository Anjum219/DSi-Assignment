package showroom.of.vehicle;

import java.util.ArrayList;

public class vehicleShowroom {
    private ArrayList<vehicle> vehicles = new ArrayList<vehicle>();

    public ArrayList<vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public void addVehicles(String vehicleType){
        if( vehicleType.equalsIgnoreCase("Normal") ){
            normalVehicle nv = new normalVehicle();
            vehicles.add(nv);
        }
        else if( vehicleType.equalsIgnoreCase("Sports") ){
            sportsVehicle sv = new sportsVehicle();
            vehicles.add(sv);
        }
        else if( vehicleType.equalsIgnoreCase("Heavy") ){
            heavyVehicle hv = new heavyVehicle();
            vehicles.add(hv);
        }
        else{
            System.out.println("Sorry. We don't add " + vehicleType + " vehicle :(");
        }
    }
    
    public int searchVehicle(String modelNumber){
        int pos = -1;
        
        for( int i = 0; i < vehicles.size(); i++ ){
            if( vehicles.get(i).getModelNumber() == modelNumber ){
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    public void removeVehicle(String modelNumber){
        int pos = searchVehicle(modelNumber);
        
        if( pos != -1 ){
            vehicles.remove(pos);
        }
    }
    
    public void showVehicles(){
        System.out.println("\nALL VEHICLES------------------");
        for( int i = 0; i < vehicles.size(); i++ ){
            vehicles.get(i).showProperty();
        }
    }
}
