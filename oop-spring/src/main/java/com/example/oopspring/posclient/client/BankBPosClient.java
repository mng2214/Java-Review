package com.example.oopspring.posclient.client;


import com.example.oopspring.model.pos.PosClientRequest;
import com.example.oopspring.model.pos.PosClientResponse;
import com.example.oopspring.posclient.AbstractPosClient;

public class BankBPosClient extends AbstractPosClient {

    // return dummy response
    @Override
    public PosClientResponse auth(PosClientRequest posClientRequest) {
        return new PosClientResponse(1, null, posClientRequest.getRequestedAmount());
    }

    // return dummy response
    @Override
    public PosClientResponse auth3D(PosClientRequest posClientRequest) {
        return new PosClientResponse(0, "1345", posClientRequest.getRequestedAmount());
    }
}
