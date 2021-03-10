package showroom.of.vehicle;

public interface vehicle {
    public void setVehicleType(String vehicleType);
    public void setModelNumber(String modelNumber);
    public void setEngineType(String engineType);
    public void setEnginePower(float enginePower);
    public void setTireSize(float tireSize);
    public void setTurbo(String turbo);
    public void setWeight(float weight);

    public String getVehicleType();
    public String getModelNumber();
    public String getEngineType();
    public float getEnginePower();
    public float getTireSize();
    public String getTurbo();
    public float getWeight();
    
    public void insert();
    public void showProperty();
}
