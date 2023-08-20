package com.github.kirvasilchenko.hexagon.app.payment.core.service.usecase;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.input.CreatePaymentUseCase;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.SavePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation.ValidatePaymentOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.port.input.GetUserOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CreatePayment implements CreatePaymentUseCase {

    @Qualifier("getUserFromSession")
    @Autowired
    private GetUserOperation getUser;

    @Autowired
    private ValidatePaymentOperation validatePayment;

    @Autowired
    private SavePaymentOperation savePayment;

    @Override
    public Payment invoke(Payment payment, String bearer) {
        var user = getUser.invoke(bearer);

        if (!validatePayment.invoke(payment)) {
            return null;
        }

        return savePayment.invoke(payment, user);
    }

}
