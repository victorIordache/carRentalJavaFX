package sample.DAO;

import sample.model.User;

import java.sql.Connection;

public interface UserDao extends EntityDao<User> {

    User login(String username, String password);

}
