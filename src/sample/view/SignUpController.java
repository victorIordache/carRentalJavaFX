package sample.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Events.ViewChangeEvent;

public class SignUpController {

    @FXML
    private AnchorPane Apane;

    @FXML
    private Button backBtn;

    private void initialize(){
        backBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {

            System.out.println("Changing view to Login");
            ViewChangeEvent signUpChangeEvent = new ViewChangeEvent(ViewChangeEvent.LOGIN);
            backBtn.fireEvent(signUpChangeEvent);
        });
    }
}
