package com.example.oopspring.service;


import com.example.oopspring.model.payment.AuthRequest;
import com.example.oopspring.model.payment.PaymentResponse;

public interface PaymentService {
    PaymentResponse auth(AuthRequest authRequest);

    PaymentResponse auth3D(AuthRequest auth3DRequest);
}
