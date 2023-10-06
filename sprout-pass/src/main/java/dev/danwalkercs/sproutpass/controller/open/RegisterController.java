package dev.danwalkercs.sproutpass.controller.open;

import dev.danwalkercs.sproutpass.controller.OpenController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController implements OpenController {

    @GetMapping("/register")
    public String registerUser() {
        return "Public assets";
    }
}
