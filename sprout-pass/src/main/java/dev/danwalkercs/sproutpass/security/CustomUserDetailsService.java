package dev.danwalkercs.sproutpass.security;

import dev.danwalkercs.sproutpass.common.Constant;
import dev.danwalkercs.sproutpass.domain.data.BSMUser;
import dev.danwalkercs.sproutpass.domain.data.Role;
import dev.danwalkercs.sproutpass.domain.rel.RelUserRole;
import dev.danwalkercs.sproutpass.enums.ERole;
import dev.danwalkercs.sproutpass.common.Utility;
import dev.danwalkercs.sproutpass.repository.rel.RelUserRoleRepository;
import dev.danwalkercs.sproutpass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;


/**
 * BSMUser authentication logic.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RelUserRoleRepository userRoleRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String authId) throws UsernameNotFoundException {
        BSMUser user = createOrRetrieveUser(authId);
        List<SimpleGrantedAuthority> authorities = resolveAuthorities(user);

        updateUserData(user);

        return new User(
            user.getUsername(),
            user.getAuthId(),
                true,
            true,
            true,
            true,
                authorities
        );
    }

    private BSMUser createOrRetrieveUser(String authId) {
        return userService
                .getOneByAuthId(authId)
                .orElse(createNewUser(authId));
    }

    private BSMUser createNewUser(String authId) {
        return BSMUser
            .builder()
            .authId(authId)
            .username(generateUsername())
            .build();
    }

    private String generateUsername() {
        Random randomGen = new Random();

        return String.format("%s_%s-%d",
                Constant.DEFAULT_USERNAME_POOL[randomGen.nextInt(26)],
                Constant.DEFAULT_USERNAME_POOL[randomGen.nextInt(26)],
                randomGen.nextInt(1000000));
    }

    private List<SimpleGrantedAuthority> resolveAuthorities(BSMUser user) {
        return Objects.isNull(user.getId())
            ? Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
            : userRoleRepository
                .findAllByUserId(user.getId())
                .stream()
                .map(RelUserRole::getRole)
                .map(Role::getLabel)
                .map(ERole::name)
                .map(SimpleGrantedAuthority::new)
                .toList();
    }

    private void updateUserData(BSMUser user) {
        user.setLastLoginDt(Utility.now());
        userService.save(user);
    }
}
