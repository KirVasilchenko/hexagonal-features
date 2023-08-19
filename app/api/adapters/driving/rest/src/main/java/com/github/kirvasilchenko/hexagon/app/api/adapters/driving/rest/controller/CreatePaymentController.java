package com.github.kirvasilchenko.hexagon.app.api.adapters.driving.rest.controller;

import com.github.kirvasilchenko.hexagon.app.api.adapters.driving.rest.dto.mapper.CreatePaymentMapper;
import com.github.kirvasilchenko.hexagon.app.api.adapters.driving.rest.dto.request.CreatePaymentRequestDto;
import com.github.kirvasilchenko.hexagon.app.api.adapters.driving.rest.dto.response.CreatePaymentResponseDto;
import com.github.kirvasilchenko.hexagon.app.api.core.port.input.CreatePaymentUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "CreatePayment", description = "Create new payment")
@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class CreatePaymentController {

    private final CreatePaymentUseCase useCase;

    @Operation(
            operationId = "createPayment",
            summary = "Create new payment",
            description = "Create new payment"
    )
    @PostMapping
    public ResponseEntity<CreatePaymentResponseDto> createPayment(@RequestBody CreatePaymentRequestDto request,
                                                                  @RequestHeader("client_id") String clientId,
                                                                  @RequestHeader("client_secret") String clientSecret,
                                                                  @RequestHeader("user_id") String userId) {
        var payment = CreatePaymentMapper.toPayment(request);
        var response = CreatePaymentMapper.toResponse(useCase.invoke(payment, clientId, clientSecret, userId));
        return ResponseEntity.ok(response);
    }

}
