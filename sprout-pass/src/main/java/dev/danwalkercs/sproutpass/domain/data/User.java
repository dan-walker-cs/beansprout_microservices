package dev.danwalkercs.sproutpass.domain.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String providerId;
    private String providerName;
    private String emailId;
    private ZonedDateTime lastLoginDt;
    private ZonedDateTime createdDt;
    private ZonedDateTime lastUpdatedDt;
}
