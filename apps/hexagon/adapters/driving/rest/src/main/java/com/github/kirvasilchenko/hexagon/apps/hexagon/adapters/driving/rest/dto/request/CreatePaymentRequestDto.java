package com.github.kirvasilchenko.hexagon.apps.hexagon.adapters.driving.rest.dto.request;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CreatePaymentRequestDto {
    BigDecimal amount;
    String activity;
    UUID receiver;
}
