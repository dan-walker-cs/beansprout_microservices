package dev.danwalkercs.sproutpass.domain.rel;

import dev.danwalkercs.sproutpass.domain.AbstractDomainEntity;
import dev.danwalkercs.sproutpass.domain.data.Role;
import dev.danwalkercs.sproutpass.domain.data.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RelUserRole extends AbstractDomainEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
