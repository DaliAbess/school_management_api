package com.example.demo.controller;



import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllBooks() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getBookById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User saveBook(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        userService.deleteUser(id);
    }
    @PutMapping("/{id}")
    public void updateBook(@PathVariable Long id,@RequestBody User user) {
        userService.updateUser(id,user);
    }
}
