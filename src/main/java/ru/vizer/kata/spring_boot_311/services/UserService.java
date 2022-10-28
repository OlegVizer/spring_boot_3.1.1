package ru.vizer.kata.spring_boot_311.services;



import ru.vizer.kata.spring_boot_311.model.User;
import java.util.List;

public interface UserService {
    User getUserById(long id);
    List<User> getAllUser();
    void addUser(User user);
    void updateUser(User user);
    void removeUser(long id);
}
