package dev.danwalkercs.sproutpass.security;

import dev.danwalkercs.sproutpass.common.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Standard security configuration class for Spring.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomOidcUserService customOidcUserService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(auth ->
                auth
                    .requestMatchers(Constant.OPEN_REQUEST_MATCHERS).permitAll()
                    .requestMatchers(Constant.SECURE_REQUEST_MATCHERS).authenticated()
                )
            .oauth2Login(oauth2Login ->
                oauth2Login
                    .defaultSuccessUrl(Constant.DEFAULT_OAUTH_SUCCESS_URL, true)
                    .userInfoEndpoint(userInfoEndpointConfig ->
                        userInfoEndpointConfig.oidcUserService(customOidcUserService)
                    )
                )
        ;
        return http.build();
    }


}
