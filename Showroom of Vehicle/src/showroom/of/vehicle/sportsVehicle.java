package showroom.of.vehicle;

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
    public void showProperty(){
        
    }
}
