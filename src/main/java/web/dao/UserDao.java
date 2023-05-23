package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void add (User user);

    void update (User user);

    void remove (Long id);

    User getById (Long id);

}
