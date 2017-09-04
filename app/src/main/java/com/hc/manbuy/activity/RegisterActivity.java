package com.hc.manbuy.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.hc.manbuy.R;
import com.hc.manbuy.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 类用途 :登录页面
 * 作者 : 于帅光
 * 时间 : 2017/9/4 9:54
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener{

    @BindView(R.id.user_back)
    ImageView userBack;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_two_password)
    EditText etTwoPassword;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.register)
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    public int getLayoutID() {
        return R.layout.activity_register;

    }

    @Override
    public void initView() {
        userBack.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.user_back:
                finish();
                break;
        }
    }
}
