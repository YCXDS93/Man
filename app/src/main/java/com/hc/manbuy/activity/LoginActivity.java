package com.hc.manbuy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hc.manbuy.R;
import com.hc.manbuy.base.BaseActivity;

import butterknife.BindView;

/**
 * 类用途 :登录页面
 * 作者 : 于帅光
 * 时间 : 2017/9/4 9:54
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    @BindView(R.id.login_back)
    ImageView loginBack;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.login)
    Button login;//登录
    @BindView(R.id.log_register)
    TextView register;//注册账号
    @BindView(R.id.forgot_password)
    TextView forgotPassword;//找回密码

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        login.setOnClickListener(this);
        loginBack.setOnClickListener(this);
        register.setOnClickListener(this);
        forgotPassword.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_back:
                finish();
                break;
            case R.id.login:
                break;
            case R.id.log_register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
//                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                break;
            case R.id.forgot_password:

                break;
        }
    }
}
