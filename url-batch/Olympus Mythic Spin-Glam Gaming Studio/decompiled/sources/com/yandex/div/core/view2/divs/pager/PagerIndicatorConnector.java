package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div2.DivPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerIndicatorConnector.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "", "()V", "indicators", "", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector$IndicatorData;", "pagers", "", "Lcom/yandex/div2/DivPager;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "attach", "", "attach$div_release", "submitIndicator", "indicatorView", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "pagerDiv", "submitIndicator$div_release", "submitPager", "pagerView", "submitPager$div_release", "IndicatorData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public final class PagerIndicatorConnector {

    @NotNull
    private final Map<DivPager, DivPagerView> pagers = new LinkedHashMap();

    @NotNull
    private final List<IndicatorData> indicators = new ArrayList();

    /* compiled from: PagerIndicatorConnector.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector$IndicatorData;", "", "indicator", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "pagerDiv", "Lcom/yandex/div2/DivPager;", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lcom/yandex/div2/DivPager;)V", "getIndicator", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "getPagerDiv", "()Lcom/yandex/div2/DivPager;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class IndicatorData {

        @NotNull
        private final DivPagerIndicatorView indicator;

        @NotNull
        private final DivPager pagerDiv;

        public static /* synthetic */ IndicatorData copy$default(IndicatorData indicatorData, DivPagerIndicatorView divPagerIndicatorView, DivPager divPager, int i, Object obj) {
            if ((i & 1) != 0) {
                divPagerIndicatorView = indicatorData.indicator;
            }
            if ((i & 2) != 0) {
                divPager = indicatorData.pagerDiv;
            }
            return indicatorData.copy(divPagerIndicatorView, divPager);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DivPager getPagerDiv() {
            return this.pagerDiv;
        }

        @NotNull
        public final IndicatorData copy(@NotNull DivPagerIndicatorView indicator, @NotNull DivPager pagerDiv) {
            return new IndicatorData(indicator, pagerDiv);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndicatorData)) {
                return false;
            }
            IndicatorData indicatorData = (IndicatorData) other;
            return Intrinsics.areEqual(this.indicator, indicatorData.indicator) && Intrinsics.areEqual(this.pagerDiv, indicatorData.pagerDiv);
        }

        public int hashCode() {
            return (this.indicator.hashCode() * 31) + this.pagerDiv.hashCode();
        }

        @NotNull
        public String toString() {
            return "IndicatorData(indicator=" + this.indicator + ", pagerDiv=" + this.pagerDiv + ')';
        }

        public IndicatorData(@NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull DivPager divPager) {
            this.indicator = divPagerIndicatorView;
            this.pagerDiv = divPager;
        }

        @NotNull
        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final DivPager getPagerDiv() {
            return this.pagerDiv;
        }
    }

    public final void submitPager$div_release(@NotNull DivPagerView pagerView, @NotNull DivPager pagerDiv) {
        this.pagers.put(pagerDiv, pagerView);
    }

    public final void submitIndicator$div_release(@NotNull DivPagerIndicatorView indicatorView, @NotNull DivPager pagerDiv) {
        this.indicators.add(new IndicatorData(indicatorView, pagerDiv));
    }

    public final void attach$div_release() {
        Iterator<Map.Entry<DivPager, DivPagerView>> it = this.pagers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clearChangePageCallbackForIndicators();
        }
        for (IndicatorData indicatorData : this.indicators) {
            DivPagerView divPagerView = this.pagers.get(indicatorData.getPagerDiv());
            if (divPagerView != null) {
                indicatorData.getIndicator().attachPager(divPagerView);
            }
        }
        this.pagers.clear();
        this.indicators.clear();
    }
}
