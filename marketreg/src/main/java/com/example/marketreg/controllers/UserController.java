package com.example.marketreg.controllers;

import com.example.marketreg.entities.User;
import com.example.marketreg.repositories.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UsersRepository userRepository;

    public UserController(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/usersbd")
    public String createUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/"; // Перенаправление на страницу успешного сохранения
    }
}
