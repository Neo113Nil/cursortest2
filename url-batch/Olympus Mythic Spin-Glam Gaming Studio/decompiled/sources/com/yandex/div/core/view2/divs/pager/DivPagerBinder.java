package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.O6;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.PagerState;
import com.yandex.div.core.state.UpdateStateChangePageCallback;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPagerBinder.kt */
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\"\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BG\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J9\u0010*\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020,*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.J/\u00104\u001a\u000203*\u00020/2\u0006\u0010\u0018\u001a\u00020\u00032\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001b00H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\u001b*\u00020/2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u001b*\u00020/H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u001b*\u00020\u00042\u0006\u0010<\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J/\u0010@\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010H¨\u0006I"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/DivPager;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "pagerIndicatorConnector", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Ljavax/inject/Provider;Lcom/yandex/div/core/downloader/DivPatchCache;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivPager;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindInfiniteScroll", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div2/DivPager;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "com/yandex/div/core/view2/divs/pager/DivPagerBinder$createInfiniteScrollListener$1", "createInfiniteScrollListener", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder$createInfiniteScrollListener$1;", "Landroid/util/SparseArray;", "", "pageTranslations", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", O6.G1, "applyDecorations", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div2/DivPager;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/SparseArray;Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;)V", "", "isHorizontal", "(Lcom/yandex/div2/DivPager;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Landroidx/viewpager2/widget/ViewPager2;", "Lkotlin/Function1;", "", "observer", "Lcom/yandex/div/core/Disposable;", "observeSizeChange", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/yandex/div2/DivPager;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "decoration", "setItemDecoration", "(Landroidx/viewpager2/widget/ViewPager2;Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "removeItemDecorations", "(Landroidx/viewpager2/widget/ViewPager2;)V", "context", "bindItemBuilder", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivPager;)V", "view", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div2/Div$Pager;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public final class DivPagerBinder extends DivViewBinder<Div.Pager, DivPager, DivPagerView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivPagerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull Provider provider, @NotNull DivPatchCache divPatchCache, @NotNull DivActionBinder divActionBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = provider;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull DivPagerView view, @NotNull Div.Pager div, @NotNull DivStatePath path) {
        this.pagerIndicatorConnector.submitPager$div_release(view, div.getValue());
        Div.Pager div2 = view.getDiv();
        if (div == div2) {
            final ViewPager2 viewPager = view.getViewPager();
            RecyclerView.Adapter adapter = viewPager.getAdapter();
            DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
            if (divPagerAdapter == null) {
                return;
            }
            if (divPagerAdapter.applyPatch(view.getRecyclerView(), this.divPatchCache, context)) {
                DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange = view.getPagerOnItemsCountChange();
                if (pagerOnItemsCountChange != null) {
                    pagerOnItemsCountChange.onItemsUpdated();
                    return;
                }
                return;
            }
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    ViewPager2.this.requestTransform();
                }
            });
            return;
        }
        if (div2 != null) {
            view.setChangePageCallbackForOffScreenPages$div_release(null);
            removeItemDecorations(view.getViewPager());
            view.setPageTransformer$div_release(null);
        }
        this.baseBinder.bindView(context, view, div, div2);
        bind(view, context, div.getValue(), path);
    }

    private final void bind(final DivPagerView divPagerView, BindingContext bindingContext, final DivPager divPager, DivStatePath divStatePath) {
        int i;
        int position;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final SparseArray sparseArray = new SparseArray();
        boolean isAccessibilityEnabled = this.accessibilityStateProvider.isAccessibilityEnabled(divPagerView.getContext());
        divPagerView.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        final DivPagerAdapter divPagerAdapter = new DivPagerAdapter(DivCollectionExtensionsKt.buildItems(divPager, expressionResolver), bindingContext, (DivBinder) this.divBinder.get(), sparseArray, this.viewCreator, divStatePath, divPagerView);
        divPagerView.getViewPager().setAdapter(divPagerAdapter);
        bindInfiniteScroll(divPagerView, divPager, expressionResolver);
        DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange = divPagerView.getPagerOnItemsCountChange();
        if (pagerOnItemsCountChange != null) {
            pagerOnItemsCountChange.onItemsUpdated();
        }
        divPagerView.setClipToPage$div_release(divView.getDiv2Component().isPagerPageClipEnabled());
        divPagerView.setOrientation(!isHorizontal(divPager, expressionResolver) ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment((DivPager.ItemAlignment) divPager.crossAxisAlignment.evaluate(expressionResolver));
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7241invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7241invoke(@NotNull Object obj) {
                DivPagerBinder.this.applyDecorations(divPagerView, divPager, expressionResolver, sparseArray, divPagerAdapter);
            }
        };
        DivEdgeInsets paddings = divPager.getPaddings();
        divPagerView.addSubscription((paddings == null || (expression4 = paddings.left) == null) ? null : expression4.observe(expressionResolver, function1));
        DivEdgeInsets paddings2 = divPager.getPaddings();
        divPagerView.addSubscription((paddings2 == null || (expression3 = paddings2.right) == null) ? null : expression3.observe(expressionResolver, function1));
        DivEdgeInsets paddings3 = divPager.getPaddings();
        divPagerView.addSubscription((paddings3 == null || (expression2 = paddings3.top) == null) ? null : expression2.observe(expressionResolver, function1));
        DivEdgeInsets paddings4 = divPager.getPaddings();
        divPagerView.addSubscription((paddings4 == null || (expression = paddings4.bottom) == null) ? null : expression.observe(expressionResolver, function1));
        divPagerView.addSubscription(divPager.itemSpacing.value.observe(expressionResolver, function1));
        divPagerView.addSubscription(divPager.itemSpacing.unit.observe(expressionResolver, function1));
        divPagerView.addSubscription(divPager.scrollAxisAlignment.observe(expressionResolver, function1));
        divPagerView.addSubscription(divPager.crossAxisAlignment.observe(expressionResolver, function1));
        divPagerView.addSubscription(divPager.orientation.observe(expressionResolver, function1));
        divPagerView.addSubscription(observeSizeChange(divPagerView.getViewPager(), divPager, function1));
        DivPagerLayoutMode divPagerLayoutMode = divPager.layoutMode;
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.NeighbourPageSize) {
            DivPagerLayoutMode.NeighbourPageSize neighbourPageSize = (DivPagerLayoutMode.NeighbourPageSize) divPagerLayoutMode;
            divPagerView.addSubscription(neighbourPageSize.getValue().neighbourPageWidth.value.observe(expressionResolver, function1));
            divPagerView.addSubscription(neighbourPageSize.getValue().neighbourPageWidth.unit.observe(expressionResolver, function1));
        } else if (divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize) {
            divPagerView.addSubscription(((DivPagerLayoutMode.PageSize) divPagerLayoutMode).getValue().pageWidth.value.observe(expressionResolver, function1));
        } else {
            boolean z = divPagerLayoutMode instanceof DivPagerLayoutMode.PageContentSize;
        }
        divPagerView.setPagerSelectedActionsDispatcher$div_release(new PagerSelectedActionsDispatcher(divView, divPagerAdapter.getItemsToShow(), this.divActionBinder));
        divPagerView.setChangePageCallbackForLogger$div_release(new DivPagerPageChangeCallback(divPager, divPagerAdapter.getItemsToShow(), bindingContext, recyclerView, divPagerView));
        DivViewState currentState = divView.getCurrentState();
        if (currentState != null) {
            String id = divPager.getId();
            if (id == null) {
                id = String.valueOf(divPager.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id);
            PagerState pagerState = blockState instanceof PagerState ? (PagerState) blockState : null;
            divPagerView.setChangePageCallbackForState$div_release(new UpdateStateChangePageCallback(id, currentState));
            if (pagerState != null) {
                Integer valueOf = Integer.valueOf(pagerState.getCurrentPageIndex());
                Integer num = valueOf.intValue() < divPagerAdapter.getRealPosition(divPagerAdapter.getItemsToShow().size()) ? valueOf : null;
                if (num != null) {
                    position = num.intValue();
                    divPagerView.setCurrentItem$div_release(position);
                }
            }
            long longValue = ((Number) divPager.defaultItem.evaluate(expressionResolver)).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            position = divPagerAdapter.getPosition(i);
            divPagerView.setCurrentItem$div_release(position);
        }
        divPagerView.addSubscription(divPager.restrictParentScroll.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                DivPagerView.this.setOnInterceptTouchEventListener(z2 ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
        bindItemBuilder(divPagerView, bindingContext, divPager);
        if (isAccessibilityEnabled) {
            divPagerView.enableAccessibility();
        }
    }

    private final void bindInfiniteScroll(final DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver) {
        View childAt = divPagerView.getViewPager().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        final RecyclerView recyclerView = (RecyclerView) childAt;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        divPager.infiniteScroll.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindInfiniteScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r3v9, types: [T, com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
            public final void invoke(boolean z) {
                ?? createInfiniteScrollListener;
                RecyclerView.Adapter adapter = DivPagerView.this.getViewPager().getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter != null) {
                    divPagerAdapter.setInfiniteScrollEnabled(z);
                }
                if (z) {
                    RecyclerView.OnScrollListener onScrollListener = ref$ObjectRef.element;
                    RecyclerView.OnScrollListener onScrollListener2 = onScrollListener;
                    if (onScrollListener == null) {
                        createInfiniteScrollListener = this.createInfiniteScrollListener(DivPagerView.this);
                        ref$ObjectRef.element = createInfiniteScrollListener;
                        onScrollListener2 = createInfiniteScrollListener;
                    }
                    recyclerView.addOnScrollListener(onScrollListener2);
                    return;
                }
                RecyclerView.OnScrollListener onScrollListener3 = ref$ObjectRef.element;
                if (onScrollListener3 != null) {
                    recyclerView.removeOnScrollListener(onScrollListener3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final DivPagerBinder$createInfiniteScrollListener$1 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.OnScrollListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView.Adapter adapter = DivPagerView.this.getViewPager().getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition >= itemCount - 2 && dx > 0) {
                    recyclerView.scrollToPosition(2);
                } else {
                    if (findLastVisibleItemPosition > 1 || dx >= 0) {
                        return;
                    }
                    recyclerView.scrollToPosition(itemCount - 3);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyDecorations(DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        DivPagerPageSizeProvider neighbourPageSizeProvider;
        DivPagerPageSizeProvider divPagerPageSizeProvider;
        DivPagerPaddingsHolder divPagerPaddingsHolder;
        RecyclerView.ItemDecoration wrapContentPageSizeItemDecoration;
        DivPager.ItemAlignment itemAlignment;
        DivPagerPageSizeProvider divPagerPageSizeProvider2;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        boolean isHorizontal = isHorizontal(divPager, expressionResolver);
        divPagerView.setOrientation(!isHorizontal ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment((DivPager.ItemAlignment) divPager.crossAxisAlignment.evaluate(expressionResolver));
        if (ViewsKt.isActuallyLaidOut(divPagerView)) {
            DisplayMetrics displayMetrics = divPagerView.getResources().getDisplayMetrics();
            ViewPager2 viewPager = divPagerView.getViewPager();
            int width = isHorizontal ? viewPager.getWidth() : viewPager.getHeight();
            float pxF = BaseDivViewExtensionsKt.toPxF(divPager.itemSpacing, displayMetrics, expressionResolver);
            boolean booleanValue = ((Boolean) divPager.infiniteScroll.evaluate(expressionResolver)).booleanValue();
            DivPager.ItemAlignment itemAlignment2 = (DivPager.ItemAlignment) divPager.scrollAxisAlignment.evaluate(expressionResolver);
            DivPagerPaddingsHolder divPagerPaddingsHolder2 = new DivPagerPaddingsHolder(divPager.getPaddings(), expressionResolver, divPagerView, displayMetrics, isHorizontal, itemAlignment2);
            DivPagerLayoutMode divPagerLayoutMode = divPager.layoutMode;
            if (divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize) {
                divPagerPageSizeProvider2 = new PercentagePageSizeProvider(((DivPagerLayoutMode.PageSize) divPagerLayoutMode).getValue(), expressionResolver, width, divPagerPaddingsHolder2, itemAlignment2);
            } else {
                if (divPagerLayoutMode instanceof DivPagerLayoutMode.NeighbourPageSize) {
                    neighbourPageSizeProvider = new NeighbourPageSizeProvider(((DivPagerLayoutMode.NeighbourPageSize) divPagerLayoutMode).getValue(), expressionResolver, displayMetrics, width, pxF, divPagerPaddingsHolder2, itemAlignment2);
                    if (!(neighbourPageSizeProvider instanceof FixedPageSizeProvider)) {
                        FixedPageSizeProvider fixedPageSizeProvider = (FixedPageSizeProvider) neighbourPageSizeProvider;
                        divPagerPageSizeProvider = neighbourPageSizeProvider;
                        new FixedPageSizeOffScreenPagesController(divPagerView, width, pxF, fixedPageSizeProvider, divPagerPaddingsHolder2, booleanValue, divPagerAdapter);
                        divPagerPaddingsHolder = divPagerPaddingsHolder2;
                        wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider);
                        itemAlignment = itemAlignment2;
                    } else {
                        divPagerPageSizeProvider = neighbourPageSizeProvider;
                        divPagerPaddingsHolder = divPagerPaddingsHolder2;
                        new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                        itemAlignment = itemAlignment2;
                        wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(width, divPagerPaddingsHolder, itemAlignment);
                    }
                    setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
                    divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, width, divPager.pageTransformation, new DivPagerPageOffsetProvider(width, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter, itemAlignment), isHorizontal));
                }
                if (divPagerLayoutMode instanceof DivPagerLayoutMode.PageContentSize) {
                    divPagerPageSizeProvider2 = new WrapContentPageSizeProvider(recyclerView, isHorizontal, width, divPagerPaddingsHolder2, itemAlignment2);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            neighbourPageSizeProvider = divPagerPageSizeProvider2;
            if (!(neighbourPageSizeProvider instanceof FixedPageSizeProvider)) {
            }
            setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
            divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, width, divPager.pageTransformation, new DivPagerPageOffsetProvider(width, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter, itemAlignment), isHorizontal));
        }
    }

    private final boolean isHorizontal(DivPager divPager, ExpressionResolver expressionResolver) {
        return divPager.orientation.evaluate(expressionResolver) == DivPager.Orientation.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, DivPager divPager, Function1 function1) {
        return new DivPagerBinder$observeSizeChange$1(viewPager2, function1, divPager);
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(viewPager2);
        viewPager2.addItemDecoration(itemDecoration);
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            viewPager2.removeItemDecorationAt(i);
        }
    }

    private final void bindItemBuilder(final DivPagerView divPagerView, final BindingContext bindingContext, DivPager divPager) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divPager.itemBuilder;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7242invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7242invoke(@NotNull Object obj) {
                DivPagerAdapter divPagerAdapter = (DivPagerAdapter) DivPagerView.this.getViewPager().getAdapter();
                if (divPagerAdapter != null) {
                    DivCollectionItemBuilder divCollectionItemBuilder2 = divCollectionItemBuilder;
                    BindingContext bindingContext2 = bindingContext;
                    final DivPagerView divPagerView2 = DivPagerView.this;
                    divPagerAdapter.setItems(DivCollectionExtensionsKt.build(divCollectionItemBuilder2, bindingContext2.getExpressionResolver()));
                    DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange = divPagerView2.getPagerOnItemsCountChange();
                    if (pagerOnItemsCountChange != null) {
                        pagerOnItemsCountChange.onItemsUpdated();
                    }
                    RecyclerView recyclerView = divPagerView2.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(divPagerAdapter.realItemPosition(divPagerView2.getCurrentItem$div_release()));
                    }
                    divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            DivPagerView.this.getViewPager().requestTransform();
                        }
                    });
                }
            }
        });
    }
}
