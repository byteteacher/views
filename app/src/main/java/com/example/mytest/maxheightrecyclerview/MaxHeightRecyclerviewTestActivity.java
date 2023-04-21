package com.example.mytest.maxheightrecyclerview;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.byteteacher.library.base.BaseActivity;
import com.byteteacher.library.view.MaxHeightRecyclerView;
import com.example.mytest.maxheightrecyclerview.MaxHeightAdapter;
import com.example.viewtest.R;


public class MaxHeightRecyclerviewTestActivity extends BaseActivity {

    private static final String TAG = "cj";
    private MaxHeightRecyclerView rvTest;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_max_height_recyclerview;
    }

    @Override
    protected void initView() {
        rvTest = findViewById(R.id.rv_test);
        rvTest.setLayoutManager(new LinearLayoutManager(this));
        rvTest.setAdapter(new MaxHeightAdapter(this));
    }


}
