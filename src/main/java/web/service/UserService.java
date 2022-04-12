package web.service;

import web.model.User;

import java.util.List;

public interface UserService  {
    void add(User user);
    List<User> listUsers();
    void deleteById(Long id);
    void updateUser(User user);
    User getUserById(long id);
}
