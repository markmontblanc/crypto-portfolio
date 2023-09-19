package com.example.cryptoportfolio.controller;

import com.example.cryptoportfolio.model.User;
import com.example.cryptoportfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping({"/", "home"})
    public String home(Model model) {
    List<User> users = userService.getUsers();
    model.addAttribute("users", users);
    return "home";
    }

}
