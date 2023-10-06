package dev.danwalkercs.sproutpass.domain.data;

import dev.danwalkercs.sproutpass.domain.AbstractDomainEntity;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.ZonedDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractDomainEntity {

    private String providerId;
    private String providerName;
    private String emailId;
    private ZonedDateTime lastLoginDt;
}
