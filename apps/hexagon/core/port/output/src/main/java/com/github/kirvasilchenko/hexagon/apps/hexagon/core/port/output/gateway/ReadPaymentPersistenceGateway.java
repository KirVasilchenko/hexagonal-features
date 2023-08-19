package com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.gateway;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.Payment;

import java.util.List;
import java.util.UUID;

public interface ReadPaymentPersistenceGateway {

    Payment get(UUID id);

    List<Payment> getAll();

}
