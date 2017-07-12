package com.example.tanganna.mycustomview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tanganna.mycustomview.R;
import com.example.tanganna.mycustomview.view.MyScaleView;

public class ScaleActivity extends AppCompatActivity {

    private MyScaleView mScaleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scale);
        mScaleView = (MyScaleView) findViewById(R.id.scale_view);
    }
}
