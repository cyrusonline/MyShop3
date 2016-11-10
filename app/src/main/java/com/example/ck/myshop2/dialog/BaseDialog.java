package com.example.ck.myshop2.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import com.example.ck.myshop2.infrastructure.BeastShoppingApplication;
import com.squareup.otto.Bus;

/**
 * Created by chanchikin on 11/10/2016.
 */

public class BaseDialog extends DialogFragment {

    protected BeastShoppingApplication application;
    protected Bus bus;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (BeastShoppingApplication)getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
