package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.android.billingclient.api.BillingClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivCustomWrapper.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010#H\u0096\u0001J\t\u0010)\u001a\u00020'H\u0096\u0001J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016J\"\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\u00122\u0006\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u00020\tH\u0016J\u000b\u00102\u001a\u0004\u0018\u000103H\u0096\u0001J\t\u00104\u001a\u00020'H\u0096\u0001J \u00105\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00122\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tH\u0014J0\u00108\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00122\u0006\u00106\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0014J\u0019\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0096\u0001J(\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\tH\u0014J\t\u0010C\u001a\u00020'H\u0096\u0001J\t\u0010D\u001a\u00020'H\u0096\u0001J#\u0010E\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010I\u001a\u00020'2\u0006\u0010H\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010J\u001a\u00020'2\u0006\u0010H\u001a\u00020\u0012H\u0096\u0001R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u001bX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006K"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Custom;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "customView", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "div", "getDiv", "()Lcom/yandex/div2/Div$Custom;", "setDiv", "(Lcom/yandex/div2/Div$Custom;)V", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "addSubscription", "", "subscription", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "drawingTime", "", "getBaseline", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "measureChild", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "measureChildWithMargins", "widthUsed", "heightUsed", "onBoundsChanged", "width", "height", "onSizeChanged", "w", "h", "oldw", "oldh", "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivCustomWrapper extends FrameContainerLayout implements DivHolderView<Div.Custom> {
    private final /* synthetic */ DivHolderViewMixin<Div.Custom> $$delegate_0;

    public DivCustomWrapper(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivCustomWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Div.Custom getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Div.Custom custom) {
        this.$$delegate_0.setDiv(custom);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public /* synthetic */ DivCustomWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivCustomWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer borderDrawer = getBorderDrawer();
        if (borderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            borderDrawer.clipCorners(canvas);
            super.draw(canvas);
            borderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        View customView = getCustomView();
        if (customView != null) {
            int baseline = customView.getBaseline();
            ViewGroup.LayoutParams layoutParams = customView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return baseline + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + getPaddingTop();
        }
        return super.getBaseline();
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    protected void measureChild(@NotNull View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        baseMeasureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    @Nullable
    public final View getCustomView() {
        if (getChildCount() != 0) {
            return ViewGroupKt.get(this, 0);
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    protected void measureChildWithMargins(@NotNull View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        baseMeasureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
