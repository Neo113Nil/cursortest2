package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableKt;
import com.yandex.div.DivDataTag;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001JBw\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 JB\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.H\u0002J(\u0010/\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0016J0\u00100\u001a\u0002012\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000209H\u0002J(\u0010:\u001a\u00020%*\u0006\u0012\u0002\b\u00030;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010(\u001a\u00020)H\u0002J \u0010@\u001a\u00020%*\u0006\u0012\u0002\b\u00030;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020AH\u0002J&\u0010B\u001a\u00020%*\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0014J\u001c\u0010C\u001a\u00020D*\u00020A2\u0006\u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020=H\u0002J&\u0010G\u001a\u00020%*\u00020\u00042\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010(\u001a\u00020)H\u0002J \u0010H\u001a\u00020%*\u0006\u0012\u0002\b\u00030;2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H\u0002J\u001e\u0010I\u001a\u00020%*\u00020\u00042\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/DivTabs;", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "divBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "viewPool", "Lcom/yandex/div/internal/viewpool/ViewPool;", "textStyleProvider", "Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "actionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "div2Logger", "Lcom/yandex/div/core/Div2Logger;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "visibilityActionTracker", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "context", "Landroid/content/Context;", "runtimeVisitor", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "tabsStateCache", "Lcom/yandex/div/core/state/TabsStateCache;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Ljavax/inject/Provider;Lcom/yandex/div/internal/viewpool/ViewPool;Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/downloader/DivPatchCache;Landroid/content/Context;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;Lcom/yandex/div/core/state/TabsStateCache;)V", "oldDivSelectedTab", "", "Ljava/lang/Long;", "bindAdapter", "", "path", "Lcom/yandex/div/core/state/DivStatePath;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "view", "oldDiv", "div", "subscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "bindView", "createAdapter", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "getDisabledScrollPages", "", "", "lastPageNumber", "isSwipeEnabled", "", "getTabbedCardLayoutIds", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;", "applyDelimiterStyle", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "style", "Lcom/yandex/div2/DivTabs$TabTitleDelimiter;", "applyStyle", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "bind", "getCornerRadii", "", "metrics", "Landroid/util/DisplayMetrics;", "observeDividerStyle", "observeHeight", "observeStyle", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public final class DivTabsBinder extends DivViewBinder<Div.Tabs, DivTabs, DivTabsLayout> {
    private static final float DEFAULT_LINE_HEIGHT_COEFFICIENT = 1.3f;

    @NotNull
    private static final String TAG_TAB_HEADER = "DIV2.TAB_HEADER_VIEW";

    @NotNull
    private static final String TAG_TAB_ITEM = "DIV2.TAB_ITEM_VIEW";

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Context context;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivImageLoader imageLoader;

    @Nullable
    private Long oldDivSelectedTab;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    @NotNull
    private final TabTextStyleProvider textStyleProvider;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final DivTabs.TabTitleStyle DEFAULT_TAB_TITLE_STYLE = new DivTabs.TabTitleStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);

    /* compiled from: DivTabsBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTabs.TabTitleStyle.AnimationType.values().length];
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$lambda$5(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$setupNewAdapter$lambda$4(List list) {
        return list;
    }

    public DivTabsBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull Provider provider, @NotNull ViewPool viewPool, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull DivImageLoader divImageLoader, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPatchCache divPatchCache, @NotNull Context context, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull TabsStateCache tabsStateCache) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = provider;
        this.viewPool = viewPool;
        this.textStyleProvider = tabTextStyleProvider;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.imageLoader = divImageLoader;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.divPatchCache = divPatchCache;
        this.context = context;
        this.runtimeVisitor = divRuntimeVisitor;
        this.tabsStateCache = tabsStateCache;
        viewPool.register(TAG_TAB_HEADER, new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.register(TAG_TAB_ITEM, new ViewFactory() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                TabItemLayout _init_$lambda$0;
                _init_$lambda$0 = DivTabsBinder._init_$lambda$0(DivTabsBinder.this);
                return _init_$lambda$0;
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabItemLayout _init_$lambda$0(DivTabsBinder divTabsBinder) {
        return new TabItemLayout(divTabsBinder.context, null, 2, null);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull DivTabsLayout view, @NotNull Div.Tabs div, @NotNull DivStatePath path) {
        Div.Tabs applyPatch;
        Div.Tabs div2 = view.getDiv();
        if (div2 == div) {
            DivTabsAdapter divTabsAdapter = view.getDivTabsAdapter();
            if (divTabsAdapter != null && (applyPatch = divTabsAdapter.applyPatch(context.getExpressionResolver(), div)) != null) {
                view.setDiv(applyPatch);
                return;
            }
        } else {
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.getValue(), div2 != null ? div2.getValue() : null);
        }
        bindAdapter(path, context, view, div2 != null ? div2.getValue() : null, div.getValue(), (DivBinder) this.divBinder.get(), view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivTabsLayout divTabsLayout, @NotNull final BindingContext bindingContext, @NotNull final DivTabs divTabs, @Nullable DivTabs divTabs2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divTabsLayout.setClipToPadding(false);
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$applyPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7246invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7246invoke(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(DivTabsLayout.this.getTitleLayout(), divTabs.titlePaddings, expressionResolver);
            }
        };
        function1.invoke(null);
        divTabsLayout.addSubscription(divTabs.titlePaddings.left.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(divTabs.titlePaddings.right.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(divTabs.titlePaddings.top.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(divTabs.titlePaddings.bottom.observe(expressionResolver, function1));
        observeHeight(divTabsLayout.getTitleLayout(), divTabs, expressionResolver);
        observeStyle(divTabsLayout, expressionResolver, divTabs.tabTitleStyle);
        observeDividerStyle(divTabsLayout, expressionResolver, divTabs.tabTitleDelimiter, bindingContext);
        divTabsLayout.getPagerLayout().setClipToPadding(false);
        DivTabsBinderKt.observe(divTabs.separatorPaddings, expressionResolver, divTabsLayout, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7245invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7245invoke(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyMargins(DivTabsLayout.this.getDivider(), divTabs.separatorPaddings, expressionResolver);
            }
        });
        divTabsLayout.addSubscription(divTabs.separatorColor.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DivTabsLayout.this.getDivider().setBackgroundColor(i);
            }
        }));
        divTabsLayout.addSubscription(divTabs.hasSeparator.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivTabsLayout.this.getDivider().setVisibility(z ? 0 : 8);
            }
        }));
        divTabsLayout.getTitleLayout().setOnScrollChangedListener(new TabTitlesLayoutView.OnScrollChangedListener() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.OnScrollChangedListener
            public final void onScrolled() {
                DivTabsBinder.bind$lambda$2(DivTabsBinder.this, bindingContext);
            }
        });
        divTabsLayout.getTitleLayout().setFocusTracker(bindingContext.getDivView().getInputFocusTracker());
        divTabsLayout.addSubscription(divTabs.restrictParentScroll.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivTabsLayout.this.getViewPager().setOnInterceptTouchEventListener(z ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DivTabsBinder divTabsBinder, BindingContext bindingContext) {
        divTabsBinder.div2Logger.logTabTitlesScroll(bindingContext.getDivView());
    }

    private final void bindAdapter(final DivStatePath path, final BindingContext bindingContext, final DivTabsLayout view, DivTabs oldDiv, final DivTabs div, final DivBinder divBinder, ExpressionSubscriber subscriber) {
        DivTabsAdapter tryReuse;
        int i;
        Long l;
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List list = div.items;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.Item) it.next(), view.getResources().getDisplayMetrics(), expressionResolver));
        }
        tryReuse = DivTabsBinderKt.tryReuse(view.getDivTabsAdapter(), div, expressionResolver);
        if (tryReuse != null) {
            tryReuse.setBindingContext(bindingContext);
            tryReuse.setStatePath(path);
            tryReuse.getDivTabsEventManager().setDiv(div);
            tryReuse.getActiveStateTracker().setDiv(div);
            if (oldDiv == div) {
                tryReuse.notifyStateChanged();
            } else {
                tryReuse.setData(new BaseDivTabbedCardUi.Input() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda2
                    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
                    public final List getTabs() {
                        List bindAdapter$lambda$5;
                        bindAdapter$lambda$5 = DivTabsBinder.bindAdapter$lambda$5(arrayList);
                        return bindAdapter$lambda$5;
                    }
                }, expressionResolver, subscriber);
            }
        } else {
            long longValue = ((Number) div.selectedTab.evaluate(expressionResolver)).longValue();
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
            bindAdapter$setupNewAdapter(this, bindingContext, div, view, divBinder, path, arrayList, i);
        }
        DivTabsBinderKt.observeFixedHeightChange(div.items, expressionResolver, subscriber, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7247invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7247invoke(@Nullable Object obj) {
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.notifyStateChanged();
                }
            }
        });
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                PagerController pager;
                int i2;
                DivTabsBinder.this.oldDivSelectedTab = Long.valueOf(j2);
                DivTabsAdapter divTabsAdapter = view.getDivTabsAdapter();
                if (divTabsAdapter == null || (pager = divTabsAdapter.getPager()) == null) {
                    return;
                }
                long j3 = j2 >> 31;
                if (j3 == 0 || j3 == -1) {
                    i2 = (int) j2;
                } else {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j2 + "' to Int");
                    }
                    i2 = j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if (pager.getCurrentItemIndex() != i2) {
                    pager.smoothScrollTo(i2);
                }
            }
        };
        subscriber.addSubscription(div.dynamicHeight.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                int i2;
                PagerController pager;
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter == null || divTabsAdapter.getIsDynamicHeight() != z) {
                    DivTabsBinder divTabsBinder = this;
                    BindingContext bindingContext2 = bindingContext;
                    DivTabs divTabs = div;
                    DivTabsLayout divTabsLayout = DivTabsLayout.this;
                    DivBinder divBinder2 = divBinder;
                    DivStatePath divStatePath = path;
                    List<DivSimpleTab> list2 = arrayList;
                    DivTabsAdapter divTabsAdapter2 = divTabsLayout.getDivTabsAdapter();
                    if (divTabsAdapter2 == null || (pager = divTabsAdapter2.getPager()) == null) {
                        long longValue2 = ((Number) div.selectedTab.evaluate(expressionResolver)).longValue();
                        long j2 = longValue2 >> 31;
                        if (j2 == 0 || j2 == -1) {
                            i2 = (int) longValue2;
                        } else {
                            KAssert kAssert2 = KAssert.INSTANCE;
                            if (Assert.isEnabled()) {
                                Assert.fail("Unable convert '" + longValue2 + "' to Int");
                            }
                            i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                        }
                    } else {
                        i2 = pager.getCurrentItemIndex();
                    }
                    DivTabsBinder.bindAdapter$setupNewAdapter(divTabsBinder, bindingContext2, divTabs, divTabsLayout, divBinder2, divStatePath, list2, i2);
                }
            }
        }));
        subscriber.addSubscription(div.selectedTab.observe(expressionResolver, function1));
        Div2View divView = bindingContext.getDivView();
        boolean z = Intrinsics.areEqual(divView.getPrevDataTag(), DivDataTag.INVALID) || Intrinsics.areEqual(divView.getDataTag(), divView.getPrevDataTag());
        long longValue2 = ((Number) div.selectedTab.evaluate(expressionResolver)).longValue();
        if (!z || (l = this.oldDivSelectedTab) == null || l.longValue() != longValue2) {
            function1.invoke(Long.valueOf(longValue2));
        }
        subscriber.addSubscription(div.switchTabsByContentSwipeEnabled.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                Set<Integer> disabledScrollPages;
                DivTabsAdapter divTabsAdapter = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    disabledScrollPages = this.getDisabledScrollPages(div.items.size() - 1, z2);
                    divTabsAdapter.setDisabledScrollPages(disabledScrollPages);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdapter$setupNewAdapter(DivTabsBinder divTabsBinder, BindingContext bindingContext, DivTabs divTabs, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath, final List<DivSimpleTab> list, int i) {
        DivTabsAdapter createAdapter = divTabsBinder.createAdapter(bindingContext, divTabs, divTabsLayout, divBinder, divStatePath);
        createAdapter.setData(new BaseDivTabbedCardUi.Input() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                List bindAdapter$setupNewAdapter$lambda$4;
                bindAdapter$setupNewAdapter$lambda$4 = DivTabsBinder.bindAdapter$setupNewAdapter$lambda$4(list);
                return bindAdapter$setupNewAdapter$lambda$4;
            }
        }, i);
        divTabsLayout.setDivTabsAdapter(createAdapter);
    }

    private final DivTabsAdapter createAdapter(BindingContext bindingContext, DivTabs div, DivTabsLayout view, DivBinder divBinder, DivStatePath path) {
        final DivTabsEventManager divTabsEventManager = new DivTabsEventManager(bindingContext, this.actionBinder, this.div2Logger, this.visibilityActionTracker, view, div);
        boolean booleanValue = ((Boolean) div.dynamicHeight.evaluate(bindingContext.getExpressionResolver())).booleanValue();
        HeightCalculatorFactory heightCalculatorFactory = booleanValue ? new HeightCalculatorFactory() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        } : new HeightCalculatorFactory() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        };
        int currentItem = view.getViewPager().getCurrentItem();
        final int currentItem2 = view.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler.INSTANCE.postOnMainThread(new Function0() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$createAdapter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    DivTabsEventManager.this.onPageDisplayed(currentItem2);
                }
            });
        }
        return new DivTabsAdapter(this.viewPool, view, getTabbedCardLayoutIds(), heightCalculatorFactory, booleanValue, bindingContext, this.textStyleProvider, this.viewCreator, divBinder, divTabsEventManager, new DivTabsActiveStateTracker(bindingContext, path, this.div2Logger, this.tabsStateCache, this.runtimeVisitor, div), path, this.divPatchCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> getDisabledScrollPages(int lastPageNumber, boolean isSwipeEnabled) {
        return isSwipeEnabled ? new LinkedHashSet() : CollectionsKt.toMutableSet(new IntRange(0, lastPageNumber));
    }

    private final void observeHeight(final TabTitlesLayoutView<?> tabTitlesLayoutView, final DivTabs divTabs, final ExpressionResolver expressionResolver) {
        DivEdgeInsets divEdgeInsets;
        Expression expression;
        DivEdgeInsets divEdgeInsets2;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7249invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7249invoke(@Nullable Object obj) {
                DivTabs.TabTitleStyle tabTitleStyle = DivTabs.this.tabTitleStyle;
                if (tabTitleStyle == null) {
                    tabTitleStyle = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                DivEdgeInsets divEdgeInsets3 = tabTitleStyle.paddings;
                DivEdgeInsets divEdgeInsets4 = DivTabs.this.titlePaddings;
                Expression expression5 = tabTitleStyle.lineHeight;
                long longValue = (expression5 != null ? ((Number) expression5.evaluate(expressionResolver)).longValue() : (long) (((Number) tabTitleStyle.fontSize.evaluate(expressionResolver)).floatValue() * 1.3f)) + ((Number) divEdgeInsets3.top.evaluate(expressionResolver)).longValue() + ((Number) divEdgeInsets3.bottom.evaluate(expressionResolver)).longValue() + ((Number) divEdgeInsets4.top.evaluate(expressionResolver)).longValue() + ((Number) divEdgeInsets4.bottom.evaluate(expressionResolver)).longValue();
                tabTitlesLayoutView.getLayoutParams().height = BaseDivViewExtensionsKt.spToPx(Long.valueOf(longValue), tabTitlesLayoutView.getResources().getDisplayMetrics());
            }
        };
        Disposable disposable = null;
        function1.invoke(null);
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(tabTitlesLayoutView);
        DivTabs.TabTitleStyle tabTitleStyle = divTabs.tabTitleStyle;
        expressionSubscriber.addSubscription((tabTitleStyle == null || (expression4 = tabTitleStyle.lineHeight) == null) ? null : expression4.observe(expressionResolver, function1));
        DivTabs.TabTitleStyle tabTitleStyle2 = divTabs.tabTitleStyle;
        expressionSubscriber.addSubscription((tabTitleStyle2 == null || (expression3 = tabTitleStyle2.fontSize) == null) ? null : expression3.observe(expressionResolver, function1));
        DivTabs.TabTitleStyle tabTitleStyle3 = divTabs.tabTitleStyle;
        expressionSubscriber.addSubscription((tabTitleStyle3 == null || (divEdgeInsets2 = tabTitleStyle3.paddings) == null || (expression2 = divEdgeInsets2.top) == null) ? null : expression2.observe(expressionResolver, function1));
        DivTabs.TabTitleStyle tabTitleStyle4 = divTabs.tabTitleStyle;
        if (tabTitleStyle4 != null && (divEdgeInsets = tabTitleStyle4.paddings) != null && (expression = divEdgeInsets.bottom) != null) {
            disposable = expression.observe(expressionResolver, function1);
        }
        expressionSubscriber.addSubscription(disposable);
        expressionSubscriber.addSubscription(divTabs.titlePaddings.top.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divTabs.titlePaddings.bottom.observe(expressionResolver, function1));
    }

    private final void observeStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.TabTitleStyle tabTitleStyle) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        DivCornersRadius divCornersRadius;
        Expression expression4;
        DivCornersRadius divCornersRadius2;
        Expression expression5;
        DivCornersRadius divCornersRadius3;
        Expression expression6;
        DivCornersRadius divCornersRadius4;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        applyStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleStyle == null ? DEFAULT_TAB_TITLE_STYLE : tabTitleStyle);
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7250invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7250invoke(@Nullable Object obj) {
                DivTabsBinder divTabsBinder = DivTabsBinder.this;
                TabTitlesLayoutView<?> titleLayout = divTabsLayout.getTitleLayout();
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivTabs.TabTitleStyle tabTitleStyle2 = tabTitleStyle;
                if (tabTitleStyle2 == null) {
                    tabTitleStyle2 = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                divTabsBinder.applyStyle(titleLayout, expressionResolver2, tabTitleStyle2);
            }
        };
        if (tabTitleStyle != null && (expression12 = tabTitleStyle.activeTextColor) != null) {
            expression12.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression11 = tabTitleStyle.activeBackgroundColor) != null) {
            expression11.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression10 = tabTitleStyle.inactiveTextColor) != null) {
            expression10.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression9 = tabTitleStyle.inactiveBackgroundColor) != null) {
            expression9.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression8 = tabTitleStyle.cornerRadius) != null) {
            expression8.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (divCornersRadius4 = tabTitleStyle.cornersRadius) != null && (expression7 = divCornersRadius4.topLeft) != null) {
            expression7.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (divCornersRadius3 = tabTitleStyle.cornersRadius) != null && (expression6 = divCornersRadius3.topRight) != null) {
            expression6.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (divCornersRadius2 = tabTitleStyle.cornersRadius) != null && (expression5 = divCornersRadius2.bottomRight) != null) {
            expression5.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (divCornersRadius = tabTitleStyle.cornersRadius) != null && (expression4 = divCornersRadius.bottomLeft) != null) {
            expression4.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression3 = tabTitleStyle.itemSpacing) != null) {
            expression3.observe(expressionResolver, function1);
        }
        if (tabTitleStyle != null && (expression2 = tabTitleStyle.animationType) != null) {
            expression2.observe(expressionResolver, function1);
        }
        if (tabTitleStyle == null || (expression = tabTitleStyle.animationDuration) == null) {
            return;
        }
        expression.observe(expressionResolver, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleStyle tabTitleStyle) {
        BaseIndicatorTabLayout.AnimationType animationType;
        int intValue = ((Number) tabTitleStyle.activeTextColor.evaluate(expressionResolver)).intValue();
        int intValue2 = ((Number) tabTitleStyle.activeBackgroundColor.evaluate(expressionResolver)).intValue();
        int intValue3 = ((Number) tabTitleStyle.inactiveTextColor.evaluate(expressionResolver)).intValue();
        Expression expression = tabTitleStyle.inactiveBackgroundColor;
        tabTitlesLayoutView.setTabColors(intValue, intValue2, intValue3, expression != null ? ((Number) expression.evaluate(expressionResolver)).intValue() : 0);
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        tabTitlesLayoutView.setTabIndicatorCornersRadii(getCornerRadii(tabTitleStyle, displayMetrics, expressionResolver));
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.dpToPx((Long) tabTitleStyle.itemSpacing.evaluate(expressionResolver), displayMetrics));
        int i = WhenMappings.$EnumSwitchMapping$0[((DivTabs.TabTitleStyle.AnimationType) tabTitleStyle.animationType.evaluate(expressionResolver)).ordinal()];
        if (i == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(((Number) tabTitleStyle.animationDuration.evaluate(expressionResolver)).longValue());
        tabTitlesLayoutView.setTabTitleStyle(tabTitleStyle);
    }

    private final void observeDividerStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.TabTitleDelimiter tabTitleDelimiter, final BindingContext bindingContext) {
        if (tabTitleDelimiter == null) {
            return;
        }
        applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleDelimiter, bindingContext);
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeDividerStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7248invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7248invoke(@Nullable Object obj) {
                DivTabsBinder.this.applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleDelimiter, bindingContext);
            }
        };
        tabTitleDelimiter.width.value.observe(expressionResolver, function1);
        tabTitleDelimiter.width.unit.observe(expressionResolver, function1);
        tabTitleDelimiter.height.value.observe(expressionResolver, function1);
        tabTitleDelimiter.height.unit.observe(expressionResolver, function1);
        tabTitleDelimiter.imageUrl.observe(expressionResolver, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDelimiterStyle(final TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleDelimiter tabTitleDelimiter, BindingContext bindingContext) {
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        DivFixedSize divFixedSize = tabTitleDelimiter.width;
        final int px = BaseDivViewExtensionsKt.toPx(((Number) divFixedSize.value.evaluate(expressionResolver)).longValue(), (DivSizeUnit) divFixedSize.unit.evaluate(expressionResolver), displayMetrics);
        DivFixedSize divFixedSize2 = tabTitleDelimiter.height;
        final int px2 = BaseDivViewExtensionsKt.toPx(((Number) divFixedSize2.value.evaluate(expressionResolver)).longValue(), (DivSizeUnit) divFixedSize2.unit.evaluate(expressionResolver), displayMetrics);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri = ((Uri) tabTitleDelimiter.imageUrl.evaluate(expressionResolver)).toString();
        final Div2View divView = bindingContext.getDivView();
        bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$applyDelimiterStyle$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                tabTitlesLayoutView.setTabDelimiter(cachedBitmap.getBitmap(), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                super.onSuccess(pictureDrawable);
                tabTitlesLayoutView.setTabDelimiter(DrawableKt.toBitmap$default(pictureDrawable, 0, 0, null, 7, null), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                tabTitlesLayoutView.setTabDelimiter(null, 0, 0);
            }
        }), tabTitlesLayoutView);
    }

    private static final float getCornerRadii$toCornerRadii(Expression<Long> expression, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt.dpToPx(expression.evaluate(expressionResolver), displayMetrics);
    }

    private final float[] getCornerRadii(DivTabs.TabTitleStyle tabTitleStyle, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        float f;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5 = tabTitleStyle.cornerRadius;
        if (expression5 != null) {
            f = getCornerRadii$toCornerRadii(expression5, expressionResolver, displayMetrics);
        } else {
            f = tabTitleStyle.cornersRadius == null ? -1.0f : 0.0f;
        }
        DivCornersRadius divCornersRadius = tabTitleStyle.cornersRadius;
        float cornerRadii$toCornerRadii = (divCornersRadius == null || (expression4 = divCornersRadius.topLeft) == null) ? f : getCornerRadii$toCornerRadii(expression4, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius2 = tabTitleStyle.cornersRadius;
        float cornerRadii$toCornerRadii2 = (divCornersRadius2 == null || (expression3 = divCornersRadius2.topRight) == null) ? f : getCornerRadii$toCornerRadii(expression3, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius3 = tabTitleStyle.cornersRadius;
        float cornerRadii$toCornerRadii3 = (divCornersRadius3 == null || (expression2 = divCornersRadius3.bottomLeft) == null) ? f : getCornerRadii$toCornerRadii(expression2, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius4 = tabTitleStyle.cornersRadius;
        if (divCornersRadius4 != null && (expression = divCornersRadius4.bottomRight) != null) {
            f = getCornerRadii$toCornerRadii(expression, expressionResolver, displayMetrics);
        }
        return new float[]{cornerRadii$toCornerRadii, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii2, f, f, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii3};
    }

    private final BaseDivTabbedCardUi.TabbedCardConfig getTabbedCardLayoutIds() {
        return new BaseDivTabbedCardUi.TabbedCardConfig(R.id.base_tabbed_title_container_scroller, R.id.div_tabs_pager_container, R.id.div_tabs_container_helper, true, false, TAG_TAB_HEADER, TAG_TAB_ITEM);
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder$Companion;", "", "()V", "DEFAULT_LINE_HEIGHT_COEFFICIENT", "", "DEFAULT_TAB_TITLE_STYLE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TAG_TAB_HEADER", "", "TAG_TAB_ITEM", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
