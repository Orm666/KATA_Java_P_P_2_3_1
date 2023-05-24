package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void remove(Long id);

    User getUserById(Long id);

}
