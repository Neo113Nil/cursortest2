package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.u10;
import yads.v10;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/RoundImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lyads/v10;", "cornerViewRenderingControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILyads/v10;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoundImageView extends ImageView {
    private final u10 a;

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context) {
        this(context, null, 0, null, 14, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.a;
        if (u10Var.d != null && !u10Var.c.isEmpty()) {
            canvas.clipPath(u10Var.c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.a();
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, v10 v10Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new v10() : v10Var);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull v10 v10Var) {
        super(context, attributeSet, i);
        float f;
        v10Var.getClass();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalRoundImageView, i, 0);
            f = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        this.a = new u10(this, f2, f2, f2, f2);
    }
}
