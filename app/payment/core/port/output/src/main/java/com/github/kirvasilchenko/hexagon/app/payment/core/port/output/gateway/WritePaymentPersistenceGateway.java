package com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;

public interface WritePaymentPersistenceGateway {

    Payment save(Payment payment);

    void delete(Payment payment);

}
