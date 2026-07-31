package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.bj1;
import yads.cj1;
import yads.jy;
import yads.rz2;
import yads.u10;
import yads.xi1;
import yads.yi1;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedViewContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyads/cj1;", "measureSpecProvider", "", "setMeasureSpecProvider", "(Lyads/cj1;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtendedViewContainer extends FrameLayout {
    private final u10 a;
    private final cj1 b;
    private cj1 c;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.a;
        if (u10Var.d != null && !u10Var.c.isEmpty()) {
            canvas.clipPath(u10Var.c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bj1 a = this.c.a(i, i2);
        super.onMeasure(a.a, a.b);
        this.a.a();
    }

    public final void setMeasureSpecProvider(@NotNull cj1 measureSpecProvider) {
        this.c = new jy(this.b, measureSpecProvider);
        requestLayout();
        invalidate();
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            i3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize);
            i4 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize);
            i2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize);
            this.b = new jy(new yi1(this, obtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f)), new xi1(this, obtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f)));
            obtainStyledAttributes.recycle();
        } else {
            this.b = new rz2();
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        this.c = this.b;
        this.a = new u10(this, i3, i4, i5, i2);
        setWillNotDraw(false);
    }
}
