package com.github.kirvasilchenko.hexagon.app.payment.core.service.usecase;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.input.CreatePaymentUseCase;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.ValidatePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.port.input.GetUserOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePayment implements CreatePaymentUseCase {

    private final GetUserOperation getUser;
    private final ValidatePaymentOperation validatePayment;
    private final SavePaymentOperation savePayment;

    @Override
    public Payment invoke(Payment payment, String bearer) {
        var user = getUser.invoke(bearer);

        if (!validatePayment.invoke(payment, user)) {
            return null;
        }

        return savePayment.invoke(payment, user);
    }

}
