package com.example.tanganna.mycustomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.tanganna.mycustomview.bean.MyPieBean;

import java.util.List;

/**
 * Created by TangAnna on 2017/7/10.
 */
public class MyPieView extends View {
    private Paint mPaint;
    private int mWidth,mHeight;
    private List<MyPieBean> mData;
    private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF7CFC00};
    private float mStartAngle = 0;

    public MyPieView(Context context) {
        super(context);
    }

    public MyPieView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();

    }

    private void initPaint() {
        if (mPaint == null) {
            mPaint = new Paint();
        }
        mPaint.setColor(Color.parseColor("#c1c1bf"));
        mPaint.setStyle(Paint.Style.FILL);
//        mPaint.setStrokeWidth(2);
    }


    /**
     * 初始化数据
     * @param mData
     */
    public void initData(List<MyPieBean> mData){
        this.mData = mData;
        invalidate();
    }

    /**
     * 设置圆形的画笔
     */
    private void setPiePaint() {
        if (mPaint == null){
            mPaint = new Paint();
        }
        mPaint.setColor(Color.argb(255,0,0,0));
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
    }

    public MyPieView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        //设计一个矩形
        RectF rect = new RectF(mWidth/6,(mHeight/2- mWidth/3),5*mWidth/6,mHeight-(mHeight/2 - mWidth/3));
//        canvas.drawRect(rect,mPaint);
        setPiePaint();
        //先画一个圆
        canvas.drawCircle(mWidth/2,mHeight/2,mWidth/3,mPaint);
        //画扇形
        mPaint.setStyle(Paint.Style.FILL);
        float currentStartAngle = mStartAngle;
        for (int i = 0; i < mData.size(); i++) {
            mPaint.setColor(mColors[i]);
            canvas.drawArc(rect,currentStartAngle,mData.get(i).arc,true,mPaint);
            currentStartAngle += mData.get(i).arc;
            Log.d("TAG", "onDraw: "+currentStartAngle);
        }

    }
}
