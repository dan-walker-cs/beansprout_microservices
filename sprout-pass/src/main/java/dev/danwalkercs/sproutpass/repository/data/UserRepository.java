package dev.danwalkercs.sproutpass.repository.data;

import dev.danwalkercs.sproutpass.domain.data.BSMUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<BSMUser, Long> {

    Optional<BSMUser> findOneByAuthId(String authId);
}
