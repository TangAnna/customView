package com.example.tanganna.mycustomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TangAnna on 2017/7/10.
 */
public class MyTranslateView extends View {
    private Paint mPaint;
    public MyTranslateView(Context context) {
        super(context);
    }

    public MyTranslateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        if (mPaint == null){
            mPaint = new Paint();
        }
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(15);
    }

    public MyTranslateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(140,200);//第一次移动
        canvas.drawCircle(0,0,100,mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.translate(220,0);//第二次移动
        canvas.drawCircle(0,0,100,mPaint);
        mPaint.setColor(Color.RED);
        canvas.translate(220,0);//第三次移动
        canvas.drawCircle(0,0,100,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.translate(-120,120);//第四次移动
        canvas.drawCircle(0,0,100,mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.translate(-220,0);//第五次移动
        canvas.drawCircle(0,0,100,mPaint);

    }
}
