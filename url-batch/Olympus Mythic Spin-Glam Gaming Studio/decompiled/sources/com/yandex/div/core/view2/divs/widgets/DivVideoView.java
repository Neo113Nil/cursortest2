package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.extension.DivExtensionView;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVideoView.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B%\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010!H\u0096\u0001J\t\u0010'\u001a\u00020%H\u0096\u0001J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u000bH\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0001J\b\u0010.\u001a\u0004\u0018\u00010/J\t\u00100\u001a\u00020%H\u0096\u0001J\u0019\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0096\u0001J(\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0014J\b\u00109\u001a\u00020%H\u0016J\t\u0010:\u001a\u00020%H\u0096\u0001J#\u0010;\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?H\u0096\u0001J\u0011\u0010@\u001a\u00020%2\u0006\u0010>\u001a\u00020?H\u0096\u0001J\u0011\u0010A\u001a\u00020%2\u0006\u0010>\u001a\u00020?H\u0096\u0001R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u0019X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006B"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Video;", "Lcom/yandex/div/core/extension/DivExtensionView;", "Lcom/yandex/div/core/view2/Releasable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Video;", "setDiv", "(Lcom/yandex/div2/Div$Video;)V", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "addSubscription", "", "subscription", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "getBaseline", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getPlayerView", "Lcom/yandex/div/core/player/DivPlayerView;", "invalidateBorder", "onBoundsChanged", "width", "height", "onSizeChanged", "w", "h", "oldw", "oldh", "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "Landroid/view/View;", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivVideoView extends FrameContainerLayout implements DivHolderView<Div.Video>, DivExtensionView, Releasable {
    private final /* synthetic */ DivHolderViewMixin<Div.Video> $$delegate_0;

    public DivVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
    public Div.Video getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
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
    public void setDiv(@Nullable Div.Video video) {
        this.$$delegate_0.setDiv(video);
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

    public /* synthetic */ DivVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.divImageStyle : i);
    }

    public DivVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        DivPlayerView playerView = getPlayerView();
        if (playerView != null) {
            DivPlayer attachedPlayer = playerView.getAttachedPlayer();
            playerView.detach();
            if (attachedPlayer != null) {
                attachedPlayer.release();
            }
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Nullable
    public final DivPlayerView getPlayerView() {
        if (getChildCount() > 2) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Too many children in DivVideo");
            }
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        if (!(childAt instanceof DivPlayerView)) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Wrong view type inside DivVideo");
            }
            return null;
        }
        return (DivPlayerView) childAt;
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }
}
