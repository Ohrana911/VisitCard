//package com.example.marketreg.services;
//
//import com.example.marketreg.entities.User;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserService {
//    private List<User> users = new ArrayList<>();
//    private long ID = 0;
//
//    {
//        users.add(new User(++ID,"Edward", "edward@mail.ru", "qwerty123", 1));
//        users.add(new User(++ID, "Nastya", "nastya@mail.ru", "Zxc1488@", 1));
//    }
//
//    public List<User> listOfUsers() { return users; }
//
//    public void saveUser(User user) {
//        user.setId(++ID);
//        users.add(user);
//    }
//
//    public void deleteUser(Long id){
//        users.removeIf(user -> user.getId().equals(id));
//    }
//}
