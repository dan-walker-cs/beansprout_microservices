package dev.danwalkercs.sproutpass.controller.secure;

import dev.danwalkercs.sproutpass.controller.SecureController;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements SecureController {

    @GetMapping("/user/current")
    public String getCurrentUser(OAuth2AuthenticationToken authToken) {
        return authToken.getPrincipal().getName();
    }
}
