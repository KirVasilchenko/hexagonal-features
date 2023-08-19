package com.github.kirvasilchenko.hexagon.app.payment.core.port.output.operation;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;

public interface ValidatePaymentOperation{
    boolean invoke(Payment payment, User user);

}
