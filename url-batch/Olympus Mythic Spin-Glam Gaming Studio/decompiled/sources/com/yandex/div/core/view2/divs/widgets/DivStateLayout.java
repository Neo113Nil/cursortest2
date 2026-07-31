package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import com.android.billingclient.api.BillingClient;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateLayout.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001gB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010C\u001a\u0002082\b\u0010D\u001a\u0004\u0018\u000101H\u0096\u0001J\u0010\u0010E\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\tH\u0016J\t\u0010G\u001a\u000208H\u0096\u0001J\u0010\u0010H\u001a\u0002082\u0006\u0010I\u001a\u00020JH\u0016J\"\u0010K\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020J2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020OH\u0014J\u000b\u0010P\u001a\u0004\u0018\u00010QH\u0096\u0001J\t\u0010R\u001a\u000208H\u0096\u0001J\u0019\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020\tH\u0096\u0001J\u0010\u0010V\u001a\u00020\u001f2\u0006\u0010W\u001a\u00020XH\u0016J(\u0010Y\u001a\u0002082\u0006\u0010Z\u001a\u00020\t2\u0006\u0010[\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020\tH\u0014J\u0010\u0010^\u001a\u00020\u001f2\u0006\u0010W\u001a\u00020XH\u0017J\t\u0010_\u001a\u000208H\u0096\u0001J\t\u0010`\u001a\u000208H\u0096\u0001J#\u0010a\u001a\u0002082\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020MH\u0096\u0001J\u0011\u0010e\u001a\u0002082\u0006\u0010d\u001a\u00020MH\u0096\u0001J\u0011\u0010f\u001a\u0002082\u0006\u0010d\u001a\u00020MH\u0096\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0018\u0010!\u001a\u00020\u001fX\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000605R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u000208\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006h"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$State;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activeStateDiv", "Lcom/yandex/div2/Div;", "getActiveStateDiv$div_release", "()Lcom/yandex/div2/Div;", "setActiveStateDiv$div_release", "(Lcom/yandex/div2/Div;)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$State;", "setDiv", "(Lcom/yandex/div2/Div$State;)V", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", "path", "Lcom/yandex/div/core/state/DivStatePath;", "getPath", "()Lcom/yandex/div/core/state/DivStatePath;", "setPath", "(Lcom/yandex/div/core/state/DivStatePath;)V", "stateId", "", "getStateId", "()Ljava/lang/String;", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "swipeListener", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "swipeOutCallback", "Lkotlin/Function0;", "", "getSwipeOutCallback", "()Lkotlin/jvm/functions/Function0;", "setSwipeOutCallback", "(Lkotlin/jvm/functions/Function0;)V", "variableUpdater", "Lkotlin/Function1;", "getVariableUpdater", "()Lkotlin/jvm/functions/Function1;", "setVariableUpdater", "(Lkotlin/jvm/functions/Function1;)V", "addSubscription", "subscription", "canScrollHorizontally", "direction", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "onBoundsChanged", "width", "height", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "SwipeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivStateLayout extends FrameContainerLayout implements DivHolderView<Div.State> {
    private final /* synthetic */ DivHolderViewMixin<Div.State> $$delegate_0;

    @Nullable
    private Div activeStateDiv;

    @NotNull
    private final GestureDetectorCompat gestureDetector;

    @Nullable
    private DivStatePath path;

    @NotNull
    private final SwipeListener swipeListener;

    @Nullable
    private Function0 swipeOutCallback;

    @Nullable
    private Function1 variableUpdater;

    public DivStateLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivStateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
    public Div.State getDiv() {
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
    public void setDiv(@Nullable Div.State state) {
        this.$$delegate_0.setDiv(state);
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

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivStateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new GestureDetectorCompat(context, swipeListener, new Handler(Looper.getMainLooper()));
    }

    @Nullable
    public final DivStatePath getPath() {
        return this.path;
    }

    public final void setPath(@Nullable DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    @Nullable
    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath != null) {
            return divStatePath.getLastStateId();
        }
        return null;
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

    @Nullable
    public final Function0 getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    public final void setSwipeOutCallback(@Nullable Function0 function0) {
        this.swipeOutCallback = function0;
    }

    @Nullable
    /* renamed from: getActiveStateDiv$div_release, reason: from getter */
    public final Div getActiveStateDiv() {
        return this.activeStateDiv;
    }

    public final void setActiveStateDiv$div_release(@Nullable Div div) {
        this.activeStateDiv = div;
    }

    @Nullable
    public final Function1 getVariableUpdater() {
        return this.variableUpdater;
    }

    public final void setVariableUpdater(@Nullable Function1 function1) {
        this.variableUpdater = function1;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.onTouchEvent(event);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (super.canScrollHorizontally(direction)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(direction);
        }
        View childAt = getChildAt(0);
        if (direction < 0) {
            if (childAt.getTranslationX() <= childAt.getWidth()) {
                return true;
            }
        } else if ((-childAt.getTranslationX()) <= childAt.getWidth()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    /* compiled from: DivStateLayout.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;)V", "inScroll", "", "getInScroll", "()Z", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "canScroll", "v", VastAttributes.HORIZONTAL_POSITION, "", VastAttributes.VERTICAL_POSITION, "dir", "", "finishSwipe", "", "onDown", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "distanceY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e) {
            return true;
        }

        public SwipeListener() {
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final boolean getInScroll() {
            View view = getView();
            return !((view != null ? view.getTranslationX() : 0.0f) == 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
            View view = getView();
            if (view == null || e1 == null) {
                return false;
            }
            int signum = (int) Math.signum(distanceX);
            if (view.getTranslationX() == 0.0f && Math.abs(distanceX) > 2 * Math.abs(distanceY) && canScroll(view, e1.getX(), e1.getY(), signum)) {
                return false;
            }
            view.setTranslationX(MathUtils.clamp(view.getTranslationX() - distanceX, -view.getWidth(), view.getWidth()));
            return !(view.getTranslationX() == 0.0f);
        }

        public final void finishSwipe() {
            float abs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float f;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                abs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                f = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Function0 swipeOutCallback = DivStateLayout.this.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.mo4828invoke();
                        }
                    }
                };
            } else {
                abs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                f = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) MathUtils.clamp(abs, 0.0f, 300.0f)).translationX(f).setListener(animatorListenerAdapter).start();
        }

        private final boolean canScroll(View v, float x, float y, int dir) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (x >= childAt.getLeft() && x < childAt.getRight() && y >= childAt.getTop() && y < childAt.getBottom() && canScroll(childAt, x - childAt.getLeft(), y - childAt.getTop(), dir)) {
                        return true;
                    }
                }
            }
            return v.canScrollHorizontally(dir);
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
