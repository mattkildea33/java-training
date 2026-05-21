package com.example.java_training.service;

import com.example.java_training.entity.UserAccount;
import com.example.java_training.exception.ResourceNotFoundException;
import com.example.java_training.repository.UserAccountRepository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    private final UserAccountRepository userAccountRepository;

    public UserAccountService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public List<UserAccount> getAllUsers() {
        return userAccountRepository.findAll();
    }

    public UserAccount getUserById(Long id) {
        return userAccountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    public UserAccount saveUser(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    public void deleteUser(Long id) {
        userAccountRepository.deleteById(id);
    }

}
