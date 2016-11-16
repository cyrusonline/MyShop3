package com.example.ck.myshop2.services;

import android.app.ProgressDialog;

import com.example.ck.myshop2.infrastructure.ServiceResponse;

/**
 * Created by chanchikin on 11/16/2016.
 */

public class AccountServices {
    private AccountServices(){

    }

    public static class RegisterUserRequest{
        public String userName;
        public String userEmail;
        public ProgressDialog progressDialog;

        public RegisterUserRequest(String userName, String userEmail, ProgressDialog progressDialog){
            this.userName = userName;
            this.userEmail = userEmail;
            this.progressDialog = progressDialog;

        }


    }

    public static class RegisteruserResponse extends ServiceResponse{

    }

}
