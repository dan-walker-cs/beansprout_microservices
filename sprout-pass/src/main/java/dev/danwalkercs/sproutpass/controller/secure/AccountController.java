package dev.danwalkercs.sproutpass.controller.secure;

import dev.danwalkercs.sproutpass.controller.SecureController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements SecureController {

    @GetMapping("/account")
    public String getUserAccount() {
        return "Private assets";
    }
}
