package com.example.sprintroachdemo.repository;

import com.example.sprintroachdemo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, UUID> {
    List<User> findByEmailEquals(String infix);
}
