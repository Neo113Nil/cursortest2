package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.wraplayout.WrapContainerLayout;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivWrapLayout.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010$H\u0096\u0001J\t\u0010)\u001a\u00020'H\u0096\u0001J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016J\"\u0010-\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0014J\u000b\u00102\u001a\u0004\u0018\u000103H\u0096\u0001J\t\u00104\u001a\u00020'H\u0096\u0001J\u0019\u00105\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207H\u0096\u0001J(\u00109\u001a\u00020'2\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u0002072\u0006\u0010=\u001a\u000207H\u0014J\t\u0010>\u001a\u00020'H\u0096\u0001J\t\u0010?\u001a\u00020'H\u0096\u0001J#\u0010@\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020/H\u0096\u0001J\u0011\u0010D\u001a\u00020'2\u0006\u0010C\u001a\u00020/H\u0096\u0001J\u0011\u0010E\u001a\u00020'2\u0006\u0010C\u001a\u00020/H\u0096\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u00020\u0015X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010\u001b¨\u0006F"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div/core/view2/divs/widgets/DivCollectionHolder;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Container;", "setDiv", "(Lcom/yandex/div2/Div$Container;)V", "isTransient", "", "()Z", "items", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "addSubscription", "", "subscription", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "onBoundsChanged", "width", "", "height", "onSizeChanged", "w", "h", "oldw", "oldh", "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivWrapLayout extends WrapContainerLayout implements DivHolderView<Div.Container>, DivCollectionHolder, DivAnimator {
    private final /* synthetic */ DivHolderViewMixin<Div.Container> $$delegate_0;
    private final /* synthetic */ DivCollectionHolderMixin $$delegate_1;

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // com.yandex.div.core.widget.wraplayout.WrapContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
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
    public Div.Container getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    @Nullable
    public List<DivItemBuilderResult> getItems() {
        return this.$$delegate_1.getItems();
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

    @Override // com.yandex.div.core.widget.wraplayout.WrapContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.View
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
    public void setDiv(@Nullable Div.Container container) {
        this.$$delegate_0.setDiv(container);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    public void setItems(@Nullable List<DivItemBuilderResult> list) {
        this.$$delegate_1.setItems(list);
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

    public DivWrapLayout(@NotNull Context context) {
        super(context);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.$$delegate_1 = new DivCollectionHolderMixin();
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

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
