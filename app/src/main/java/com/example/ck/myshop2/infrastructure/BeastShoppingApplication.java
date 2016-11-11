package com.example.ck.myshop2.infrastructure;

import android.app.Application;

import com.firebase.client.Firebase;
import com.squareup.otto.Bus;

/**
 * Created by chanchikin on 11/10/2016.r
 */

public class BeastShoppingApplication extends Application{

    private Bus bus;

    public BeastShoppingApplication() {
        bus = new Bus();

    }

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

    public Bus getBus() {
        return bus;
    }
}
