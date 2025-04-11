package com.example.Payment.service.service.impl;

import com.example.Payment.service.domain.PaymentMethod;
import com.example.Payment.service.modal.PaymentOrder;
import com.example.Payment.service.payload.dto.BookingDTO;
import com.example.Payment.service.payload.dto.UserDTO;
import com.example.Payment.service.payload.response.PaymentLinkResponse;
import com.example.Payment.service.repository.PaymentOrderRepository;
import com.example.Payment.service.service.PaymentService;
import com.razorpay.PaymentLink;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
//@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentOrderRepository paymentOrderRepository;

    public PaymentServiceImpl(PaymentOrderRepository paymentOrderRepository) {
        this.paymentOrderRepository = paymentOrderRepository;
    }

    @Override
    public PaymentLinkResponse createOrder(UserDTO user, BookingDTO booking, PaymentMethod paymentMethod) {
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderById(Long id) {
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderByPaymentId(String paymentId) {
        return null;
    }

    @Override
    public PaymentLink createRazorpayPaymentLink(UserDTO user, Long amount, Long orderId) {
        return null;
    }

    @Override
    public String createStripePaymentLink(UserDTO user, Long amount, Long orderId) {
        return "";
    }
}
