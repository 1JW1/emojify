package com.example.emojify.controller;

import com.example.emojify.appuser.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("/signup")
    public String getSignup() {
        return "signup";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


    @GetMapping("/spotify")
    public String getSpotify() {
        return "spotify";
    }
}
