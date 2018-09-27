package model;

import javafx.scene.control.TableView;

public class Mouse extends TableView {

    private int number;
    private String serialN;
    private String productN;

    public Mouse(int number, String serialN, String productN) {
        this.number = number;
        this.serialN = serialN;
        this.productN = productN;
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
}
