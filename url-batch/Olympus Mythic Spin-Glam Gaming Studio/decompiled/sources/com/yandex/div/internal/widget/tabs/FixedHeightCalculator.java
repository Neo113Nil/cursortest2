package com.yandex.div.internal.widget.tabs;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes11.dex */
public class FixedHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    @Dimension
    private final int mTabHeight;

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void restoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void saveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i, float f) {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i, float f) {
        return false;
    }

    public FixedHeightCalculator(@Dimension int i) {
        this.mTabHeight = i;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i, int i2) {
        return this.mTabHeight;
    }
}
