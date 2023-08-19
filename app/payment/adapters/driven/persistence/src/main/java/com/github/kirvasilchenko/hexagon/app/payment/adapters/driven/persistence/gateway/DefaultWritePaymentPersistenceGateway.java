package com.github.kirvasilchenko.hexagon.app.payment.adapters.driven.persistence.gateway;

import com.github.kirvasilchenko.hexagon.app.payment.adapters.driven.persistence.repository.PaymentEntityRepository;
import com.github.kirvasilchenko.hexagon.app.payment.adapters.driven.persistence.mapper.PaymentEntityMapper;
import com.github.kirvasilchenko.hexagon.app.payment.core.domain.model.Payment;
import com.github.kirvasilchenko.hexagon.app.payment.core.port.output.gateway.WritePaymentPersistenceGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultWritePaymentPersistenceGateway implements WritePaymentPersistenceGateway {

    private final PaymentEntityRepository repository;

    @Override
    public Payment save(Payment payment) {
        var entity = PaymentEntityMapper.toEntity(payment);
        return PaymentEntityMapper.toDomain(repository.save(entity));
    }

    @Override
    public void delete(Payment payment) {
        repository.delete(PaymentEntityMapper.toEntity(payment));
    }
}
