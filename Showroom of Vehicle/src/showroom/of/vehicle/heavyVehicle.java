package showroom.of.vehicle;

public class heavyVehicle {
    private String modelNumber;
    private String engineType = "diesel";
    private float enginePower;
    private float tireSize;
    private float weight;

    public String getEngineType() {
        return engineType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public float getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    public float getTireSize() {
        return tireSize;
    }

    public void setTireSize(float tireSize) {
        this.tireSize = tireSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
