package com.example.Payment.service.service;

import com.example.Payment.service.domain.PaymentMethod;
import com.example.Payment.service.modal.PaymentOrder;
import com.example.Payment.service.payload.dto.BookingDTO;
import com.example.Payment.service.payload.dto.UserDTO;
import com.example.Payment.service.payload.response.PaymentLinkResponse;
import com.razorpay.PaymentLink;

public interface PaymentService {

    PaymentLinkResponse createOrder(UserDTO user, BookingDTO booking, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id);
    PaymentOrder getPaymentOrderByPaymentId(String paymentId);

    PaymentLink createRazorpayPaymentLink(UserDTO user,Long amount,Long orderId);

    String createStripePaymentLink(UserDTO user,Long amount,Long orderId);
}
