package ru.vizer.kata.spring_boot_311.dao;

import ru.vizer.kata.spring_boot_311.model.User;
import java.util.List;

public interface UserDao {
    User getUserById(long id);
    List<User> getAllUser();
    void addUser(User user);
    User readUser(long id);
    void updateUser(User user);
    void removeUser(long id);
}
