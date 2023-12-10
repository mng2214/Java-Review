package com.example.oopspring.service.impl.selection;


import com.example.oopspring.model.payment.AuthRequest;
import com.example.oopspring.model.pos.Pos;
import com.example.oopspring.service.PosSelectionService;

import static com.example.oopspring.constant.StaticConstants.POS_LIST;

public class HybridPosSelectionServiceImpl implements PosSelectionService {

    @Override
    //Since there is no cost calculation among hybrid pos,
    // we are trying to find the pos that the merchant wants the payment to be made.
    public Pos decidePaymentPos(AuthRequest authRequest) {
        return POS_LIST.stream().
                filter(pos -> authRequest.getPosName().equals(pos.getName())).findFirst().orElse(POS_LIST.get(0));
    }
}
