package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import sample.Events.ViewChangeEvent;

import java.io.IOException;

public class MainController {

    @FXML
    private BorderPane mainContainer;

    public void initialize() throws IOException {

        AnchorPane loginAnchorPane = FXMLLoader.load(getClass().getResource("Login.fxml"));
        mainContainer.setCenter(loginAnchorPane);

        AnchorPane signUpAnchorPane = FXMLLoader.load(getClass().getResource("SignUp.fxml"));


        mainContainer.addEventHandler(ViewChangeEvent.SIGNUP,viewChangeEvent -> mainContainer.setCenter(signUpAnchorPane));
        mainContainer.addEventHandler(ViewChangeEvent.LOGIN,viewChangeEvent -> mainContainer.setCenter(loginAnchorPane));


    }
}
