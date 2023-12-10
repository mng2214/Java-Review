package com.example.oopspring.model.payment;

import com.example.oopspring.enums.CardType;
import com.example.oopspring.enums.Localization;
import com.example.oopspring.enums.ServiceProvider;
import com.example.oopspring.helper.ObjectHelper;
import lombok.Getter;

import java.math.BigDecimal;

public class AuthRequest extends AbstractPaymentRequest {

    @Getter
    private ServiceProvider serviceProvider;
    @Getter
    private String posName;
    @Getter
    private CardType cardType;
    private Integer installment;
    private boolean hybridPayment;

    public AuthRequest(BigDecimal amount,
                       Localization locale,
                       String conversationId,
                       ServiceProvider serviceProvider,
                       String posName,
                       CardType cardType,
                       Integer installment) {

        super(amount, locale, conversationId);
        this.serviceProvider = serviceProvider;
        this.posName = posName;
        this.cardType = cardType;
        this.installment = installment;
    }


    public Integer getInstallment() {
        if (ObjectHelper.isNotPresent(installment)){
            return 1;
        }
        return installment;
    }


    // decide payment will be processed as hybrid or tenant
    public boolean isHybridPayment() {
        return (hybridPayment && ObjectHelper.isPresent(posName))?Boolean.TRUE: Boolean.FALSE;
    }

}
