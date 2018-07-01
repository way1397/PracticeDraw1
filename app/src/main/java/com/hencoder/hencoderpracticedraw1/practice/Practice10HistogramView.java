package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice10HistogramView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path mPath = new Path();
    Path mPath1 = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPath.moveTo(50, 200);
        mPath.lineTo(50, 700);
        mPath.lineTo(800, 700);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        canvas.drawPath(mPath, mPaint);

        mPath1.addRect(50, 600, 150, 700, Path.Direction.CW);
        mPath1.addRect(200, 200, 300, 700, Path.Direction.CW);
        mPath1.addRect(350, 300, 450, 700, Path.Direction.CW);
        mPath1.addRect(500, 600, 600, 700, Path.Direction.CW);
        mPaint1.setColor(getResources().getColor(R.color.colorAccent));
        canvas.drawPath(mPath1, mPaint1);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
