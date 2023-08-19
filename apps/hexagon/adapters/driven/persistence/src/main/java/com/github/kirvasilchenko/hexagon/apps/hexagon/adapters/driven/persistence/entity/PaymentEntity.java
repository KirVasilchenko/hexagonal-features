package com.github.kirvasilchenko.hexagon.apps.hexagon.adapters.driven.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payment")
@Data
@Builder
public class PaymentEntity {

    @Id
    private UUID id;

    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "activity")
    String activity;

    @Column(name = "sender")
    UUID sender;

    @Column(name = "receiver")
    UUID receiver;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "processed_at")
    LocalDateTime processedAt;

}
