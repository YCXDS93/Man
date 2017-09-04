package com.hc.manbuy.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gyf.barlibrary.ImmersionBar;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 类用途 :Activity基类
 * 作者 : 于帅光
 * 时间 : 2017/9/2 9:54
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        //butterknife
        unbinder = ButterKnife.bind(this);
        //设置沉浸式
        ImmersionBar.with(this).init();
        ImmersionBar.with(this).transparentStatusBar().fullScreen(true).destroy();
        initView();//初始化数据
        initData();//网络请求

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();//解绑
    }

    public abstract int getLayoutID();//加载视图

    public abstract void initView();

    public abstract void initData();

}
