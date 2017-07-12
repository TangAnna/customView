package com.example.tanganna.mycustomview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tanganna.mycustomview.R;
import com.example.tanganna.mycustomview.view.MyRotateView;

public class RotateActivity extends AppCompatActivity {

    private MyRotateView mRotateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rotate);
        mRotateView = (MyRotateView) findViewById(R.id.rotate_view);
    }
}
