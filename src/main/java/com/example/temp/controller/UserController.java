package com.example.temp.controller;

import com.example.temp.service.IUserService;
import com.example.temp.service.UserService;
import com.example.temp.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/utilisateurs")
@RequiredArgsConstructor
//...
public class UserController {
    private final UserService userService;

    @GetMapping("/registration")

    public String getAllUsers(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "Utilisateurs";
    }

}

//@Controller
//@RequestMapping("/utilisateurs")
//public class UserController {
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @GetMapping("/{userId}")
//    public User getUserById(@PathVariable Long userId) {
//        return userService.getUserById(userId);
//    }
//
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @PutMapping
//    public User updateUser(@RequestBody User user) {
//        return userService.updateUser(user);
//    }
//
//    @DeleteMapping("/{userId}")
//    public void deleteUser(@PathVariable Long userId) {
//        userService.deleteUser(userId);
//    }
//}