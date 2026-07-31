package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGallery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivRecyclerView.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 q2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001qB%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010>H\u0096\u0001J\b\u0010D\u001a\u00020\u0019H\u0012J\t\u0010E\u001a\u00020BH\u0096\u0001J\u0010\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020HH\u0016J\"\u0010I\u001a\u00020\u00192\u0006\u0010G\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020MH\u0016J\u0018\u0010N\u001a\u00020\u00192\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0016J\u000b\u0010Q\u001a\u0004\u0018\u00010RH\u0096\u0001J\u0012\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\nH\u0016J\t\u0010U\u001a\u00020BH\u0096\u0001J\u0019\u0010V\u001a\u00020B2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\nH\u0096\u0001J\u0010\u0010Y\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u00020\nH\u0016J\u0018\u0010^\u001a\u00020B2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\nH\u0016J(\u0010a\u001a\u00020B2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\nH\u0014J\u0012\u0010f\u001a\u00020\u00192\b\u0010g\u001a\u0004\u0018\u00010[H\u0017J\b\u0010h\u001a\u00020BH\u0016J\t\u0010i\u001a\u00020BH\u0096\u0001J#\u0010j\u001a\u00020B2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020KH\u0096\u0001J\u0011\u0010n\u001a\u00020B2\u0006\u0010m\u001a\u00020KH\u0096\u0001J\u0011\u0010o\u001a\u00020B2\u0006\u0010m\u001a\u00020KH\u0096\u0001J\f\u0010p\u001a\u00020\n*\u00020/H\u0012R\u000e\u0010\f\u001a\u00020\nX\u0092\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u0019X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0019X\u0092\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\nX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0092\u000e¢\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\nX\u0092\u000e¢\u0006\u0002\n\u0000R\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006r"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListenerHost;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "beforeScrollFocusPosition", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Gallery;", "setDiv", "(Lcom/yandex/div2/Div$Gallery;)V", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", "needFling", "onInterceptTouchEventListener", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "pagerSnapStartHelper", "Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "getPagerSnapStartHelper", "()Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "setPagerSnapStartHelper", "(Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;)V", "pointTouchX", "pointTouchY", "value", "", "scrollInterceptionAngle", "getScrollInterceptionAngle", "()F", "setScrollInterceptionAngle", "(F)V", "scrollMode", "Lcom/yandex/div2/DivGallery$ScrollMode;", "getScrollMode", "()Lcom/yandex/div2/DivGallery$ScrollMode;", "setScrollMode", "(Lcom/yandex/div2/DivGallery$ScrollMode;)V", "scrollPointerId", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "addSubscription", "", "subscription", "canScroll", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "fling", "velocityX", "velocityY", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getItemView", "index", "invalidateBorder", "onBoundsChanged", "width", "height", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onScrollStateChanged", "state", "onScrolled", "dx", "dy", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", EidRequestBuilder.REQUEST_FIELD_EMAIL, "release", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "toTouchPoint", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<Div.Gallery>, OnInterceptTouchEventListenerHost {
    public static final float NOT_INTERCEPT = 0.0f;
    private static final double RIGHT_ANGLE = 90.0d;
    private final /* synthetic */ DivHolderViewMixin<Div.Gallery> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;

    @NotNull
    private DivGallery.ScrollMode scrollMode;
    private int scrollPointerId;

    public DivRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    @Override // com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView, android.view.ViewGroup, android.view.View
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
    public Div.Gallery getDiv() {
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

    @Override // com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
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
    public void setDiv(@Nullable Div.Gallery gallery) {
        this.$$delegate_0.setDiv(gallery);
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

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, R.style.Div_Gallery), attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = DivGallery.ScrollMode.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
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

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    public void setScrollInterceptionAngle(float f) {
        this.scrollInterceptionAngle = f != 0.0f ? Math.abs(f) % 90 : 0.0f;
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost
    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost
    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    @NotNull
    public DivGallery.ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    public void setScrollMode(@NotNull DivGallery.ScrollMode scrollMode) {
        this.scrollMode = scrollMode;
    }

    @Nullable
    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public void setPagerSnapStartHelper(@Nullable PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        boolean fling = super.fling(velocityX, velocityY);
        if (getScrollMode() == DivGallery.ScrollMode.PAGING) {
            this.needFling = !fling;
        }
        return fling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        if (state == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(int dx, int dy) {
        int orientation;
        int i;
        int i2;
        int i3;
        DivViewWrapper divViewWrapper;
        View child;
        if (this.beforeScrollFocusPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).getOrientation() : 0;
        }
        if (orientation == 1 && dy > 0) {
            i2 = this.beforeScrollFocusPosition;
        } else {
            if (orientation == 1 && dy <= 0) {
                i = this.beforeScrollFocusPosition;
            } else if (dx > 0) {
                i2 = this.beforeScrollFocusPosition;
            } else {
                i = this.beforeScrollFocusPosition;
            }
            i3 = i - 1;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i3);
            KeyEvent.Callback callback = findViewHolderForAdapterPosition == null ? findViewHolderForAdapterPosition.itemView : null;
            divViewWrapper = callback instanceof DivViewWrapper ? (DivViewWrapper) callback : null;
            if (divViewWrapper != null && (child = divViewWrapper.getChild()) != null) {
                child.requestFocus();
            }
            super.onScrolled(dx, dy);
        }
        i3 = i2 + 1;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
        if (findViewHolderForAdapterPosition2 == null) {
        }
        if (callback instanceof DivViewWrapper) {
        }
        if (divViewWrapper != null) {
            child.requestFocus();
        }
        super.onScrolled(dx, dy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        int findPointerIndex;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) {
            return true;
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            this.scrollPointerId = event.getPointerId(0);
            this.pointTouchX = toTouchPoint(event.getX());
            this.pointTouchY = toTouchPoint(event.getY());
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.scrollPointerId = event.getPointerId(actionIndex);
                this.pointTouchX = toTouchPoint(event.getX(actionIndex));
                this.pointTouchY = toTouchPoint(event.getY(actionIndex));
                return super.onInterceptTouchEvent(event);
            }
            return super.onInterceptTouchEvent(event);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (findPointerIndex = event.findPointerIndex(this.scrollPointerId)) < 0) {
            return false;
        }
        int touchPoint = toTouchPoint(event.getX(findPointerIndex));
        int touchPoint2 = toTouchPoint(event.getY(findPointerIndex));
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(event);
        }
        int abs = Math.abs(touchPoint - this.pointTouchX);
        int abs2 = Math.abs(touchPoint2 - this.pointTouchY);
        if (abs == 0 && abs2 == 0) {
            return false;
        }
        double atan = abs != 0 ? (Math.atan(abs2 / abs) * 180) / 3.141592653589793d : RIGHT_ANGLE;
        return (layoutManager.canScrollHorizontally() && atan <= ((double) getScrollInterceptionAngle())) || (layoutManager.canScrollVertically() && atan > ((double) getScrollInterceptionAngle()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent e) {
        RecyclerView.LayoutManager layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View findSnapView;
        int i;
        DivGallery.ScrollMode scrollMode = getScrollMode();
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
        if (scrollMode == scrollMode2) {
            this.needFling = true;
        }
        boolean z = super.onTouchEvent(e) && canScroll();
        if (e == null || e.getActionMasked() != 1 || getScrollMode() != scrollMode2 || !this.needFling || (layoutManager = getLayoutManager()) == null || (pagerSnapStartHelper = getPagerSnapStartHelper()) == null || (findSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) == null) {
            return z;
        }
        int[] calculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, findSnapView);
        if (calculateDistanceToFinalSnap.length >= 2 && ((i = calculateDistanceToFinalSnap[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
            smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
        }
        return z;
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    @Nullable
    public View getItemView(int index) {
        View childAt = getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    private int toTouchPoint(float f) {
        return (int) Math.ceil(f);
    }
}
