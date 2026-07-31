package com.yandex.div.core.view2.divs.gallery;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivGallery;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivGalleryBinder.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J$\u0010\u0019\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u001b\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\f\u0010\u001c\u001a\u00020\u0012*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0012*\u00020\u0004H\u0002J$\u0010\u001e\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u0010$\u001a\u00020\u0012*\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002J\u001c\u0010'\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "divBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "recyclerScrollInterceptionAngle", "", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Ljavax/inject/Provider;Lcom/yandex/div/core/downloader/DivPatchCache;F)V", "bindView", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "div", "path", "Lcom/yandex/div/core/state/DivStatePath;", "bind", "bindingContext", "bindItemBuilder", "removeItemDecorations", "resetAnimatorAndRestoreOnLayout", "scrollToPositionInternal", X3.i.L, "", "offset", "scrollPosition", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "setItemDecoration", "decoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "updateDecorations", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes14.dex */
public final class DivGalleryBinder extends DivViewBinder<Div.Gallery, DivGallery, DivRecyclerView> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;
    private final float recyclerScrollInterceptionAngle;

    @NotNull
    private final DivViewCreator viewCreator;

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            try {
                iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivGalleryBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull Provider provider, @NotNull DivPatchCache divPatchCache, float f) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = provider;
        this.divPatchCache = divPatchCache;
        this.recyclerScrollInterceptionAngle = f;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    @SuppressLint({"ClickableViewAccessibility"})
    public void bindView(@NotNull BindingContext context, @NotNull DivRecyclerView view, @NotNull Div.Gallery div, @NotNull DivStatePath path) {
        DivRecyclerView divRecyclerView = view != null ? view : null;
        Div.Gallery div2 = divRecyclerView != null ? divRecyclerView.getDiv() : null;
        if (div == div2) {
            RecyclerView.Adapter adapter = view.getAdapter();
            DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
            if (divGalleryAdapter == null) {
                return;
            }
            divGalleryAdapter.applyPatch(view, this.divPatchCache, context);
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
            return;
        }
        this.baseBinder.bindView(context, view, div, div2);
        bind(view, context, div.getValue(), path);
    }

    private final void bind(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, final DivGallery divGallery, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7239invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7239invoke(@NotNull Object obj) {
                DivGalleryBinder.this.updateDecorations(divRecyclerView, bindingContext, divGallery);
            }
        };
        divRecyclerView.addSubscription(divGallery.orientation.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(divGallery.scrollbar.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(divGallery.scrollMode.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(divGallery.itemSpacing.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(divGallery.restrictParentScroll.observe(expressionResolver, function1));
        Expression expression = divGallery.columnCount;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.observe(expressionResolver, function1));
        }
        divRecyclerView.setRecycledViewPool(new ReleasingViewPool(bindingContext.getDivView().getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        divRecyclerView.setAdapter(new DivGalleryAdapter(DivCollectionExtensionsKt.buildItems(divGallery, expressionResolver), bindingContext, (DivBinder) this.divBinder.get(), this.viewCreator, divStatePath));
        bindItemBuilder(divRecyclerView, bindingContext, divGallery);
        resetAnimatorAndRestoreOnLayout(divRecyclerView);
        updateDecorations(divRecyclerView, bindingContext, divGallery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDecorations(DivRecyclerView divRecyclerView, BindingContext bindingContext, DivGallery divGallery) {
        PaddingItemDecoration paddingItemDecoration;
        DivGalleryItemHelper divGridLayoutManager;
        int i;
        int paddingTop;
        DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int i2 = ((DivGallery.Orientation) divGallery.orientation.evaluate(expressionResolver)) == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        boolean z = divGallery.scrollbar.evaluate(expressionResolver) == DivGallery.Scrollbar.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z && i2 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z && i2 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression expression = divGallery.columnCount;
        long longValue = expression != null ? ((Number) expression.evaluate(expressionResolver)).longValue() : 1L;
        divRecyclerView.setClipChildren(false);
        if (longValue == 1) {
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.dpToPx((Long) divGallery.itemSpacing.evaluate(expressionResolver), displayMetrics), 0, 0, 0, 0, i2, 61, null);
        } else {
            int dpToPx = BaseDivViewExtensionsKt.dpToPx((Long) divGallery.itemSpacing.evaluate(expressionResolver), displayMetrics);
            Expression expression2 = divGallery.crossSpacing;
            if (expression2 == null) {
                expression2 = divGallery.itemSpacing;
            }
            paddingItemDecoration = new PaddingItemDecoration(0, dpToPx, BaseDivViewExtensionsKt.dpToPx((Long) expression2.evaluate(expressionResolver), displayMetrics), 0, 0, 0, i2, 57, null);
        }
        setItemDecoration(divRecyclerView, paddingItemDecoration);
        DivGallery.ScrollMode scrollMode = (DivGallery.ScrollMode) divGallery.scrollMode.evaluate(expressionResolver);
        divRecyclerView.setScrollMode(scrollMode);
        int i3 = WhenMappings.$EnumSwitchMapping$0[scrollMode.ordinal()];
        if (i3 == 1) {
            PagerSnapStartHelper pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.attachToRecyclerView(null);
            }
        } else if (i3 == 2) {
            int dpToPx2 = BaseDivViewExtensionsKt.dpToPx((Long) divGallery.itemSpacing.evaluate(expressionResolver), divRecyclerView.getResources().getDisplayMetrics());
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.setItemSpacing(dpToPx2);
            } else {
                pagerSnapStartHelper2 = new PagerSnapStartHelper(dpToPx2);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.attachToRecyclerView(divRecyclerView);
        }
        if (longValue == 1) {
            divGridLayoutManager = new DivLinearLayoutManager(bindingContext, divRecyclerView, divGallery, i2);
        } else {
            divGridLayoutManager = new DivGridLayoutManager(bindingContext, divRecyclerView, divGallery, i2);
        }
        divRecyclerView.setLayoutManager(divGridLayoutManager.toLayoutManager());
        divRecyclerView.setScrollInterceptionAngle(this.recyclerScrollInterceptionAngle);
        divRecyclerView.clearOnScrollListeners();
        DivViewState currentState = bindingContext.getDivView().getCurrentState();
        if (currentState != null) {
            String id = divGallery.getId();
            if (id == null) {
                id = String.valueOf(divGallery.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id);
            GalleryState galleryState = blockState instanceof GalleryState ? (GalleryState) blockState : null;
            if (galleryState != null) {
                i = galleryState.getVisibleItemIndex();
            } else {
                long longValue2 = ((Number) divGallery.defaultItem.evaluate(expressionResolver)).longValue();
                long j = longValue2 >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue2 + "' to Int");
                    }
                    i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if (galleryState != null) {
                paddingTop = galleryState.getScrollOffset();
            } else if (i != 0) {
                paddingTop = 0;
            } else if (i2 == 0) {
                paddingTop = divRecyclerView.getPaddingStart();
            } else {
                paddingTop = divRecyclerView.getPaddingTop();
            }
            scrollToPositionInternal(divRecyclerView, i, paddingTop, ScrollPositionKt.toScrollPosition(scrollMode));
            divRecyclerView.addOnScrollListener(new UpdateStateScrollListener(id, currentState, divGridLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new DivGalleryScrollListener(bindingContext, divRecyclerView, divGridLayoutManager, divGallery));
        divRecyclerView.setOnInterceptTouchEventListener(((Boolean) divGallery.restrictParentScroll.evaluate(expressionResolver)).booleanValue() ? ParentScrollRestrictor.INSTANCE : null);
    }

    private final void resetAnimatorAndRestoreOnLayout(final DivRecyclerView divRecyclerView) {
        final RecyclerView.ItemAnimator itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (!ViewsKt.isActuallyLaidOut(divRecyclerView) || divRecyclerView.isLayoutRequested()) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (DivRecyclerView.this.getItemAnimator() == null) {
                        DivRecyclerView.this.setItemAnimator(itemAnimator);
                    }
                }
            });
        } else if (divRecyclerView.getItemAnimator() == null) {
            divRecyclerView.setItemAnimator(itemAnimator);
        }
    }

    private final void scrollToPositionInternal(DivRecyclerView divRecyclerView, int i, int i2, ScrollPosition scrollPosition) {
        Object layoutManager = divRecyclerView.getLayoutManager();
        DivGalleryItemHelper divGalleryItemHelper = layoutManager instanceof DivGalleryItemHelper ? (DivGalleryItemHelper) layoutManager : null;
        if (divGalleryItemHelper == null) {
            return;
        }
        if (i2 == 0 && i == 0) {
            divGalleryItemHelper.instantScrollToPosition(i, scrollPosition);
        } else {
            divGalleryItemHelper.instantScrollToPositionWithOffset(i, i2, scrollPosition);
        }
    }

    private final void setItemDecoration(DivRecyclerView divRecyclerView, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(divRecyclerView);
        divRecyclerView.addItemDecoration(itemDecoration);
    }

    private final void removeItemDecorations(DivRecyclerView divRecyclerView) {
        int itemDecorationCount = divRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            } else {
                divRecyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
    }

    private final void bindItemBuilder(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, DivGallery divGallery) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divGallery.itemBuilder;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindItemBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7240invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7240invoke(@NotNull Object obj) {
                DivGalleryAdapter divGalleryAdapter = (DivGalleryAdapter) DivRecyclerView.this.getAdapter();
                if (divGalleryAdapter != null) {
                    divGalleryAdapter.setItems(DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver()));
                }
            }
        });
    }
}
