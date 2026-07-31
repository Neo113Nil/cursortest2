package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.BillingClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher;
import com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPagerView.kt */
@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\r\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002~\u007fB%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0019H\u0016J\u0013\u0010W\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010QH\u0096\u0001J\b\u0010Y\u001a\u00020UH\u0016J\t\u0010Z\u001a\u00020UH\u0096\u0001J\u0010\u0010[\u001a\u00020U2\u0006\u0010\\\u001a\u00020]H\u0016J\"\u0010^\u001a\u00020*2\u0006\u0010\\\u001a\u00020]2\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bH\u0014J\b\u0010c\u001a\u00020UH\u0016J\u000b\u0010d\u001a\u0004\u0018\u00010eH\u0096\u0001J\u0012\u0010f\u001a\u0004\u0018\u00010`2\u0006\u0010g\u001a\u00020\nH\u0016J\u0012\u0010h\u001a\u0004\u0018\u00010`2\u0006\u0010_\u001a\u00020`H\u0012J\t\u0010i\u001a\u00020UH\u0096\u0001J\u0019\u0010j\u001a\u00020U2\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\nH\u0096\u0001J\u0010\u0010m\u001a\u00020*2\u0006\u0010n\u001a\u00020oH\u0016J(\u0010p\u001a\u00020U2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\nH\u0014J\t\u0010u\u001a\u00020UH\u0096\u0001J\t\u0010v\u001a\u00020UH\u0096\u0001J\u0010\u0010w\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0019H\u0016J#\u0010x\u001a\u00020U2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020`H\u0096\u0001J\u0011\u0010|\u001a\u00020U2\u0006\u0010{\u001a\u00020`H\u0096\u0001J\u0011\u0010}\u001a\u00020U2\u0006\u0010{\u001a\u00020`H\u0096\u0001R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001f@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190)X\u0092\u0004¢\u0006\u0002\n\u0000R$\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020*8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u0004\u0018\u00010\u0003X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0012\u0010:\u001a\u00020*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010-R\u0018\u0010;\u001a\u00020*X\u0096\u000f¢\u0006\f\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010K\u001a\u0004\u0018\u00010J2\b\u0010\u0018\u001a\u0004\u0018\u00010J@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006\u0080\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListenerHost;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityDelegate", "com/yandex/div/core/view2/divs/widgets/DivPagerView$accessibilityDelegate$2$1", "getAccessibilityDelegate", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$accessibilityDelegate$2$1;", "accessibilityDelegate$delegate", "Lkotlin/Lazy;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "value", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "changePageCallbackForLogger", "getChangePageCallbackForLogger$div_release", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "setChangePageCallbackForLogger$div_release", "(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "changePageCallbackForOffScreenPages", "getChangePageCallbackForOffScreenPages$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "setChangePageCallbackForOffScreenPages$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;)V", "changePageCallbackForState", "getChangePageCallbackForState$div_release", "setChangePageCallbackForState$div_release", "changePageCallbacksForIndicators", "", "", "clipToPage", "getClipToPage$div_release", "()Z", "setClipToPage$div_release", "(Z)V", "currentItem", "getCurrentItem$div_release", "()I", "setCurrentItem$div_release", "(I)V", "div", "getDiv", "()Lcom/yandex/div2/Div$Pager;", "setDiv", "(Lcom/yandex/div2/Div$Pager;)V", "isTransient", "needClipping", "getNeedClipping", "setNeedClipping", "onInterceptTouchEventListener", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "pagerOnItemsCountChange", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "getPagerOnItemsCountChange$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "setPagerOnItemsCountChange$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;)V", "Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "pagerSelectedActionsDispatcher", "getPagerSelectedActionsDispatcher$div_release", "()Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "setPagerSelectedActionsDispatcher$div_release", "(Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;)V", BillingClient.FeatureType.SUBSCRIPTIONS, "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "addChangePageCallbackForIndicators", "", "callback", "addSubscription", "subscription", "clearChangePageCallbackForIndicators", "closeAllSubscription", "draw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "enableAccessibility", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getPageView", "index", "getWrapperFor", "invalidateBorder", "onBoundsChanged", "width", "height", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onSizeChanged", "w", "h", "oldw", "oldh", "release", "releaseBorderDrawer", "removeChangePageCallbackForIndicators", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "transitionFinished", "transitionStarted", "OffScreenPagesUpdateCallback", "OnItemsUpdatedCallback", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class DivPagerView extends ViewPager2Wrapper implements DivHolderView<Div.Pager>, OnInterceptTouchEventListenerHost {
    private final /* synthetic */ DivHolderViewMixin<Div.Pager> $$delegate_0;

    /* renamed from: accessibilityDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessibilityDelegate;

    @Nullable
    private ViewPager2.OnPageChangeCallback changePageCallbackForLogger;

    @Nullable
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;

    @Nullable
    private ViewPager2.OnPageChangeCallback changePageCallbackForState;

    @NotNull
    private final List<ViewPager2.OnPageChangeCallback> changePageCallbacksForIndicators;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private OnItemsUpdatedCallback pagerOnItemsCountChange;

    @Nullable
    private PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher;

    /* compiled from: DivPagerView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Landroid/view/View$OnLayoutChangeListener;", "()V", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.OnPageChangeCallback implements View.OnLayoutChangeListener {
        public void onLayoutChange(@Nullable View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        }
    }

    /* compiled from: DivPagerView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "", "onItemsUpdated", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnItemsUpdatedCallback {
        void onItemsUpdated();
    }

    public DivPagerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivPagerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    @Override // com.yandex.div.core.widget.ViewPager2Wrapper, android.view.ViewGroup, android.view.View
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
    public Div.Pager getDiv() {
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

    @Override // com.yandex.div.core.widget.ViewPager2Wrapper, android.widget.FrameLayout, android.view.View
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
    public void setDiv(@Nullable Div.Pager pager) {
        this.$$delegate_0.setDiv(pager);
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

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivPagerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.accessibilityDelegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: invoke */
            public final AnonymousClass1 mo4828invoke() {
                RecyclerView recyclerView = DivPagerView.this.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new RecyclerViewAccessibilityDelegate(DivPagerView.this) { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2.1
                    final /* synthetic */ DivPagerView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(RecyclerView.this);
                        this.this$0 = r2;
                    }

                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean onRequestSendAccessibilityEvent(@NotNull ViewGroup host, @NotNull View child, @NotNull AccessibilityEvent event) {
                        performActionIfNeeded(child, event);
                        return super.onRequestSendAccessibilityEvent(host, child, event);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
                    
                        r2 = r1.this$0.getWrapperFor(r2);
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private final void performActionIfNeeded(View child, AccessibilityEvent event) {
                        View wrapperFor;
                        int childAdapterPosition;
                        if (event.getEventType() != 32768 || wrapperFor == null || this.this$0.getCurrentItem$div_release() == (childAdapterPosition = RecyclerView.this.getChildAdapterPosition(wrapperFor)) || childAdapterPosition == -1) {
                            return;
                        }
                        RecyclerView.this.performAccessibilityAction(childAdapterPosition > this.this$0.getCurrentItem$div_release() ? 4096 : 8192, null);
                    }
                };
            }
        });
    }

    @Nullable
    /* renamed from: getChangePageCallbackForState$div_release, reason: from getter */
    public ViewPager2.OnPageChangeCallback getChangePageCallbackForState() {
        return this.changePageCallbackForState;
    }

    public void setChangePageCallbackForState$div_release(@Nullable ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForState;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForState = onPageChangeCallback;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            int save = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.draw(canvas);
    }

    @Nullable
    /* renamed from: getChangePageCallbackForLogger$div_release, reason: from getter */
    public ViewPager2.OnPageChangeCallback getChangePageCallbackForLogger() {
        return this.changePageCallbackForLogger;
    }

    public void setChangePageCallbackForLogger$div_release(@Nullable ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForLogger;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForLogger = onPageChangeCallback;
    }

    @Nullable
    /* renamed from: getChangePageCallbackForOffScreenPages$div_release, reason: from getter */
    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages() {
        return this.changePageCallbackForOffScreenPages;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(@Nullable OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().registerOnPageChangeCallback(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    @Nullable
    /* renamed from: getPagerSelectedActionsDispatcher$div_release, reason: from getter */
    public PagerSelectedActionsDispatcher getPagerSelectedActionsDispatcher() {
        return this.pagerSelectedActionsDispatcher;
    }

    public void setPagerSelectedActionsDispatcher$div_release(@Nullable PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher) {
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = this.pagerSelectedActionsDispatcher;
        if (pagerSelectedActionsDispatcher2 != null) {
            pagerSelectedActionsDispatcher2.detach(getViewPager());
        }
        if (pagerSelectedActionsDispatcher != null) {
            pagerSelectedActionsDispatcher.attach(getViewPager());
        }
        this.pagerSelectedActionsDispatcher = pagerSelectedActionsDispatcher;
    }

    @Nullable
    /* renamed from: getPagerOnItemsCountChange$div_release, reason: from getter */
    public OnItemsUpdatedCallback getPagerOnItemsCountChange() {
        return this.pagerOnItemsCountChange;
    }

    public void setPagerOnItemsCountChange$div_release(@Nullable OnItemsUpdatedCallback onItemsUpdatedCallback) {
        this.pagerOnItemsCountChange = onItemsUpdatedCallback;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public void setClipToPage$div_release(boolean z) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z);
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

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    public void setCurrentItem$div_release(int i) {
        getViewPager().setCurrentItem(i, false);
    }

    private DivPagerView$accessibilityDelegate$2.AnonymousClass1 getAccessibilityDelegate() {
        return (DivPagerView$accessibilityDelegate$2.AnonymousClass1) this.accessibilityDelegate.getValue();
    }

    public void enableAccessibility() {
        RecyclerView recyclerView;
        DivPagerView$accessibilityDelegate$2.AnonymousClass1 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    public void addChangePageCallbackForIndicators(@NotNull ViewPager2.OnPageChangeCallback callback) {
        this.changePageCallbacksForIndicators.add(callback);
        getViewPager().registerOnPageChangeCallback(callback);
    }

    public void removeChangePageCallbackForIndicators(@NotNull ViewPager2.OnPageChangeCallback callback) {
        this.changePageCallbacksForIndicators.remove(callback);
        getViewPager().unregisterOnPageChangeCallback(callback);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().unregisterOnPageChangeCallback((ViewPager2.OnPageChangeCallback) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) || super.onInterceptTouchEvent(event);
    }

    @Nullable
    public View getPageView(int index) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrapperFor(View child) {
        while (!Intrinsics.areEqual(child, getRecyclerView())) {
            if (child instanceof DivViewWrapper) {
                return child;
            }
            Object parent = child.getParent();
            child = parent instanceof View ? (View) parent : null;
            if (child == null) {
                break;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }
}
