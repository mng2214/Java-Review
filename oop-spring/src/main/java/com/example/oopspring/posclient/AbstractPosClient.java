package com.example.oopspring.posclient;

import com.example.oopspring.model.pos.PosClientRequest;
import com.example.oopspring.model.pos.PosClientResponse;

import java.util.UUID;

public abstract class AbstractPosClient {

    public UUID generateOrderId(){

        return UUID.randomUUID();
    }

    //calls any banks auth api
    public abstract PosClientResponse auth(PosClientRequest posClientRequest);

    //calls any banks auth3D api
    public abstract PosClientResponse auth3D(PosClientRequest posClientRequest);


}
