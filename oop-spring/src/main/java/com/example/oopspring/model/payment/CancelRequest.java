package com.example.oopspring.model.payment;

import com.example.oopspring.enums.Localization;

import java.math.BigDecimal;

public class CancelRequest extends AbstractPaymentRequest {
    public CancelRequest(BigDecimal amount, Localization locale, String conversationId) {
        super(amount, locale, conversationId);
    }
}
