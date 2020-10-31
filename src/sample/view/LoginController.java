package sample.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.Events.ViewChangeEvent;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginBtn;

    @FXML
    private Button signUpBtn;


    @FXML
    public void initialize() throws IOException {
        signUpBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {

            System.out.println("Changing view to Sign up");
            ViewChangeEvent signUpChangeEvent = new ViewChangeEvent(ViewChangeEvent.SIGNUP);
            signUpBtn.fireEvent(signUpChangeEvent);
        });

        loginBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            handleLogin();
        });
    }

    public void handleLogin(){
        String username = usernameTextField.getText();
        String password = passwordField.getText();



    }

}
