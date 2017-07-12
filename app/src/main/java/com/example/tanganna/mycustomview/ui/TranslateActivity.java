package com.example.tanganna.mycustomview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tanganna.mycustomview.view.MyTranslateView;
import com.example.tanganna.mycustomview.R;

public class TranslateActivity extends AppCompatActivity {

    private MyTranslateView mMyTranslateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_translate);
        mMyTranslateView = (MyTranslateView) findViewById(R.id.translate);
    }
}
