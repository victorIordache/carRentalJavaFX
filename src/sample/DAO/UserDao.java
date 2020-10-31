package sample.DAO;

import sample.model.User;

public interface UserDao extends EntityDao<User> {

    User login(String username, String password);
}
