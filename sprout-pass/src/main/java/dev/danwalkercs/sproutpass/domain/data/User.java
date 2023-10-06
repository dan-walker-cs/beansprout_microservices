package dev.danwalkercs.sproutpass.domain.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String providerId;
    private String providerName;
    private String emailId;
    private ZonedDateTime lastLoginDt;
}
