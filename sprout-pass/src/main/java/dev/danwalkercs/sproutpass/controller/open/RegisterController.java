package dev.danwalkercs.sproutpass.controller.open;

import dev.danwalkercs.sproutpass.controller.OpenController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController implements OpenController {

    // TODO: Registration is handled automatically for OAUTH2 users via the CustomUserDetailsService - as of now.
    @GetMapping("/register")
    public String registerUser() {
        return "Public assets";
    }
}
