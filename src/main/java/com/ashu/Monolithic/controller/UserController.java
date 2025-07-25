package com.ashu.Monolithic.controller;


import com.ashu.Monolithic.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller // return view
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = Arrays.asList(
                new User("Ashu", "ashu@example.com"),
                new User("Neha", "neha@example.com")
        );

        model.addAttribute("users", users);
        return "users";  // Thymeleaf template name
    }
}