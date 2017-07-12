package com.example.tanganna.mycustomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TangAnna on 2017/7/11.
 */
public class MyRotateView extends View {

    private Paint mPaint;
    private int mWidth, mHeight;

    public MyRotateView(Context context) {
        super(context);
    }

    public MyRotateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    /**
     * 初始化画笔
     */
    private void initView() {
        if (mPaint == null) {
            mPaint = new Paint();
        }
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
    }

    public MyRotateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(mWidth / 2, mHeight / 2);
        canvas.drawLine(0, -mHeight / 2, 0, mHeight / 2, mPaint);
        canvas.drawLine(-mWidth / 2, 0, mWidth / 2, 0, mPaint);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(10);
        for (int i = 0; i < 12; i++) {
            canvas.drawCircle(0, -300, 100, mPaint);
            canvas.rotate(30f);
        }
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(2);
        canvas.drawCircle(0,0,200,mPaint);
        canvas.drawCircle(0,0,150,mPaint);
        for (int i = 0; i < 360; i++) {
            canvas.drawLine(0,0,0,-200,mPaint);
            canvas.rotate(10);
        }

    }
}
