package com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;

public interface ValidatePaymentOperation {
    boolean invoke(Payment payment);

}