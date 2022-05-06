package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user, Long id);
    void deleteUser(Long id);

}
