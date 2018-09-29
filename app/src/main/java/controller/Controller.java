package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import model.*;

import java.io.IOException;

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

    @FXML
    public void loadView(Event event) throws IOException {
        System.out.println("Open pressed");
    }

    public Pane getMain_view() {
        return main_view;
    }

    public void setMain_view(Pane pane) throws IOException {
        this.main_view = pane;
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
