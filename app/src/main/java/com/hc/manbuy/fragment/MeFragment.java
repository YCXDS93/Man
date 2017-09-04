package com.hc.manbuy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hc.manbuy.R;
import com.hc.manbuy.activity.LoginActivity;
import com.hc.manbuy.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 类用途 :我的页面
 * 作者 : 于帅光
 * 时间 : 2017/9/4 9:54
 */

public class MeFragment extends BaseFragment implements View.OnClickListener{


    @BindView(R.id.goods)
    TextView goods;//商品收藏
    @BindView(R.id.store)
    TextView store;//店铺收藏
    @BindView(R.id.footprint)
    TextView footprint;//我的足迹
    @BindView(R.id.logon)
    RelativeLayout logon;//登录
    @BindView(R.id.all_orders)
    TextView allOrders;//全部订单
    @BindView(R.id.obligation)
    TextView obligation;//未付款
    @BindView(R.id.drop_shipping)
    TextView dropShipping;//待发货
    @BindView(R.id.wait)
    TextView wait;//待收货
    @BindView(R.id.appraise)
    TextView appraise;//待评价
    @BindView(R.id.drawback)
    TextView drawback;//退款/货
    @BindView(R.id.my_pleasure)
    TextView myPleasure;//我的财产
    @BindView(R.id.prepaid_deposit)
    TextView prepaidDeposit;//预存款
    @BindView(R.id.refill_card)
    TextView refillCard;//充值卡
    @BindView(R.id.voucher)
    TextView voucher;//代金券
    @BindView(R.id.red_packet)
    TextView redPacket;//红包
    @BindView(R.id.integral)
    TextView integral;//积分
    @BindView(R.id.shipping_address)
    TextView shippingAddress;//收货地址
    @BindView(R.id.system_setup)
    TextView systemSetup;//系统设置
    Unbinder unbinder;

    @Override
    public int getLayOutId() {
        return R.layout.me_fragment;
    }
    //初始化数据
    @Override
    protected void initView() {
        goods.setOnClickListener(this);
        store.setOnClickListener(this);
        footprint.setOnClickListener(this);
        logon.setOnClickListener(this);
        allOrders.setOnClickListener(this);
        obligation.setOnClickListener(this);
        dropShipping.setOnClickListener(this);
        wait.setOnClickListener(this);
        appraise.setOnClickListener(this);
        drawback.setOnClickListener(this);
        myPleasure.setOnClickListener(this);
        prepaidDeposit.setOnClickListener(this);
        refillCard.setOnClickListener(this);
        voucher.setOnClickListener(this);
        redPacket.setOnClickListener(this);
        integral.setOnClickListener(this);
        shippingAddress.setOnClickListener(this);
        systemSetup.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //登录
            case R.id.logon:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                getActivity().overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                break;
        }
    }
}
