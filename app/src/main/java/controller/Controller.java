package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import model.Computer;
import model.Headset;
import model.Keyboard;
import model.Monitor;
import model.Mouse;

public class Controller {

    private Computer computer;
    private Headset headset;
    private Mouse mouse;
    private Monitor monitor;
    private Keyboard keyboard;

    private Pane root;
    private Pane main_view;

    public Controller() throws IOException {
    }

    public void setMain_view(Pane pane) throws IOException {
        this.main_view = pane;
    }

    public Pane getMain_view() {
        return main_view;
    }

    public Pane getRoot() {
        return root;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Headset getHeadset() {
        return headset;
    }

    public void setHeadset(Headset headset) {
        this.headset = headset;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
