package sample.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.DAO.UserDBDao;
import sample.DAO.UserDao;
import sample.Events.ViewChangeEvent;
import sample.model.Account;
import sample.model.Address;
import sample.model.PhoneNumber;
import sample.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignUpController {

    UserDao userDao = new UserDBDao();

    @FXML
    private AnchorPane Apane;

    @FXML
    private Button backBtn;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField countryCodeTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private DatePicker datePicked;

    @FXML
    private TextField CNPTextField;

    @FXML
    private Button registerBtn;

    @FXML
    private void initialize(){
        backBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {

            System.out.println("Changing view to Login");
            ViewChangeEvent signUpChangeEvent = new ViewChangeEvent(ViewChangeEvent.LOGIN);
            backBtn.fireEvent(signUpChangeEvent);
        });
        registerBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(handleRegistration()){
                System.out.println("Changing view to login with Register button");

                Address address = new Address(addressTextField.getText(),cityTextField.getText(),postalCodeTextField.getText());
                PhoneNumber phoneNumber = new PhoneNumber(countryCodeTextField.getText(),phoneNumberTextField.getText());
                Account account = new Account(usernameTextField.getText(),passwordTextField.getText());
                User newUser = new User(firstNameTextField.getText(),lastNameTextField.getText(),address,phoneNumber, java.sql.Date.valueOf(datePicked.getValue()),CNPTextField.getText(),account);
                userDao.create(newUser);


                ViewChangeEvent registerChangeEvent = new ViewChangeEvent(ViewChangeEvent.LOGIN);
                registerBtn.fireEvent(registerChangeEvent);
            }


        });

    }

    @FXML
    private boolean handleRegistration(){
        if(!validateInputs()){
            return false;
        }
        return true;
    }

    private boolean validateInputs(){
        if(datePicked.getValue() == null){
            datePicked.setValue(LocalDate.of(1998,2,24));
            return false;
        }
        for(TextField textField : getAllTextFields()){
            if(textField.getText().isEmpty() || textField.getText().equals("This field is required")){
                textField.setText("This field is required");
                return false;
            }
        }
        return true;
    }
    private List<TextField> getAllTextFields(){
        List<TextField> TextFields = new ArrayList<>();
        TextFields.add(usernameTextField);
        TextFields.add(passwordTextField);
        TextFields.add(firstNameTextField);
        TextFields.add(lastNameTextField);
        TextFields.add(countryCodeTextField);
        TextFields.add(phoneNumberTextField);
        TextFields.add(cityTextField);
        TextFields.add(addressTextField);
        TextFields.add(postalCodeTextField);
        TextFields.add(CNPTextField);
        return TextFields;
    }
}
