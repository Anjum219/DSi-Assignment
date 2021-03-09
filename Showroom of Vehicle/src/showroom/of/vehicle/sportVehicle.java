package showroom.of.vehicle;

public class sportVehicle {
    private String modelNumber;
    private String engineType = "oil";
    private float enginePower;
    private float tireSize;
    private float turbo;

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

    public float getTurbo() {
        return turbo;
    }

    public void setTurbo(float turbo) {
        this.turbo = turbo;
    }
}
