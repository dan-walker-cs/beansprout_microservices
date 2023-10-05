package dev.danwalkercs.sproutpass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController implements PublicController {

    @GetMapping("/register")
    public String register() {
        return "Public assets";
    }
}
