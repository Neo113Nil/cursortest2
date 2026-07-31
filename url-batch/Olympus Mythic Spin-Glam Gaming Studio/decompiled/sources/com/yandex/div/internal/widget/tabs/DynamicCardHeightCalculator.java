package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

@MainThread
/* loaded from: classes10.dex */
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i, float f) {
        return true;
    }

    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i, int i2) {
        dropMeasureCache();
        return super.measureHeight(i, i2);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    protected int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i, float f) {
        if (f < 0.01f) {
            return tabMeasurement.getTabHeight(i);
        }
        return Math.round(tabMeasurement.getTabHeight(i) + ((tabMeasurement.getTabHeight(i + 1) - r0) * f));
    }
}
