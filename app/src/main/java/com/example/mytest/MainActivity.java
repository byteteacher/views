package com.example.mytest;

import android.graphics.Color;
import android.util.Log;
import android.widget.CompoundButton;

import com.byteteacher.library.base.BaseActivity;
import com.example.viewtest.R;


public class MainActivity extends BaseActivity {

    private static final String TAG = "cj";


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {



    }

    /**
     * dp 转 px(像素)
     */
    public int dp2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


}
