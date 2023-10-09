package dev.danwalkercs.sproutpass.service;

import dev.danwalkercs.sproutpass.domain.data.BSMUser;

import java.util.Optional;

public interface UserService {

    /**
     * Returns an Optional containing a BSMUser with the provided authId, or Optional.empty() otherwise.
     * @param authId
     * @return Optional<BSMUSER>
     */
    Optional<BSMUser> getOneByAuthId(String authId);

    /**
     * Persists a BSMUser to the database, providing audit information updates to new and existing Entities.
     *  Returns the updated entity.
     * @param user
     * @return BSMUser
     */
    BSMUser save(BSMUser user);
}
