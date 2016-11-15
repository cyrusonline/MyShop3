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
public class RegisterActivity extends BaseActivity{

    @BindView(R.id.activity_register_loginButton)
    Button loginButton;

    @BindView(R.id.activity_register_linear_layout)
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        linearLayout.setBackgroundResource(R.drawable.background_screen_two);
    }

    @OnClick(R.id.activity_register_loginButton)
    public void setLoginButton(){
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}
