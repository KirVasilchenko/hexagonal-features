package com.github.kirvasilchenko.hexagon.apps.hexagon.adapters.driven.persistence.repository;

import com.github.kirvasilchenko.hexagon.apps.hexagon.adapters.driven.persistence.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentEntityRepository extends JpaRepository<PaymentEntity, UUID> {
}
