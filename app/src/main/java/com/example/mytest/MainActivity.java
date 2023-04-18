package com.example.mytest;

import android.content.Intent;
import android.view.View;

import com.byteteacher.library.base.BaseActivity;
import com.example.mytest.activity.MaxHeightRecyclerviewTestActivity;
import com.example.viewtest.R;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "cj";


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {


    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_start) {
            startActivity(new Intent(this, MaxHeightRecyclerviewTestActivity.class));
        }
    }
}
