package model;

import javafx.scene.control.TableView;

public class Headset extends TableView {

    private int number;
    private String brand;

    public Headset(int number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
