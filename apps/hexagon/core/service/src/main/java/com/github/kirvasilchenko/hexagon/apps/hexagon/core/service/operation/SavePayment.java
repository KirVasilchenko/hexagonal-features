package com.github.kirvasilchenko.hexagon.apps.hexagon.core.service.operation;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.User;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.input.CreatePaymentUseCase;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.gateway.WritePaymentPersistenceGateway;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.GetUserFromSessionOperation;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation.ValidatePaymentOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePayment implements SavePaymentOperation {

    private final WritePaymentPersistenceGateway writeGateway;

    @Override
    public Payment invoke(Payment payment, User user) {
        payment.setSender(user.getId());
        return writeGateway.save(payment);
    }
}
