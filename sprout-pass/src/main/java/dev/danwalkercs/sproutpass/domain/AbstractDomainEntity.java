package dev.danwalkercs.sproutpass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
public class AbstractDomainEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @NonNull
    private ZonedDateTime createdDt;

    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime lastUpdatedDt;
}
