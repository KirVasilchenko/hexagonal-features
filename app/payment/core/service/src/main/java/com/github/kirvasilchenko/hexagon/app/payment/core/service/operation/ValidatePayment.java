package com.github.kirvasilchenko.hexagon.app.payment.core.service.operation;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway.ReadPaymentPersistenceGateway;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway.WritePaymentPersistenceGateway;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.ValidatePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidatePayment implements ValidatePaymentOperation {

    private final ReadPaymentPersistenceGateway readGateway;

    @Override
    public boolean invoke(Payment payment) {
        var existing = readGateway.get(payment.getId());
        return existing == null;
    }
}
