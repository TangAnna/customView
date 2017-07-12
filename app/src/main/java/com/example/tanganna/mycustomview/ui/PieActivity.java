package com.example.tanganna.mycustomview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tanganna.mycustomview.bean.MyPieBean;
import com.example.tanganna.mycustomview.view.MyPieView;
import com.example.tanganna.mycustomview.R;

import java.util.ArrayList;
import java.util.List;

public class PieActivity extends AppCompatActivity {

    private MyPieView mPieView;
    private List<MyPieBean> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        mPieView = (MyPieView) findViewById(R.id.pie_view);
        initData();
        setData();
    }

    private void setData() {
        mPieView.initData(mData);
    }

    private void initData() {
        int arc = 20;
        mData = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MyPieBean bean = new MyPieBean();
            bean.name = "商品"+"i";
            bean.arc = arc;
            mData.add(bean);
            arc += 20;
            Log.d("TAG", "initData: "+bean.arc);
        }
    }
}
