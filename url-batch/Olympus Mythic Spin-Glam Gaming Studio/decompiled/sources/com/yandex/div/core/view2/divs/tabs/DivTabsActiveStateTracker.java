package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.ironsource.X3;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTabsActiveStateTracker.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$ActiveTabClickListener;", "Lcom/yandex/div2/DivAction;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "div2Logger", "Lcom/yandex/div/core/Div2Logger;", "tabsStateCache", "Lcom/yandex/div/core/state/TabsStateCache;", "runtimeVisitor", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "div", "Lcom/yandex/div2/DivTabs;", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/state/TabsStateCache;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;Lcom/yandex/div2/DivTabs;)V", "getDiv", "()Lcom/yandex/div2/DivTabs;", "setDiv", "(Lcom/yandex/div2/DivTabs;)V", "onActiveTabClicked", "", "action", "tabPosition", "", "onPageScrollStateChanged", "state", "onPageScrolled", X3.i.L, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivTabsActiveStateTracker implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {

    @NotNull
    private final BindingContext context;

    @NotNull
    private DivTabs div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull DivAction action, int tabPosition) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    public DivTabsActiveStateTracker(@NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @NotNull Div2Logger div2Logger, @NotNull TabsStateCache tabsStateCache, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull DivTabs divTabs) {
        this.context = bindingContext;
        this.path = divStatePath;
        this.div2Logger = div2Logger;
        this.tabsStateCache = tabsStateCache;
        this.runtimeVisitor = divRuntimeVisitor;
        this.div = divTabs;
    }

    @NotNull
    public final DivTabs getDiv() {
        return this.div;
    }

    public final void setDiv(@NotNull DivTabs divTabs) {
        this.div = divTabs;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), position);
        this.tabsStateCache.putSelectedTab(this.context.getDivView().getDataTag().getId(), this.path.getFullPath$div_release(), position);
        this.runtimeVisitor.createAndAttachRuntimesToTabs(this.context.getDivView(), this.div, this.path, this.context.getExpressionResolver());
    }
}
