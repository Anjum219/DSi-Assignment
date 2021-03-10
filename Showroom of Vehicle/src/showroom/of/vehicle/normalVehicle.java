package showroom.of.vehicle;

import java.util.Scanner;

public class normalVehicle implements vehicle{
    private String vehicleType = "Normal";
    private String modelNumber;
    private String engineType;
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
        this.vehicleType = "Normal";
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
        this.engineType = engineType;
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
        this.turbo = "";
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
        System.out.print("Insert Model Number: ");
        Scanner input = new Scanner(System.in);
        String mn = input.nextLine();
        setModelNumber(mn);
    }

    @Override
    public void showProperty(){
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Engine Type: " + engineType);
        System.out.println("");
    }
}
