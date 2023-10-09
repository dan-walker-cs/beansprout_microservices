package dev.danwalkercs.sproutpass.service;

import dev.danwalkercs.sproutpass.domain.data.BSMUser;

import java.util.Optional;

public interface UserService {

    Optional<BSMUser> getOneByAuthId(String authId);

    BSMUser save(BSMUser user);
}
