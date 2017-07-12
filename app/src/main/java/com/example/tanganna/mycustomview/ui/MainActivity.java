package com.example.tanganna.mycustomview.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tanganna.mycustomview.R;
import com.example.tanganna.mycustomview.view.MyViewOne;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyViewOne mOne;
    private TextView mTextView;//饼状图
    private TextView mTvTranslate;
    private TextView mTvScale;
    private TextView mTvRotate;
    private TextView mTvDrawPicture;
//    Bitmap b = BitmapFactory.decodeResource()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOne = (MyViewOne) findViewById(R.id.view_one);
        mTextView = (TextView) findViewById(R.id.tv_main_pie);
        mTvTranslate = (TextView) findViewById(R.id.tv_main_translate);
        mTvScale = (TextView) findViewById(R.id.tv_main_scale);
        mTvRotate = (TextView) findViewById(R.id.tv_main_rotate);
        mTvDrawPicture = (TextView) findViewById(R.id.tv_main_picture);
        mTextView.setOnClickListener(this);
        mTvTranslate.setOnClickListener(this);
        mTvScale.setOnClickListener(this);
        mTvRotate.setOnClickListener(this);
        mTvDrawPicture.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_main_translate://移动
                startActivity(new Intent(MainActivity.this, TranslateActivity.class));
                break;
            case R.id.tv_main_pie://饼状图
                startActivity(new Intent(MainActivity.this, PieActivity.class));
                break;
            case R.id.tv_main_scale://缩放
                startActivity(new Intent(MainActivity.this, ScaleActivity.class));
                break;
            case R.id.tv_main_rotate://旋转
                startActivity(new Intent(MainActivity.this, RotateActivity.class));
                break;
            case R.id.tv_main_picture://picture
                startActivity(new Intent(MainActivity.this, DrawPictureActivity.class));
                break;
        }
    }
}
