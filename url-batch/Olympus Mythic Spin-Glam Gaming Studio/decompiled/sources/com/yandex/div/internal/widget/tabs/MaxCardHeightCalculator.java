package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

@MainThread
/* loaded from: classes15.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i, float f) {
        if (isTabsHeightsIsUnknown()) {
            return true;
        }
        return (i == 0 || (i == 1 && f <= 0.0f)) && firstTabDiffers();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    protected int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i, float f) {
        if (i > 0) {
            return tabMeasurement.getMaxTabHeight();
        }
        if (f < 0.01f) {
            return tabMeasurement.getFirstTabHeight();
        }
        return Math.round(tabMeasurement.getFirstTabHeight() + ((tabMeasurement.getMaxTabHeight() - r3) * f));
    }

    private boolean firstTabDiffers() {
        Assert.assertTrue(this.mTabsHeightCache.size() > 0);
        SparseArray<TabMeasurement> sparseArray = this.mTabsHeightCache;
        TabMeasurement valueAt = sparseArray.valueAt(sparseArray.size() - 1);
        return valueAt.getFirstTabHeight() != valueAt.getMaxTabHeight();
    }
}
