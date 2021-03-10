package showroom.of.vehicle;

import java.util.Scanner;

public class sportsVehicle implements vehicle{
    private String vehicleType = "Sports";
    private String modelNumber;
    private String engineType = "oil";
    private float enginePower;
    private float tireSize;
    private String turbo;
    private float weight;

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(String vehicleType) {
        this.vehicleType = "Sports";
    }

    @Override
    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public void setEngineType(String engineType) {
        this.engineType = "oil";
    }

    @Override
    public float getEnginePower() {
        return enginePower;
    }

    @Override
    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public float getTireSize() {
        return tireSize;
    }

    @Override
    public void setTireSize(float tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public String getTurbo() {
        return turbo;
    }

    @Override
    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = 0;
    }
    
    @Override
    public void insert(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insert Model Number: ");
        String mn = input.nextLine();
        setModelNumber(mn);
        
        System.out.print("Insert Engine Power in HP (Horse Power): ");
        float ep = input.nextFloat();
        setEnginePower(ep);
        
        System.out.print("Insert Tire Size in mm (milimeter): ");
        float ts = input.nextFloat();
        setTireSize(ts);
        
        System.out.print("Insert Turbo: ");
        String t = input.next();
        setTurbo(t);
    }

    @Override
    public void showProperty(){
        System.out.println("\tVehicle Type: " + vehicleType);
        System.out.println("\tModel Number: " + modelNumber);
        System.out.println("\tEngine Type: " + engineType);
        System.out.println("\tEngine Power: " + enginePower + " HP");
        System.out.println("\tTire size: " + tireSize + " mm");
        System.out.println("\tTurbo: " + turbo);
    }
}
