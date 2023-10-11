package dev.danwalkercs.dumbservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DumbController {

    @GetMapping("/")
    public String getDumb() {
        return "Hello, from the DumbService!";
    }
}
