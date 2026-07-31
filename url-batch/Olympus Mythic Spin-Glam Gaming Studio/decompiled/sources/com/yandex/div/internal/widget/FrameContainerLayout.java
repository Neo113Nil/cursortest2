package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameContainerLayout.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0002J \u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u000207H\u0014J \u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0002J\u0010\u0010:\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0002J\u0010\u0010;\u001a\u00020)2\u0006\u00100\u001a\u00020\bH\u0002J(\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bH\u0002J \u0010A\u001a\u00020/2\u0006\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0002J0\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0014J\u0018\u0010H\u001a\u00020/2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0014J \u0010I\u001a\u00020/2\u0006\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0002J \u0010J\u001a\u00020/2\u0006\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0002J\u0018\u0010K\u001a\u00020/2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0002J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\bH\u0016J\b\u0010N\u001a\u00020)H\u0016J\u0010\u0010O\u001a\u00020/2\u0006\u0010P\u001a\u00020\bH\u0002J\u0010\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u00020\bH\u0002J\u0014\u0010S\u001a\u00020)*\u00020T2\u0006\u00105\u001a\u00020)H\u0002J\u001c\u0010U\u001a\u00020)*\u00020T2\u0006\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020)H\u0002J\u0014\u0010V\u001a\u00020)*\u00020T2\u0006\u00104\u001a\u00020)H\u0002R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0018¨\u0006W"}, d2 = {"Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "aspectRatio", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio$delegate", "Lkotlin/properties/ReadWriteProperty;", "childState", "foregroundPadding", "Landroid/graphics/Rect;", "horizontalPadding", "getHorizontalPadding", "()I", "matchParentChildren", "", "Landroid/view/View;", "maxHeight", "maxWidth", "measuredMatchParentChildren", "paddingBottomWithForeground", "getPaddingBottomWithForeground", "paddingLeftWithForeground", "getPaddingLeftWithForeground", "paddingRightWithForeground", "getPaddingRightWithForeground", "paddingTopWithForeground", "getPaddingTopWithForeground", "skippedMatchParentChildren", "useAspect", "", "getUseAspect", "()Z", "verticalPadding", "getVerticalPadding", "considerMatchParentChildrenInMaxSize", "", "widthMeasureSpec", "heightMeasureSpec", "considerMatchParentMargins", "child", "exactWidth", "exactHeight", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getDynamicHeight", "widthSize", "getDynamicWidth", "isDynamicAspect", "layoutChildren", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "measureChildWithDefinedSize", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "remeasureMatchParentChild", "remeasureWrapContentConstrainedChild", "remeasureWrapContentConstrainedChildren", "setForegroundGravity", "gravity", "shouldDelayChildPressedState", "updateMaxHeight", "childHeight", "updateMaxWidth", "childWidth", "matchDynamicHeight", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "matchDynamicSize", "matchDynamicWidth", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty aspectRatio;
    private int childState;

    @NotNull
    private final Rect foregroundPadding;

    @NotNull
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;

    @NotNull
    private final Set<View> measuredMatchParentChildren;

    @NotNull
    private final Set<View> skippedMatchParentChildren;

    public FrameContainerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    @Override // com.yandex.div.core.widget.AspectView
    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setForegroundGravity(int gravity) {
        if (getForegroundGravity() == gravity) {
            return;
        }
        super.setForegroundGravity(gravity);
        if (getForegroundGravity() == 119 && getForeground() != null) {
            getForeground().getPadding(this.foregroundPadding);
        } else {
            this.foregroundPadding.setEmpty();
        }
        requestLayout();
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean isExact = ViewsKt.isExact(widthMeasureSpec);
        if (getUseAspect()) {
            if (!isExact) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                heightMeasureSpec = ViewsKt.makeExactSpec(MathKt.roundToInt(View.MeasureSpec.getSize(widthMeasureSpec) / getAspectRatio()));
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        CollectionsKt.addAll(this.matchParentChildren, this.measuredMatchParentChildren);
        CollectionsKt.addAll(this.matchParentChildren, this.skippedMatchParentChildren);
        considerMatchParentChildrenInMaxSize(widthMeasureSpec, heightMeasureSpec);
        int resolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(widthMeasureSpec), widthMeasureSpec, this.childState);
        int dynamicHeight = getDynamicHeight(widthMeasureSpec, heightMeasureSpec, 16777215 & resolveSizeAndState);
        if (ViewsKt.isUnspecified(heightMeasureSpec)) {
            heightMeasureSpec = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(dynamicHeight, heightMeasureSpec, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), widthMeasureSpec, heightMeasureSpec);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final void considerMatchParentMargins(View child, boolean exactWidth, boolean exactHeight) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (matchDynamicWidth(divLayoutParams, exactWidth)) {
            updateMaxWidth(child.getMinimumWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (matchDynamicHeight(divLayoutParams, exactHeight)) {
            updateMaxHeight(child.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final void measureChildWithDefinedSize(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean isExact = ViewsKt.isExact(widthMeasureSpec);
        boolean isExact2 = ViewsKt.isExact(heightMeasureSpec);
        boolean z = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z2 = i == -1;
        if ((!isExact || !isExact2) && (!isExact2 ? !isExact ? z && i <= 0 : z2 : z)) {
            if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
                this.skippedMatchParentChildren.add(child);
                return;
            }
            return;
        }
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
            this.measuredMatchParentChildren.add(child);
        }
        if (!isExact && !z) {
            updateMaxWidth(child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (isExact2 || z2 || getUseAspect()) {
            return;
        }
        updateMaxHeight(child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
    }

    private final void remeasureMatchParentChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.getHorizontalMargins$div_release();
        int verticalPadding = getVerticalPadding() + divLayoutParams.getVerticalMargins$div_release();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            widthMeasureSpec = ViewsKt.makeExactSpec(getMeasuredWidth());
        }
        int i = widthMeasureSpec;
        DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
        int childMeasureSpec = companion.getChildMeasureSpec(i, horizontalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth());
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            heightMeasureSpec = ViewsKt.makeExactSpec(getMeasuredHeight());
        }
        child.measure(childMeasureSpec, companion.getChildMeasureSpec(heightMeasureSpec, verticalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(child)) {
            this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
            this.matchParentChildren.remove(child);
        }
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z, boolean z2) {
        return matchDynamicWidth(divLayoutParams, z) || matchDynamicHeight(divLayoutParams, z2);
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z) {
        return !z && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z) {
        return !z && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final void updateMaxWidth(int childWidth) {
        this.maxWidth = Math.max(this.maxWidth, childWidth);
    }

    private final void updateMaxHeight(int childHeight) {
        this.maxHeight = Math.max(this.maxHeight, childHeight);
    }

    private final void considerMatchParentChildrenInMaxSize(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.matchParentChildren.isEmpty()) {
            return;
        }
        boolean isExact = ViewsKt.isExact(widthMeasureSpec);
        boolean isExact2 = ViewsKt.isExact(heightMeasureSpec);
        if (isExact && isExact2) {
            return;
        }
        boolean z = false;
        boolean z2 = !isExact && this.maxWidth == 0;
        if (!isExact2 && !getUseAspect() && this.maxHeight == 0) {
            z = true;
        }
        if (z2 || z) {
            for (View view : this.matchParentChildren) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z2) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z))) {
                    measureChildWithMargins(view, widthMeasureSpec, 0, heightMeasureSpec, 0);
                    this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                    this.skippedMatchParentChildren.remove(view);
                }
                if (z2) {
                    updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                }
                if (z) {
                    updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                }
            }
            return;
        }
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            considerMatchParentMargins((View) it.next(), isExact, isExact2);
        }
    }

    private final int getDynamicWidth(int widthMeasureSpec) {
        if (ViewsKt.isExact(widthMeasureSpec)) {
            return 0;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(this.maxWidth + getHorizontalPadding(), getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        return foreground != null ? RangesKt.coerceAtLeast(coerceAtLeast, foreground.getMinimumWidth()) : coerceAtLeast;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getDynamicHeight(int widthMeasureSpec, int heightMeasureSpec, int widthSize) {
        if (ViewsKt.isExact(heightMeasureSpec)) {
            return 0;
        }
        if (isDynamicAspect(widthMeasureSpec)) {
            return MathKt.roundToInt(widthSize / getAspectRatio());
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(this.maxHeight + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        return foreground != null ? RangesKt.coerceAtLeast(coerceAtLeast, foreground.getMinimumHeight()) : coerceAtLeast;
    }

    private final boolean isDynamicAspect(int widthMeasureSpec) {
        return getUseAspect() && !ViewsKt.isExact(widthMeasureSpec);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final void remeasureWrapContentConstrainedChildren(int widthMeasureSpec, int heightMeasureSpec) {
        if (isDynamicAspect(widthMeasureSpec)) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    remeasureWrapContentConstrainedChild(childAt, widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void layoutChildren(int left, int top, int right, int bottom) {
        int i;
        int i2;
        int i3;
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(divLayoutParams.getGravity(), getLayoutDirection());
                int gravity = divLayoutParams.getGravity() & 112;
                int i5 = absoluteGravity & 7;
                if (i5 == 1) {
                    i = ((((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
                } else if (i5 == 5) {
                    i2 = (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                    if (gravity != 16) {
                        i3 = paddingTopWithForeground + (((((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2);
                    } else if (gravity == 80) {
                        i3 = (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                    } else {
                        i3 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground;
                    }
                    childAt.layout(i2, i3, measuredWidth + i2, measuredHeight + i3);
                } else {
                    i = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                }
                i2 = i + paddingLeftWithForeground;
                if (gravity != 16) {
                }
                childAt.layout(i2, i3, measuredWidth + i2, measuredHeight + i3);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }
}
