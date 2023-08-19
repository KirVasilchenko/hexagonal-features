package com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Payment {
    UUID id;

    BigDecimal amount;
    String activity;

    UUID sender;
    UUID receiver;

    LocalDateTime createdAt;
    LocalDateTime processedAt;
}
