package LB1_Calculator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.awt.*;
import java.io.IOException;

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

    public class SubWindow extends Window {
        Parent root = FXMLLoader.load(getClass().getResource("subWindow.fxml"));

        BorderPane borderPane = new BorderPane();

        javafx.scene.control.Button setRed = new javafx.scene.control.Button("Red");
        javafx.scene.control.Button setGreen = new javafx.scene.control.Button("Green");
        javafx.scene.control.Button setBlue = new javafx.scene.control.Button("Blue");

        public SubWindow() throws IOException {
        }
    }
}
