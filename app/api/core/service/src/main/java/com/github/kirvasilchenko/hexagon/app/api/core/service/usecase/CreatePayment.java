package com.github.kirvasilchenko.hexagon.app.api.core.service.usecase;

import com.github.kirvasilchenko.hexagon.app.api.core.port.input.CreatePaymentUseCase;
import com.github.kirvasilchenko.hexagon.app.api.core.port.output.VerifyClientOperation;
import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.ValidatePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.port.input.GetUserOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CreatePayment implements CreatePaymentUseCase {

    @Autowired
    @Qualifier("getUserFromPersistence")
    private GetUserOperation getUser;

    @Autowired
    private VerifyClientOperation verifyClient;

    @Autowired
    private ValidatePaymentOperation validatePayment;

    @Autowired
    private SavePaymentOperation savePayment;

    @Override
    public Payment invoke(Payment payment, String clientId, String clientSecret, String userId) {
        verifyClient.invoke(clientId, clientSecret);

        var user = getUser.invoke(userId);

        if (!validatePayment.invoke(payment, user)) {
            return null;
        }

        return savePayment.invoke(payment, user);
    }
}
