package com.example.arcprogressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import java.util.logging.Handler;

public class RoundProgressBar extends View {
    private Paint paint;
    private float maxprogess;
    private float currentprogess;
    private float strokewidth;
    private RectF rectF;
    private int endprogessradius;
    private int backcolor,progesscolor,endprogesscolor;
    private OnProgressChangeListner onProgressChangeListner;

    public void setOnProgressChangeListner(OnProgressChangeListner onProgressChangeListner) {
        this.onProgressChangeListner = onProgressChangeListner;
    }

    public float getMaxprogess() {
        return maxprogess;
    }

    public RoundProgressBar(Context context) {
        this(context, null);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }


    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        if(attributeSet == null){
            return;
        }

        TypedArray ta = getContext().obtainStyledAttributes(attributeSet, R.styleable.MyCustomView);
        maxprogess=ta.getInteger(R.styleable.MyCustomView_maxprogress,100);
        currentprogess=ta.getInteger(R.styleable.MyCustomView_progress,0);
        strokewidth=ta.getDimensionPixelSize(R.styleable.MyCustomView_strokewidth,8);
        endprogessradius=ta.getDimensionPixelSize(R.styleable.MyCustomView_endprogressradius,15);
        backcolor=ta.getColor(R.styleable.MyCustomView_backcolor,Color.parseColor("#e0e0e0"));
        progesscolor=ta.getColor(R.styleable.MyCustomView_progresscolor,Color.BLUE);
        endprogesscolor=ta.getColor(R.styleable.MyCustomView_endprogresscolor,Color.BLUE);

    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rectF = new RectF(strokewidth * 2, strokewidth * 2, getWidth() - strokewidth * 2, getHeight() - strokewidth * 2);
        this.paint.setStyle(Style.STROKE);
        this.paint.setStrokeWidth(this.strokewidth);
        this.paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);




    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onProgressChangeListner.onProgressChange(currentprogess);

    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        // canvas.drawRoundRect(rectF,5,5,paint);

        paint.setStyle(Style.STROKE);
        paint.setColor(backcolor);
        paint.setStrokeWidth(strokewidth - 1);
        canvas.drawArc(rectF, -72, 324, false, this.paint);

        float angle = 324.0f * currentprogess / maxprogess;
        float centerx = (getWidth()) / 2;
        float centery = (getHeight()) / 2;
        float radius = (getWidth() - strokewidth * 4) / 2;

        paint.setStrokeWidth(strokewidth-1);
        paint.setColor(progesscolor);
        canvas.drawArc(rectF, -72.0f, angle, false, this.paint);
        float xend = (float) ((radius) * Math.cos(Math.toRadians(angle - 72)) + centerx);
        float yend = (float) ((radius) * Math.sin(Math.toRadians(angle - 72)) + centery);
        paint.setColor(endprogesscolor);
        paint.setStyle(Style.FILL);
        if (currentprogess>0)
        canvas.drawCircle(xend, yend, endprogessradius, paint);
    }

    public void setMaxprogess(int maxprogess) {
        this.maxprogess = maxprogess;
        invalidate();
    }

    public void setCurrentprogess(float currentprogess1, boolean isanimate) {
        if (isanimate) {
            ValueAnimator valueAnimator = ValueAnimator.ofFloat(currentprogess, currentprogess1).setDuration(500);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {

                    currentprogess = (float) animation.getAnimatedValue();
                    invalidate();
                    if (onProgressChangeListner!=null)onProgressChangeListner.onProgressChange(currentprogess);

                }
            });
            valueAnimator.start();
        } else {
            currentprogess = currentprogess1;
            invalidate();
            if (onProgressChangeListner!=null)onProgressChangeListner.onProgressChange(currentprogess);


        }

    }
}