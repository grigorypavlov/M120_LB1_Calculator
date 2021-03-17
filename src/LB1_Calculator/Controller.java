package LB1_Calculator;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class Controller {
    public void handleMenuItemClick(ActionEvent event) {
        Stage backgroundColorSubWindow = new Stage();
        backgroundColorSubWindow.setTitle("Background color");
        backgroundColorSubWindow.setHeight(200);
        backgroundColorSubWindow.setWidth(300);
        backgroundColorSubWindow.show();
    }
}
