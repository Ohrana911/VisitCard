package com.example.marketreg.controllers;

import com.example.marketreg.entities.User;
import com.example.marketreg.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class MainController {

//    private final UserService userService;

    @Autowired
    private UsersRepository usersRepository;


    @GetMapping("/")
    public String mainpage(Model model){
//       model.addAttribute("users", userService.listOfUsers());
        Iterable<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "mainpage";
    }

//    @PostMapping(value = "/")
//    public String aboutus(){
//        return "redirect:/aboutus";
//    }

//    @GetMapping("/aboutus")
//    public String hello(){
//        return "aboutus";
//    }
//
//    @GetMapping("/kursi")
//    public String user(){
//        return "kursi";
//    }
//
//    @GetMapping("/contacts")
//    public String admin(){
//        return "contacts";
//    }

}
