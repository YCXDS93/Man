package com.hc.manbuy.activity;

import android.graphics.Color;

import com.hc.manbuy.R;
import com.hc.manbuy.base.BaseActivity;
import com.hc.manbuy.fragment.ClassfyFragment;
import com.hc.manbuy.fragment.HomeFragment;
import com.hc.manbuy.fragment.MeFragment;
import com.hc.manbuy.fragment.ShopingFragment;
import com.hjm.bottomtabbar.BottomTabBar;
/**
 * 类用途 :主页面
 * 作者 : 于帅光
 * 时间 : 2017/9/4 9:54
 */
public class MainActivity extends BaseActivity {

    private BottomTabBar bottomTabBar;

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        //查找控件
        bottomTabBar = (BottomTabBar) findViewById(R.id.bottom_tab_bar);
        bottomTabBar.init(getSupportFragmentManager())
                .setImgSize(30, 30)
                .setFontSize(12)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页", R.drawable.ic_nav_home_press, R.drawable.ic_nav_home, HomeFragment.class)
                .addTabItem("分类", R.drawable.ic_nav_class_press, R.drawable.ic_nav_class, ClassfyFragment.class)
                .addTabItem("购物车", R.drawable.ic_nav_cart_press, R.drawable.ic_nav_cart, ShopingFragment.class)
                .addTabItem("我的", R.drawable.ic_nav_user_press, R.drawable.ic_nav_user, MeFragment.class)
                .isShowDivider(true);
    }

    @Override
    public void initData() {

    }
}
