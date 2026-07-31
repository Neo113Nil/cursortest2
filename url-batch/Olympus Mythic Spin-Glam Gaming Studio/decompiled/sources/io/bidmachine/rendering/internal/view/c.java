package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.g;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.AppearanceParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class c extends View implements io.bidmachine.rendering.internal.d, o {
    private final Paint a;
    private float b;
    private int c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new Paint(1);
        this.c = g.c;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLinePaint$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPercent$annotations() {
    }

    @Override // io.bidmachine.rendering.internal.d
    public void a(AppearanceParams appearanceParams) {
        Intrinsics.checkNotNullParameter(appearanceParams, "appearanceParams");
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.d = fillColor.intValue();
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.c = strokeColor.intValue();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getLineBackgroundColor() {
        return this.d;
    }

    public final int getLineColor() {
        return this.c;
    }

    @NotNull
    public final Paint getLinePaint() {
        return this.a;
    }

    public final float getPercent() {
        return this.b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.a.setColor(this.d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.a);
        this.a.setColor(this.c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.b) / 100), measuredHeight, this.a);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i) {
        this.d = i;
    }

    public final void setLineColor(int i) {
        this.c = i;
    }

    public final void setPercent(float f) {
        this.b = f;
    }

    @Override // io.bidmachine.rendering.internal.o
    public void a(long j, long j2, float f) {
        this.b = f;
        postInvalidate();
    }
}
