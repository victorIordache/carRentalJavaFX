package sample.DAO;

import sample.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDBDao implements UserDao {


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int userID) {
        return null;
    }

    @Override
    public void create(User user) {
        String usersQuery = "INSERT INTO users (firstName,lastName,birthday,CNP) VALUES(?,?,?,?)";
        String phoneNumberQuery = "INSERT INTO phonenumbers(userID,countryCode,phoneNumber) VALUES((SELECT userID FROM users WHERE CNP='" + user.getCNP() +"'),?,?)";
        String addressQuery = "INSERT INTO address(userID,addressLine,city,postalCode) VALUES((SELECT userID FROM users WHERE CNP='" + user.getCNP() +"'),?,?,?)";
        String accountsQuery = "INSERT INTO accounts(userID,username,pass) VALUES((SELECT userID FROM users WHERE CNP='" + user.getCNP() +"'),?,?)";

        try{
            PreparedStatement usersPreparedStmt = DBUtil.getConnection().prepareStatement(usersQuery);
            PreparedStatement phoneNumberStmt = DBUtil.getConnection().prepareStatement(phoneNumberQuery);
            PreparedStatement addressStmt = DBUtil.getConnection().prepareStatement(addressQuery);
            PreparedStatement accountsStmt = DBUtil.getConnection().prepareStatement(accountsQuery);

            usersPreparedStmt.setString(1,user.getFirstName());
            usersPreparedStmt.setString(2,user.getLastName());
            usersPreparedStmt.setDate(3, java.sql.Date.valueOf(user.getBirthdayString()));
            usersPreparedStmt.setString(4,user.getCNP());

            phoneNumberStmt.setString(1,user.getPhonenumber().getCountryCode());
            phoneNumberStmt.setString(2,user.getPhonenumber().getPhoneNumber());

            addressStmt.setString(1, user.getAddress().getAddressLine());
            addressStmt.setString(2, user.getAddress().getCity());
            addressStmt.setString(3, user.getAddress().getPostalCode());

            accountsStmt.setString(1,user.getAccount().getUsername());
            accountsStmt.setString(2,user.getAccount().getPassword());

            // An user could have more than 1 phone number, but in this program, I would like just one.
            // I solved this problem in another application of mine with lambda expression and 1 try catch ( application name: DatabaseExample1 )
            usersPreparedStmt.execute();
            phoneNumberStmt.execute();
            addressStmt.execute();
            accountsStmt.execute();

            DBUtil.closeConnection();
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error creating the user!");
        }
    }

    @Override
    public void update(User updatedUser) {

    }

    @Override
    public void remove(User removeUser) {

    }

    @Override
    public void remove(int removeUserByID) {

    }

    @Override
    public User login(String username, String password) {

        return null;
    }

}
