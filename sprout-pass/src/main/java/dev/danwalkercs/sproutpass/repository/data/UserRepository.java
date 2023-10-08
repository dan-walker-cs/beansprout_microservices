package dev.danwalkercs.sproutpass.repository.data;

import dev.danwalkercs.sproutpass.domain.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
