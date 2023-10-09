package dev.danwalkercs.sproutpass.domain.data;

import dev.danwalkercs.sproutpass.domain.AbstractDomainEntity;
import dev.danwalkercs.sproutpass.enums.ERole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

/**
 * Entity class to represent Beansprout Microservices system-level roles.
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Role extends AbstractDomainEntity {

    @Enumerated(EnumType.STRING)
    private ERole label;
}
