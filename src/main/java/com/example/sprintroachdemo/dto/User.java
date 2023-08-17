package com.example.sprintroachdemo.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "user_details")
public class User {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
}
