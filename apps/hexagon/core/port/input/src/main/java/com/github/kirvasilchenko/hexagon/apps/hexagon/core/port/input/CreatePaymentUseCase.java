package com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.input;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;

public interface CreatePaymentUseCase {

    public Payment invoke(Payment payment);

}
