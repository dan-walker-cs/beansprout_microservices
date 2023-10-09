package dev.danwalkercs.sproutpass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractDomainEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime createdDt;

    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime lastUpdatedDt;

    public void auditUpdate(ZonedDateTime now) {
        if (Objects.isNull(id)) {
            this.createdDt = now;
        } else {
            this.lastUpdatedDt = now;
        }
    }
}
