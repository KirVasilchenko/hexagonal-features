package com.github.kirvasilchenko.hexagon.app.payment.adapters.driven.persistence.mapper;

import com.github.kirvasilchenko.hexagon.app.payment.adapters.driven.persistence.entity.PaymentEntity;
import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;

public class PaymentEntityMapper {

    public static PaymentEntity toEntity(Payment payment) {
        return PaymentEntity.builder()
                .id(payment.getId())
                .amount(payment.getAmount())
                .activity(payment.getActivity())
                .sender(payment.getSender())
                .receiver(payment.getReceiver())
                .createdAt(payment.getCreatedAt())
                .processedAt(payment.getProcessedAt())
                .build();
    }

    public static Payment toDomain(PaymentEntity save) {
        return Payment.builder()
                .id(save.getId())
                .amount(save.getAmount())
                .activity(save.getActivity())
                .sender(save.getSender())
                .receiver(save.getReceiver())
                .createdAt(save.getCreatedAt())
                .processedAt(save.getProcessedAt())
                .build();
    }
}
