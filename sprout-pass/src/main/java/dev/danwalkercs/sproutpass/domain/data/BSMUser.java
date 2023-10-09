package dev.danwalkercs.sproutpass.domain.data;

import dev.danwalkercs.sproutpass.domain.AbstractDomainEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.ZonedDateTime;

/**
 * Entity class to represent Beansprout Microservices system-level users.
 */
@Entity
@Table(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BSMUser extends AbstractDomainEntity {

    private String authId;
    private String username;
    private String emailId;
    private ZonedDateTime lastLoginDt;
}
