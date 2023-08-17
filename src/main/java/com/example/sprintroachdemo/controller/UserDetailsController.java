package com.example.sprintroachdemo.controller;

import com.example.sprintroachdemo.dto.User;
import com.example.sprintroachdemo.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping(value = "/users", consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @Transactional
    public User createUser(@RequestBody User user) {
        return userDetailsService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> findUsers() {
        return userDetailsService.searchUsers();
    }

    @GetMapping("/users/{email}")
    public User findEmail(@PathVariable String email) {
        return userDetailsService.findByEmail(email).stream().findFirst().orElse(new User());
    }

}
