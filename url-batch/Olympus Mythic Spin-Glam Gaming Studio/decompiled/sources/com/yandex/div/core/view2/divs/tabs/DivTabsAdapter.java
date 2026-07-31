package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTabsAdapter.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001Bm\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0018\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020;J \u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0014J \u0010D\u001a\u00020\b2\u0006\u0010>\u001a\u00020E2\u0006\u0010<\u001a\u00020=2\u0006\u0010B\u001a\u00020CH\u0002J \u0010F\u001a\u00020G2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0014J\u0010\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020CH\u0002J\u0006\u0010J\u001a\u00020GJ\u001c\u0010K\u001a\u00020G2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020M2\u0006\u0010N\u001a\u00020CJ\u0010\u0010O\u001a\u00020G2\u0006\u0010@\u001a\u00020\u0003H\u0014R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R$\u00103\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002090*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi;", "Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "Landroid/view/ViewGroup;", "Lcom/yandex/div2/DivAction;", "viewPool", "Lcom/yandex/div/internal/viewpool/ViewPool;", "view", "Landroid/view/View;", "tabbedCardConfig", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;", "heightCalculatorFactory", "Lcom/yandex/div/internal/widget/tabs/HeightCalculatorFactory;", "isDynamicHeight", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "textStyleProvider", "Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "divTabsEventManager", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "activeStateTracker", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "(Lcom/yandex/div/internal/viewpool/ViewPool;Landroid/view/View;Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;Lcom/yandex/div/internal/widget/tabs/HeightCalculatorFactory;ZLcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/downloader/DivPatchCache;)V", "getActiveStateTracker", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "childIds", "", "", "childStates", "", "getDivTabsEventManager", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "()Z", "pager", "Lcom/yandex/div/core/view2/divs/tabs/PagerController;", "getPager", "()Lcom/yandex/div/core/view2/divs/tabs/PagerController;", "value", "statePath", "getStatePath", "()Lcom/yandex/div/core/state/DivStatePath;", "setStatePath", "(Lcom/yandex/div/core/state/DivStatePath;)V", "tabModels", "Lcom/yandex/div/core/view2/divs/tabs/TabModel;", "applyPatch", "Lcom/yandex/div2/Div$Tabs;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div", "bindTabData", "tabView", "tab", "tabNumber", "", "createItemView", "Lcom/yandex/div2/Div;", "fillMeasuringTab", "", "getChildPath", "index", "notifyStateChanged", "setData", "data", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$Input;", "selectedTab", "unbindTabData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, DivAction> {

    @NotNull
    private final DivTabsActiveStateTracker activeStateTracker;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private List<String> childIds;

    @NotNull
    private final Map<String, DivStatePath> childStates;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivTabsEventManager divTabsEventManager;
    private final boolean isDynamicHeight;

    @NotNull
    private final PagerController pager;

    @NotNull
    private DivStatePath path;

    @NotNull
    private final Map<ViewGroup, TabModel> tabModels;

    @NotNull
    private final View view;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final List applyPatch$lambda$4(List list) {
        return list;
    }

    /* renamed from: isDynamicHeight, reason: from getter */
    public final boolean getIsDynamicHeight() {
        return this.isDynamicHeight;
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final void setBindingContext(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    @NotNull
    public final DivTabsEventManager getDivTabsEventManager() {
        return this.divTabsEventManager;
    }

    @NotNull
    public final DivTabsActiveStateTracker getActiveStateTracker() {
        return this.activeStateTracker;
    }

    public DivTabsAdapter(@NotNull ViewPool viewPool, @NotNull View view, @NotNull BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, @NotNull HeightCalculatorFactory heightCalculatorFactory, boolean z, @NotNull BindingContext bindingContext, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivViewCreator divViewCreator, @NotNull DivBinder divBinder, @NotNull DivTabsEventManager divTabsEventManager, @NotNull DivTabsActiveStateTracker divTabsActiveStateTracker, @NotNull DivStatePath divStatePath, @NotNull DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, tabTextStyleProvider, divTabsEventManager, divTabsEventManager, divTabsActiveStateTracker);
        this.view = view;
        this.isDynamicHeight = z;
        this.bindingContext = bindingContext;
        this.viewCreator = divViewCreator;
        this.divBinder = divBinder;
        this.divTabsEventManager = divTabsEventManager;
        this.activeStateTracker = divTabsActiveStateTracker;
        this.path = divStatePath;
        this.divPatchCache = divPatchCache;
        this.tabModels = new LinkedHashMap();
        this.childStates = new LinkedHashMap();
        this.childIds = CollectionsKt.emptyList();
        this.pager = new PagerController(this.mPager);
    }

    @NotNull
    /* renamed from: getStatePath, reason: from getter */
    public final DivStatePath getPath() {
        return this.path;
    }

    public final void setStatePath(@NotNull DivStatePath divStatePath) {
        this.path = divStatePath;
        this.childStates.clear();
    }

    public final void setData(@NotNull BaseDivTabbedCardUi.Input<DivSimpleTab> data, int selectedTab) {
        this.childIds = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, data.getTabs(), new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsAdapter$setData$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Div invoke(DivSimpleTab divSimpleTab) {
                return divSimpleTab.getItem().div;
            }
        }, null, 2, null);
        super.setData(data, this.bindingContext.getExpressionResolver(), ReleasablesKt.getExpressionSubscriber(this.view));
        this.tabModels.clear();
        this.mPager.setCurrentItem(selectedTab, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    @NotNull
    public ViewGroup bindTabData(@NotNull ViewGroup tabView, @NotNull DivSimpleTab tab, int tabNumber) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
        Div div = tab.getItem().div;
        View createItemView = createItemView(div, this.bindingContext.getExpressionResolver(), tabNumber);
        this.tabModels.put(tabView, new TabModel(tabNumber, div, createItemView));
        tabView.addView(createItemView);
        return tabView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void unbindTabData(@NotNull ViewGroup tabView) {
        this.tabModels.remove(tabView);
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void fillMeasuringTab(@NotNull ViewGroup tabView, @NotNull DivSimpleTab tab, int tabNumber) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
        tabView.addView(createItemView(tab.getItem().div, this.bindingContext.getExpressionResolver(), tabNumber));
    }

    private final View createItemView(Div div, ExpressionResolver resolver, int tabNumber) {
        View create = this.viewCreator.create(div, resolver);
        create.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.divBinder.bind(this.bindingContext, create, div, getChildPath(tabNumber));
        return create;
    }

    private final DivStatePath getChildPath(int index) {
        Map<String, DivStatePath> map = this.childStates;
        String str = this.childIds.get(index);
        DivStatePath divStatePath = map.get(str);
        if (divStatePath == null) {
            divStatePath = this.path.appendDiv(this.childIds.get(index));
            map.put(str, divStatePath);
        }
        return divStatePath;
    }

    public final void notifyStateChanged() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.tabModels.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.divBinder.bind(this.bindingContext, value.getView(), value.getDiv(), getChildPath(value.getIndex()));
            key.requestLayout();
        }
    }

    @Nullable
    public final Div.Tabs applyPatch(@NotNull ExpressionResolver resolver, @NotNull Div.Tabs div) {
        DivPatchMap patch = this.divPatchCache.getPatch(this.bindingContext.getDivView().getDataTag());
        if (patch == null) {
            return null;
        }
        Div div2 = new DivPatchApply(patch).applyPatchForDiv(div, resolver).get(0);
        Intrinsics.checkNotNull(div2, "null cannot be cast to non-null type com.yandex.div2.Div.Tabs");
        Div.Tabs tabs = (Div.Tabs) div2;
        DisplayMetrics displayMetrics = this.bindingContext.getDivView().getResources().getDisplayMetrics();
        List list = tabs.getValue().items;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.Item) it.next(), displayMetrics, resolver));
        }
        setData(new BaseDivTabbedCardUi.Input() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsAdapter$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                List applyPatch$lambda$4;
                applyPatch$lambda$4 = DivTabsAdapter.applyPatch$lambda$4(arrayList);
                return applyPatch$lambda$4;
            }
        }, this.mPager.getCurrentItem());
        return tabs;
    }

    @NotNull
    public final PagerController getPager() {
        return this.pager;
    }
}
