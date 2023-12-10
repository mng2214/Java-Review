package com.example.oopspring.service;

import com.example.oopspring.model.payment.AuthRequest;
import com.example.oopspring.model.pos.Pos;

public interface PosSelectionService {
    Pos decidePaymentPos(AuthRequest authRequest);
}
