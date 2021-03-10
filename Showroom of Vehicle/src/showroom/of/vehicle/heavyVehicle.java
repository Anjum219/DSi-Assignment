package showroom.of.vehicle;

public class heavyVehicle implements vehicle{
    private String vehicleType = "Heavy";
    private String modelNumber;
    private String engineType = "diesel";
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
        this.vehicleType = "Heavy";
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
        this.engineType = "diesel";
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
        this.weight = weight;
    }
    
    @Override
    public void insert(){
        
    }

    @Override
    public void showProperty(){
        System.out.println("vehicle type: " + vehicleType);
        System.out.println("engine type: " + engineType);
        System.out.println("");
    }
}
