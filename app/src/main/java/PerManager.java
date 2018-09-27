import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import controller.Controller;

public class PerManager extends Application {

    Controller controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        controller = new Controller();
        Pane root = FXMLLoader.load(getClass().getResource("main_view.fxml"));

        controller.setMain_view(root);
        Scene scene = new Scene(controller.getMain_view(), 840, 420);

        stage.setTitle("Peripherals Manager");
        stage.setScene(scene);
        stage.show();
    }
}
