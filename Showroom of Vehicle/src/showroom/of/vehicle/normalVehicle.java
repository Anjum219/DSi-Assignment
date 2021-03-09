package showroom.of.vehicle;

public class normalVehicle implements vehicle{
    private String modelNumber;
    private String engineType;
    private float enginePower;
    private float tireSize;

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
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
}
