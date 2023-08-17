package com.example.sprintroachdemo.service;

import com.example.sprintroachdemo.dto.User;
import com.example.sprintroachdemo.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    // Insert User
    public User createUser(User user) {
        UUID uuid = UUID.randomUUID();
        user.setId(uuid);
        return this.userDetailsRepository.save(user);
    }

    //Search Users
    public List<User> searchUsers() {
        return this.userDetailsRepository.findAll();
    }

    //Search By Email
    public List<User> findByEmail(String email) {
        return this.userDetailsRepository.findByEmailEquals(email);
    }
}
