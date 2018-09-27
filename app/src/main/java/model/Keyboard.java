package model;

import javafx.scene.control.TableView;

public class Keyboard extends TableView {

    private int number;
    private String serialN;
    private String productN;
    private String model;

    public Keyboard(int number, String serialN, String productN, String model) {
        this.number = number;
        this.serialN = serialN;
        this.productN = productN;
        this.model = model;
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

    public String getProductN() {
        return productN;
    }

    public void setProductN(String productN) {
        this.productN = productN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
