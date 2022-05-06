package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user, Long id);
    void deleteUser(Long id);
}
