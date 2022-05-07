package web.dao;

import org.springframework.stereotype.Component;
import web.entity.User;
import web.config.WebConfig;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import web.config.WebConfig;

@Component
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();

    }

    @Override
    public User getUserById(Long id) {
        return entityManager.createQuery("From User Where user.id=:id", User.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user, Long id) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUserById(id));

    }
}
