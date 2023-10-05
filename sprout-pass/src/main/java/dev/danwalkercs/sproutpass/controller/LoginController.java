package dev.danwalkercs.sproutpass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements PrivateController {

    @GetMapping("/authenticate")
    public String authenticate() {
        return "Private assets";
    }
}
