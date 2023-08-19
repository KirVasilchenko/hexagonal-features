package com.github.kirvasilchenko.hexagon.apps.hexagon.core.service.usecase;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.input.CreatePaymentUseCase;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.GetUserFromSessionOperation;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.ValidatePaymentOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePayment implements CreatePaymentUseCase {

    private final GetUserFromSessionOperation getUser;
    private final ValidatePaymentOperation validatePayment;
    private final SavePaymentOperation savePayment;

    @Override
    public Payment invoke(Payment payment) {
        var user = getUser.invoke();

        if (!validatePayment.invoke(payment, user)) {
            return null;
        }

        return savePayment.invoke(payment, user);
    }

}
