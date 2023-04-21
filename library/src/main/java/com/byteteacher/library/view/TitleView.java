package com.byteteacher.library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 通用顶部titlebar控件
 */
public class TitleView extends LinearLayout {

    private static final String TAG = "cj";
    private TextView tv_title;
    private ImageView iv_title_right;
    private TextView tv_title_right;
    private RelativeLayout rl_title_bar;
    private ImageView iv_title_left;


    public TitleView(Context context) {
        this(context, null);
    }

    public TitleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public TitleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleView, defStyleAttr, defStyleRes);
        String titleName = typedArray.getString(R.styleable.TitleView_titleName);
        setTitleName(titleName);
        typedArray.recycle();
    }

    /**
     * 初始化为通用样式
     */
    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.titleview, this, true);
        iv_title_left = findViewById(R.id.iv_title_left);
        tv_title = findViewById(R.id.tv_title);
        iv_title_right = findViewById(R.id.iv_title_right);
        tv_title_right = findViewById(R.id.tv_title_right);
        rl_title_bar = findViewById(R.id.rl_title_bar);
    }


    public void setTitleName(String name) {
        tv_title.setText(name);
    }


}
