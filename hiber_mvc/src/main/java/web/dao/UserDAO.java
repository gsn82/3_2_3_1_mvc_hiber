package web.dao;


import web.model.User;

import java.util.List;

public interface UserDAO {
    User getUser(Long id);
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(User user, Long id);
    List<User> getAllUsers();
}
