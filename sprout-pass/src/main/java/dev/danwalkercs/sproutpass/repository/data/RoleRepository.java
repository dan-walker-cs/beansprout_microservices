package dev.danwalkercs.sproutpass.repository.data;

import dev.danwalkercs.sproutpass.domain.data.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository interface for Role entities.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
