package com.example.Payment.service.controller;

import com.example.Payment.service.domain.PaymentMethod;
import com.example.Payment.service.modal.PaymentOrder;
import com.example.Payment.service.payload.dto.BookingDTO;
import com.example.Payment.service.payload.dto.UserDTO;
import com.example.Payment.service.payload.response.PaymentLinkResponse;
import com.example.Payment.service.service.PaymentService;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {


    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create")
    public ResponseEntity<PaymentLinkResponse> cratePaymentLink(
            @RequestBody BookingDTO booking,
            @RequestParam PaymentMethod paymentMethod
            ) throws StripeException, RazorpayException {

        UserDTO user = new UserDTO();
        user.setFullName("Ashok");
        user.setEmail("ashok@gmail.com");
        user.setId(1L);

        PaymentLinkResponse res = paymentService.createOrder(user,booking,paymentMethod);


        return ResponseEntity.ok(res);
    }

    @GetMapping("/{paymentOrderId}")
    public ResponseEntity<PaymentOrder> getPaymentOrderById(
            @PathVariable Long paymentOrderId
    ) throws Exception {

        PaymentOrder res = paymentService.getPaymentOrderById(paymentOrderId);

        return ResponseEntity.ok(res);
    }

    @PatchMapping("/proceed")
    public ResponseEntity<Boolean> processPayment(
            @RequestParam String paymentId,
            @RequestParam String paymentLinkId
    ) throws Exception {

        PaymentOrder paymentOrder= paymentService.getPaymentOrderByPaymentId(paymentLinkId);


        Boolean res = paymentService.proceedPayment(paymentOrder,paymentId,paymentLinkId);

        return ResponseEntity.ok(res);
    }
}
