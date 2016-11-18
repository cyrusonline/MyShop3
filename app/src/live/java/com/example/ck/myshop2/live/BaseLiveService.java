package com.example.ck.myshop2.live;

import com.example.ck.myshop2.infrastructure.BeastShoppingApplication;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.otto.Bus;

/**
 * Created by chanchikin on 11/17/2016.
 */

public class BaseLiveService {
    protected Bus bus;
    protected BeastShoppingApplication application;
    protected FirebaseAuth auth;

    public BaseLiveService(BeastShoppingApplication application) {
        this.application = application;
        bus = application.getBus();
        auth = FirebaseAuth.getInstance();

    }
}


