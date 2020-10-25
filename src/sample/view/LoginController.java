package sample.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.model.User;


public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    public User handleLogin(ActionEvent event){
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        return null;
    }

}
