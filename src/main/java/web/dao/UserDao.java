package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void remove(Long id);

    User getUserById(Long id);

}
