package com.example.tanganna.mycustomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TangAnna on 2017/7/11.
 */
public class MyScaleView extends View {
    private Paint mPaint;
    private int mWidth,mHeight;

    public MyScaleView(Context context) {
        super(context);
    }

    public MyScaleView(Context context, AttributeSet attrs) {
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
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
    }

    public MyScaleView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        canvas.translate(mWidth/2,mHeight/2);
        RectF rect = new RectF(-mWidth/2,-mWidth/2,mWidth/2,mWidth/2);
        canvas.drawRect(rect,mPaint);
//        mPaint.setColor(Color.RED);
//        canvas.scale(0.5f,0.5f);//两个参数的是只缩放不移动缩放中心
//        canvas.drawRect(rect,mPaint);
//        canvas.scale(0.5f,-0.5f);//缩放值为负数时会反转
//        canvas.scale(0.5f,0.5f,200,-200);//缩放中心移动  （缩放中心移动时要对应着原图和缩放中心进行缩放）
//        canvas.drawRect(rect,mPaint);
        for (int i = 0; i < 30; i++) {
            canvas.scale(0.9f,0.9f);
            canvas.drawRect(rect,mPaint);
        }

    }
}
