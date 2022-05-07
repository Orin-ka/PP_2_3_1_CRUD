package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.entity.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user, Long id) {
        userDao.updateUser(user, id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
