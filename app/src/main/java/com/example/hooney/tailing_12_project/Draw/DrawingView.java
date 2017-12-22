package com.example.hooney.tailing_12_project.Draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hooney on 2017. 12. 20..
 */

public class DrawingView extends View {
    private int type;

    public DrawingView(Context context) {
        super(context);
    }

    public DrawingView(Context context, int type) {
        super(context);
        this.type = type;
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(22);
        paint.setAntiAlias(true);

        switch (type){
            case 1:
                canvas.drawCircle(240, 100, 70, paint);
                canvas.drawText("Circle", 200, 190, paint);
                break;
            case 2:
                //사각형
                canvas.drawRect(190,200,290,300, paint);
                canvas.drawText("Rect", 200, 320, paint);
                break;
            case 3:
                //부채꼴
                RectF rf = new RectF(190, 350, 290, 450);
                canvas.drawArc(rf, 0, 100, true, paint);
                canvas.drawText("Arc", 200, 470, paint);
                break;
            case 4:
                paint.setStrokeWidth(10);
                canvas.drawLine(200, 500, 300, 500, paint);
                canvas.drawText("Line", 200, 530, paint);
                break;
            default:
                break;
        }
    }

}
