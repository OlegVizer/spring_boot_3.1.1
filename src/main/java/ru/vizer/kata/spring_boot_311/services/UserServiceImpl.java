package ru.vizer.kata.spring_boot_311.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vizer.kata.spring_boot_311.model.User;
import ru.vizer.kata.spring_boot_311.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int id) {
        Optional<User> foundUser = userRepository.findById(id);
        return foundUser.orElse(null);
    }


    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }
    @Transactional
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }
}
