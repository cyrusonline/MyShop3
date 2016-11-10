package com.example.ck.myshop2.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ck.myshop2.infrastructure.BeastShoppingApplication;
import com.squareup.otto.Bus;

/**
 * Created by chanchikin on 11/10/2016.
 */

public class BaseActivity extends AppCompatActivity{

    protected BeastShoppingApplication application;
    protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (BeastShoppingApplication) getApplication();
        bus = application.getBus();
        bus.register(this);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.register(this);
    }
}
