package com.example.java_training.controller;

import com.example.java_training.entity.UserAccount;
import com.example.java_training.service.UserAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/users")
public class UserAccountController {

    private final UserAccountService service;

    public UserAccountController(UserAccountService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public UserAccount getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @GetMapping()
    public List<UserAccount> getAllUsers() {
        return service.getAllUsers();
    }
    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    

    @PostMapping()
    public UserAccount createUser(@RequestBody UserAccount userAccount) {
        return service.saveUser(userAccount);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }

}
