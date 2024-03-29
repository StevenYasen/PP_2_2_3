package web.dao;

import web.model.User;

import java.util.List;


public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(Long userId);
    void deleteUserById(Long userId);
    void saveUser(User user);
}
