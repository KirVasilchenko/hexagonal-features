package com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway;

import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;

import java.util.List;
import java.util.UUID;

public interface ReadPaymentPersistenceGateway {

    Payment get(UUID id);

    List<Payment> getAll();

}
