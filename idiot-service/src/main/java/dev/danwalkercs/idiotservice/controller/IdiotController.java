package dev.danwalkercs.idiotservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdiotController {

    @GetMapping("/")
    public String getIdiot() {
        return "Hello, from the IdiotService!";
    }
}
