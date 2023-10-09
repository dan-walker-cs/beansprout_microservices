package dev.danwalkercs.sproutpass.domain.rel;

import dev.danwalkercs.sproutpass.domain.AbstractDomainEntity;
import dev.danwalkercs.sproutpass.domain.data.Role;
import dev.danwalkercs.sproutpass.domain.data.BSMUser;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RelUserRole extends AbstractDomainEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private BSMUser user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
