package com.yandex.div.core.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipContainer.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J(\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tooltipView", "Landroid/view/View;", "getTooltipView", "()Landroid/view/View;", "addView", "", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "drawChild", "", "canvas", "Landroid/graphics/Canvas;", "drawingTime", "", "updateLocation", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DivTooltipContainer extends DivViewWrapper {
    public DivTooltipContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivTooltipContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ DivTooltipContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivTooltipContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Nullable
    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public void updateLocation(int x, int y, int width, int height) {
        View tooltipView = getTooltipView();
        if (tooltipView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tooltipView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = x;
        marginLayoutParams.topMargin = y;
        marginLayoutParams.height = height;
        marginLayoutParams.width = width;
        tooltipView.requestLayout();
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        if (getChildCount() == 1) {
            Assert.fail("Adding more than one child view to DivTooltipContainer is not allowed.");
        } else {
            super.addView(child, index, params);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
