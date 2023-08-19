package com.github.kirvasilchenko.hexagon.app.payment.core.port.input;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;

public interface CreatePaymentUseCase {

    public Payment invoke(Payment payment, String bearer);

}
