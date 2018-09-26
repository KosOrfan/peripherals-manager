import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PerManager extends Application {

    Controller controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        controller = new Controller();
        Pane root = new Pane();

        Scene scene = new Scene(root, 820, 480);

        stage.setTitle("Peripherals Manager");
        stage.setScene(scene);
        stage.show();
    }
}
