package com.example.ck.myshop2.live;

import android.widget.Toast;

import com.example.ck.myshop2.infrastructure.BeastShoppingApplication;
import com.example.ck.myshop2.services.AccountServices;
import com.squareup.otto.Subscribe;

/**
 * Created by chanchikin on 11/18/2016.
 */

public class LiveAccountServices extends BaseLiveService{
    public LiveAccountServices(BeastShoppingApplication application) {
        super(application);
    }

    @Subscribe
    public void RegisterUsers(AccountServices.RegisterUserRequest request){
        AccountServices.RegisteruserResponse response = new AccountServices.RegisteruserResponse();

        if (request.userEmail.isEmpty()){
            response.setPropertyErrors("email","Please put in your email.");

        }

        if (request.userName.isEmpty()){
            response.setPropertyErrors("userName","Please put in your name.");
        }

        if (response.didSucceed()){
            Toast.makeText(application.getApplicationContext(),"User will be registered shortly",Toast.LENGTH_LONG).show();
        }

        bus.post(response);
    }
}
