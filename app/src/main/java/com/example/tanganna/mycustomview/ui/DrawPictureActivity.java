package com.example.tanganna.mycustomview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tanganna.mycustomview.R;
import com.example.tanganna.mycustomview.view.MyDrawPictureView;

public class DrawPictureActivity extends AppCompatActivity {

    private MyDrawPictureView mPictureView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_picture);
        mPictureView = (MyDrawPictureView) findViewById(R.id.draw_picture);
        mPictureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPictureView.check();
            }
        });
    }
}
