package com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.gateway;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;

public interface WritePaymentPersistenceGateway {

    Payment save(Payment payment);

    void delete(Payment payment);

}
