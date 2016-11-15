package com.example.ck.myshop2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.ck.myshop2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chanchikin on 11/15/2016.
 */

public class LoginActivity extends BaseActivity{

    @BindView(R.id.activity_main_linear_layout)
    LinearLayout linearLayout;

    @BindView(R.id.activity_login_registerButton)
    Button registerButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        linearLayout.setBackgroundResource(R.drawable.background_screen_two);


    }

    @OnClick(R.id.activity_login_registerButton)
    public void setRegisterButton(){
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }

}
