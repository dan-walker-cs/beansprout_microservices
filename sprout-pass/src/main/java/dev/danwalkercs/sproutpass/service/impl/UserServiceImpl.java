package dev.danwalkercs.sproutpass.service.impl;


import dev.danwalkercs.sproutpass.common.Utility;
import dev.danwalkercs.sproutpass.domain.data.BSMUser;
import dev.danwalkercs.sproutpass.repository.data.UserRepository;
import dev.danwalkercs.sproutpass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<BSMUser> getOneByAuthId(String authId) {
        return userRepository.findOneByAuthId(authId);
    }

    public BSMUser save(BSMUser user) {
        user.auditUpdate(Utility.now());
        return userRepository.save(user);
    }
}
