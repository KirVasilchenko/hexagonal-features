package com.github.kirvasilchenko.hexagon.app.payment.core.service.operation;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway.WritePaymentPersistenceGateway;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;
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
