package com.hc.manbuy.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.hc.manbuy.R;
import com.hc.manbuy.activity.ZxingActivity;
import com.hc.manbuy.base.BaseFragment;

import static android.app.Activity.RESULT_OK;

/**
 * 类用途 :首页
 * 作者 : 于帅光
 * 时间 : 2017/9/4 9:54
 */
public class HomeFragment extends BaseFragment {

    @Override
    public int getLayOutId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initView(View view) {
        ImageView saomiao=view.findViewById(R.id.saomiao);
        saomiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //扫一扫
                IntentIntegrator integrator = new IntentIntegrator(getActivity());
                // 设置要扫描的条码类型，ONE_D_CODE_TYPES：一维码，QR_CODE_TYPES-二维码
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setCaptureActivity(ZxingActivity.class);
                integrator.setPrompt("请扫描二维码"); //底部的提示文字，设为""可以置空
                integrator.setCameraId(0); //前置或者后置摄像头
                integrator.setBeepEnabled(false); //扫描成功的「哔哔」声，默认开启
                integrator.setBarcodeImageEnabled(true);//是否保留扫码成功时候的截图
                integrator.initiateScan();

            }
        });
    }

    @Override
    protected void initData() {

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            String result = data.getExtras().getString("result");

        }
    }
}
