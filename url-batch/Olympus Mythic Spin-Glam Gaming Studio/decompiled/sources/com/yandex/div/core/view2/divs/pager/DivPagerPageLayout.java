package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPagerPageLayout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "context", "Landroid/content/Context;", "isHorizontal", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "drawChild", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "drawingTime", "", "getMinimumSize", "", "parentSpec", "getSpec", "size", "alongScrollAxis", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class DivPagerPageLayout extends DivViewWrapper {

    @NotNull
    private final Function0 isHorizontal;

    @Override // com.yandex.div.core.widget.DivViewWrapper, com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public DivPagerPageLayout(@NotNull Context context, @NotNull Function0 function0) {
        super(context, null, 0, 6, null);
        this.isHorizontal = function0;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean booleanValue = ((Boolean) this.isHorizontal.mo4828invoke()).booleanValue();
        if (booleanValue) {
            setMinimumHeight(getMinimumSize(heightMeasureSpec));
        } else {
            setMinimumWidth(getMinimumSize(widthMeasureSpec));
        }
        super.onMeasure(getSpec(layoutParams.width, widthMeasureSpec, booleanValue), getSpec(layoutParams.height, heightMeasureSpec, !booleanValue));
    }

    private final int getMinimumSize(int parentSpec) {
        if (ViewsKt.isUnspecified(parentSpec)) {
            return 0;
        }
        return View.MeasureSpec.getSize(parentSpec);
    }

    private final int getSpec(int size, int parentSpec, boolean alongScrollAxis) {
        return (alongScrollAxis || size == -1 || size == -3) ? parentSpec : ViewsKt.makeUnspecifiedSpec();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
