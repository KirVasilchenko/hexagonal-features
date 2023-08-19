package com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.User;

public interface ValidatePaymentOperation{
    boolean invoke(Payment payment, User user);

}
