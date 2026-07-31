package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;

/* loaded from: classes8.dex */
public class IabTextView extends TextView implements IabElement {
    private final RectF a;
    private GradientDrawable b;
    private Paint c;
    private boolean d;

    public IabTextView(@NonNull Context context) {
        super(context);
        this.a = new RectF();
        this.d = false;
        a(context);
    }

    protected void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(Assets.BACKGROUND_COLOR);
        this.b.setShape(0);
        setBackgroundDrawable(this.b);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.d || this.c == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.a, height, height, this.c);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i2) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float measureText = getPaint().measureText(getText(), 0, getText().length());
            float f = size2;
            if (f < measureText) {
                float textSize = (int) (getTextSize() * (f / measureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        super.onSizeChanged(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i2 / 2.0f);
        }
        if (!this.d || (paint = this.c) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f = 0.0f + strokeWidth;
        this.a.set(f, f, i - strokeWidth, i2 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        boolean booleanValue = iabElementStyle.isOutlined().booleanValue();
        this.d = booleanValue;
        if (booleanValue) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.c.setColor(iabElementStyle.getStrokeColor().intValue());
            this.c.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(iabElementStyle.getStrokeColor().intValue());
        setBackgroundColor(iabElementStyle.getFillColor().intValue());
        setTextSize(0, iabElementStyle.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, iabElementStyle.getFontStyle().intValue()));
        setAlpha(iabElementStyle.getOpacity().floatValue());
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
    }

    public IabTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new RectF();
        this.d = false;
        a(context);
    }
}
