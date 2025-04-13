package com.example.Payment.service.service;

import com.example.Payment.service.domain.PaymentMethod;
import com.example.Payment.service.modal.PaymentOrder;
import com.example.Payment.service.payload.dto.BookingDTO;
import com.example.Payment.service.payload.dto.UserDTO;
import com.example.Payment.service.payload.response.PaymentLinkResponse;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentLinkResponse createOrder(UserDTO user, BookingDTO booking, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;
    PaymentOrder getPaymentOrderByPaymentId(String paymentId);

    PaymentLink createRazorpayPaymentLink(UserDTO user,Long amount,Long orderId) throws RazorpayException;

    String createStripePaymentLink(UserDTO user,Long amount,Long orderId) throws StripeException;

    Boolean proceedPayment(PaymentOrder paymentOrder,String paymentId,String paymentLinkId) throws RazorpayException;
}
