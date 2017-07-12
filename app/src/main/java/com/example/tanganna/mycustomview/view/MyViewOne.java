package com.example.tanganna.mycustomview.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by TangAnna on 2017/7/10.
 */
public class MyViewOne extends View {
    private static final String TAG = "MyViewOne";
    private Paint mPaint;
    private int mWidth,mHeight;

    public MyViewOne(Context context) {//当调用 new这个方法时会被调用
        super(context);
        Log.d(TAG, "MyViewOne: 一个参数");
    }

    public MyViewOne(Context context, AttributeSet attrs) {//当在layout文件中使用的时候会被调用
        super(context, attrs);
        initPaint();
        Log.d(TAG, "MyViewOne: 两个参数");

    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        if (mPaint == null){
            mPaint = new Paint();
        }
        mPaint.setColor(Color.argb(255,0,0,0));//设置画笔的颜色
        mPaint.setStrokeWidth(10);//设置画笔的宽度
        mPaint.setStyle(Paint.Style.FILL);//设置画笔的模式为填充
    }

    public MyViewOne(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "MyViewOne: 三个参数");
    }



    /**
     * 获取View的大小
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {//得到的宽和高的单位是px
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

//        setMeasuredDimension(100, 200);    //设置view的大小
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

//        Log.d(TAG, "onMeasure: " + " 宽 " + widthSize + " 高 " + heightSize + " 宽的模式 " + widthMode + " 高的模式 " + heightMode);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {//设置setMeasuredDimension方法之后要调用一次此方法最终确定View的大小
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
//        Log.d(TAG, "onSizeChanged: " + " w " + w + " h " + h);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {//确定子View的位置   相对于父布局的位置
        super.onLayout(changed, left, top, right, bottom);

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {//最重要的部分--绘制
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(122, 200, 88, 20)); //绘制颜色  常用于绘制底色、背景色
        canvas.drawPoint(50,100,mPaint);
        canvas.drawPoint(25,50,mPaint);
        mPaint.setColor(Color.argb(255,255,255,255));
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawLine(0,0,mWidth,mHeight,mPaint);//画线
        mPaint.setColor(Color.argb(255,255,0,0));
        canvas.drawRect(25,75,75,125,mPaint);//画矩形
        mPaint.setColor(Color.argb(255,0,255,0));
        Rect rect = new Rect(0,0,25,25);
        canvas.drawRect(rect,mPaint);
        mPaint.setColor(Color.argb(255,0,0,255));
        RectF rectF = new RectF(75,175,100,200);
        canvas.drawRect(rectF,mPaint);
        mPaint.setColor(Color.parseColor("#a6a5a5"));
        canvas.drawRoundRect(mWidth/4,mHeight/4,mWidth*3/4,mHeight*3/4,30,30,mPaint);//画带圆角的矩形
        mPaint.setColor(Color.argb(255,255,0,0));
        canvas.drawRoundRect(mWidth/4,mHeight/4,mWidth*3/4,mHeight*3/4,mWidth/2,mHeight/2,mPaint);//画带圆角的矩形
        mPaint.setColor(Color.parseColor("#a6a5a5"));
        int r = 100;
        canvas.drawCircle(mWidth-r,r,r,mPaint);//画圆


    }
}
