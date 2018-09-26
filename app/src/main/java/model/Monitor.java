package model;

public class Monitor {

    private int number;
    private String serialN;
    private String brand;
    private String model;
    private String modelID;

    public Monitor(int number, String serialN, String brand,
                   String model, String modelID) {
        this.number = number;
        this.serialN = serialN;
        this.brand = brand;
        this.model = model;
        this.modelID = modelID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSerialN() {
        return serialN;
    }

    public void setSerialN(String serialN) {
        this.serialN = serialN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }
}
