package com.example.cryptoportfolio.controller;

import com.example.cryptoportfolio.model.User;
import com.example.cryptoportfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "create-user";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") User user) {
        userService.create(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/read")
    public String readUser(@PathVariable Long id, Model model) {
        User user = userService.readById(id);
        model.addAttribute("user", user);
        return "redirect:/user-info";
    }


}
