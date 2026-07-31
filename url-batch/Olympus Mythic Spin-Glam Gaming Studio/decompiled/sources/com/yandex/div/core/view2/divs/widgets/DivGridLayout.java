package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGridLayout.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010&H\u0096\u0001J\t\u0010,\u001a\u00020*H\u0096\u0001J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\"\u00100\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0014J\u000b\u00105\u001a\u0004\u0018\u000106H\u0096\u0001J\t\u00107\u001a\u00020*H\u0096\u0001J\u0019\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0096\u0001J(\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0014J\u0010\u0010@\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0016J\t\u0010A\u001a\u00020*H\u0096\u0001J\t\u0010B\u001a\u00020*H\u0096\u0001J#\u0010C\u001a\u00020*2\u0006\u0010\f\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u000202H\u0096\u0001J\u0011\u0010G\u001a\u00020*2\u0006\u0010F\u001a\u000202H\u0096\u0001J\u0011\u0010H\u001a\u00020*2\u0006\u0010F\u001a\u000202H\u0096\u0001R\u001a\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006I"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;", "Lcom/yandex/div/core/widget/GridContainer;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Grid;", "setDiv", "(Lcom/yandex/div2/Div$Grid;)V", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", "releaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "setReleaseViewVisitor$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;)V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "addSubscription", "", "subscription", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "onBoundsChanged", "width", "height", "onSizeChanged", "w", "h", "oldw", "oldh", "onViewRemoved", "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DivGridLayout extends GridContainer implements DivHolderView<Div.Grid>, DivAnimator {
    private final /* synthetic */ DivHolderViewMixin<Div.Grid> $$delegate_0;

    @Nullable
    private ReleaseViewVisitor releaseViewVisitor;

    public DivGridLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivGridLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    @Override // com.yandex.div.core.widget.GridContainer, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
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
    public Div.Grid getDiv() {
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

    @Override // com.yandex.div.core.widget.GridContainer, com.yandex.div.internal.widget.DivViewGroup, android.view.View
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
    public void setDiv(@Nullable Div.Grid grid) {
        this.$$delegate_0.setDiv(grid);
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

    public /* synthetic */ DivGridLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivGridLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }

    @Nullable
    /* renamed from: getReleaseViewVisitor$div_release, reason: from getter */
    public final ReleaseViewVisitor getReleaseViewVisitor() {
        return this.releaseViewVisitor;
    }

    public final void setReleaseViewVisitor$div_release(@Nullable ReleaseViewVisitor releaseViewVisitor) {
        this.releaseViewVisitor = releaseViewVisitor;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // com.yandex.div.core.widget.GridContainer, android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        super.onViewRemoved(child);
        ReleaseViewVisitor releaseViewVisitor = this.releaseViewVisitor;
        if (releaseViewVisitor != null) {
            DivViewVisitorKt.visitViewTree(releaseViewVisitor, child);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer borderDrawer = getBorderDrawer();
        if (borderDrawer != null) {
            int save = canvas.save();
            try {
                borderDrawer.clipCorners(canvas);
                super.draw(canvas);
                borderDrawer.drawBorder(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
