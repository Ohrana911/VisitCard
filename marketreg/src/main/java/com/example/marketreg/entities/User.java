package com.example.marketreg.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "usersbd")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User(){}

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    // Геттеры и сеттеры
}