package com.github.kirvasilchenko.hexagon.app.web.adapters.driving.rest.dto.mapper;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.web.adapters.driving.rest.dto.request.CreatePaymentRequestDto;
import com.github.kirvasilchenko.hexagon.app.web.adapters.driving.rest.dto.response.CreatePaymentResponseDto;

public class CreatePaymentMapper {

    public static Payment toPayment(CreatePaymentRequestDto request) {
        return Payment.builder()
                .amount(request.getAmount())
                .activity(request.getActivity())
                .receiver(request.getReceiver())
                .build();
    }

    public static CreatePaymentResponseDto toResponse(Payment payment) {
        return CreatePaymentResponseDto.builder()
                .id(payment.getId())
                .amount(payment.getAmount())
                .activity(payment.getActivity())
                .sender(payment.getSender())
                .receiver(payment.getReceiver())
                .createdAt(payment.getCreatedAt())
                .processedAt(payment.getProcessedAt())
                .build();
    }

}
