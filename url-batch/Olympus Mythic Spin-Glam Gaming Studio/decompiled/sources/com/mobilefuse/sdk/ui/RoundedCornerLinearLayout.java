package com.mobilefuse.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mobilefuse.sdk.Utils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoundedCornerLinearLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/ui/RoundedCornerLinearLayout;", "Landroid/widget/LinearLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "cornerRadius", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IF)V", "clipPath", "Landroid/graphics/Path;", "shadowPaint", "Landroid/graphics/Paint;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "getPxFromDp", "value", "onSizeChanged", "w", "h", "oldw", "oldh", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes14.dex */
public final class RoundedCornerLinearLayout extends LinearLayout {
    private Path clipPath;
    private float cornerRadius;
    private final Context ctx;
    private final Paint shadowPaint;

    public RoundedCornerLinearLayout(@NotNull Context context) {
        this(context, null, 0, 0.0f, 14, null);
    }

    public RoundedCornerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0.0f, 12, null);
    }

    public RoundedCornerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0.0f, 8, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerLinearLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i, float f) {
        super(ctx, attributeSet, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.cornerRadius = f;
        this.clipPath = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setShadowLayer(getPxFromDp(8), getPxFromDp(4), getPxFromDp(4), Color.argb(100, 0, 0, 0));
        Unit unit = Unit.INSTANCE;
        this.shadowPaint = paint;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.clipPath.reset();
        RectF rectF = new RectF(0.0f, 0.0f, w, h);
        Path path = this.clipPath;
        float f = this.cornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.clipPath.close();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        setLayerType(1, null);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        canvas.save();
        canvas.translate(getPxFromDp(10), getPxFromDp(10));
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.shadowPaint);
        canvas.restore();
        canvas.restore();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        setLayerType(0, null);
    }

    private final float getPxFromDp(int value) {
        return Utils.convertDpToPx(getContext(), value);
    }
}
