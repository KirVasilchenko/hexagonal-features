package com.github.kirvasilchenko.hexagon.app.api.adapters.driving.rest.dto.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class CreatePaymentRequestDto {
    BigDecimal amount;
    String activity;
    UUID receiver;
}
