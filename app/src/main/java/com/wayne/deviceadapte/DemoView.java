package com.wayne.deviceadapte;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Project:DeviceAdapte
 * Author:wayne
 * Date:2016/5/26
 */
public class DemoView extends View {
    public DemoView(Context context) {
        super(context);
        init(context, null);
    }

    public DemoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private TextPaint textPaint;
    private float lineHeight;

    private void init(Context context, AttributeSet attrs) {
        textPaint = new TextPaint();
        textPaint.setColor(Color.GREEN);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.DemoView);
        lineHeight = array.getDimension(
                R.styleable.DemoView_lineHeight, 5
        );

        array.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawText("lineHeight=" + lineHeight, 50, 50, textPaint);
    }
}
