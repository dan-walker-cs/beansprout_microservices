package dev.danwalkercs.sproutpass.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) {
        OAuth2User oAuth2User = super.loadUser(userRequest);

        UserDetails userDetails = customUserDetailsService.loadUserByUsername(oAuth2User.getName());

        return new DefaultOAuth2User(
            userDetails.getAuthorities(),
            oAuth2User.getAttributes(),
            oAuth2User.getName()
        );
    }
}
