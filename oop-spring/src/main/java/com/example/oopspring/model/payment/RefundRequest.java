package com.example.oopspring.model.payment;

import com.example.oopspring.enums.Localization;

import java.math.BigDecimal;

public class RefundRequest extends AbstractPaymentRequest {
    public RefundRequest(BigDecimal amount, Localization locale, String conversationId) {
        super(amount, locale, conversationId);
    }
}
