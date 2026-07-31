package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes9.dex */
public interface HeightCalculatorFactory {

    public interface GetTabCountFn {
        int apply();
    }

    public interface MeasureTabHeightFn {
        int apply(@NonNull ViewGroup viewGroup, int i, int i2, int i3);
    }

    ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull MeasureTabHeightFn measureTabHeightFn, @NonNull GetTabCountFn getTabCountFn);
}
