package LB1_Calculator;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class Controller {
    public void handleMenuItemClick(ActionEvent event) {
        Stage backgroundColorSubWindow = new Stage();
        backgroundColorSubWindow.setMaxHeight(200);
        backgroundColorSubWindow.setMaxWidth(300);
        backgroundColorSubWindow.show();
    }
}
