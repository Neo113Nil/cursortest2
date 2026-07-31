package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;

/* loaded from: classes4.dex */
public class LinearCountdownView extends View implements IabElement {
    private final Paint a;
    private float b;
    private float c;
    private int d;
    private int e;

    public LinearCountdownView(@NonNull Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = 0.0f;
        this.c = 15.0f;
        this.d = Assets.MAIN_ASSETS_COLOR;
        this.e = 0;
        a();
    }

    private void a() {
        this.c = Utils.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f) {
        this.b = f;
        postInvalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public int getLineColor() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.a.setStrokeWidth(this.c);
        this.a.setColor(this.e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.a);
        this.a.setColor(this.d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.b) / 100.0f), measuredHeight, this.a);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.d = iabElementStyle.getStrokeColor().intValue();
        this.e = iabElementStyle.getFillColor().intValue();
        this.c = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setAlpha(iabElementStyle.getOpacity().floatValue());
        postInvalidate();
    }

    public LinearCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
        this.b = 0.0f;
        this.c = 15.0f;
        this.d = Assets.MAIN_ASSETS_COLOR;
        this.e = 0;
        a();
    }
}
