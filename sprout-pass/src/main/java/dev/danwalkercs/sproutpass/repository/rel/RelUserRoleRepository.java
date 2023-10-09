package dev.danwalkercs.sproutpass.repository.rel;

import dev.danwalkercs.sproutpass.domain.rel.RelUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelUserRoleRepository extends JpaRepository<RelUserRole, Long> {

    List<RelUserRole> findAllByUserId(long userId);
}
