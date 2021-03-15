package LB1_Calculator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private MenuItem backgroundColorItem;

    @Override
    public void start(Stage Calculator) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Calculator.setTitle("Calculator");

        Calculator.setScene(new Scene(root, 600, 500));
        Calculator.show();
    }
}
