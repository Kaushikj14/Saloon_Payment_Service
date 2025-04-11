package com.example.Payment.service.repository;

import com.example.Payment.service.modal.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {

    PaymentOrder findByPaymentLinkId(String paymentLinkId);


}
