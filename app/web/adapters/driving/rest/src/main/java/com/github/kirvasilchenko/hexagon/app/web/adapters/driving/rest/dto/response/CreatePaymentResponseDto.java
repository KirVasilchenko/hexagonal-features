package com.github.kirvasilchenko.hexagon.app.web.adapters.driving.rest.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CreatePaymentResponseDto {
    UUID id;

    BigDecimal amount;
    String activity;

    UUID sender;
    UUID receiver;

    LocalDateTime createdAt;
    LocalDateTime processedAt;
}
