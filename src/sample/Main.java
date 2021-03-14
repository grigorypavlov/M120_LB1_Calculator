package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Calculator) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Calculator.setTitle("Calculator");

        /*Menu propertiesMenu = new Menu("Properties");
        propertiesMenu.getItems().add(new MenuItem("Background Color"));
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(propertiesMenu);
        BorderPane borderPane = new BorderPane();*/

        Calculator.setScene(new Scene(root, 600, 500));
        Calculator.show();
    }
}
