package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.R;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabMeasurement;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

@MainThread
/* loaded from: classes5.dex */
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {
    private static final String KEY_FONT_SCALE = "FONT_SCALE";
    private static final String TAG = "[Y:BaseCardHeightCalculator]";

    @NonNull
    private final ViewGroup mChannelGroup;

    @NonNull
    private final HeightCalculatorFactory.GetTabCountFn mGetTabCountFn;

    @NonNull
    private final HeightCalculatorFactory.MeasureTabHeightFn mMeasureTabHeightFn;

    @Nullable
    private Bundle mPendingState;

    @NonNull
    protected final SparseArray<TabMeasurement> mTabsHeightCache = new SparseArray<>();
    private int mPosition = 0;
    private float mPositionOffset = 0.0f;

    protected abstract int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i, float f);

    protected BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.mChannelGroup = viewGroup;
        this.mMeasureTabHeightFn = measureTabHeightFn;
        this.mGetTabCountFn = getTabCountFn;
    }

    private float getFontScale() {
        return this.mChannelGroup.getContext().getResources().getConfiguration().fontScale;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    @CallSuper
    public void saveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        Bundle bundle = new Bundle();
        int size = this.mTabsHeightCache.size();
        for (int i = 0; i < size; i++) {
            this.mTabsHeightCache.valueAt(i).saveState(bundle, this.mTabsHeightCache.keyAt(i));
        }
        bundle.putFloat(KEY_FONT_SCALE, getFontScale());
        sparseArray.put(R.id.tab_height_cache, bundle);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    @CallSuper
    public void restoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.mTabsHeightCache.clear();
        Bundle bundle = (Bundle) sparseArray.get(R.id.tab_height_cache);
        this.mPendingState = bundle;
        Float valueOf = bundle == null ? null : Float.valueOf(bundle.getFloat(KEY_FONT_SCALE));
        if (valueOf == null || valueOf.floatValue() == getFontScale()) {
            return;
        }
        this.mPendingState = null;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i, final int i2) {
        TabMeasurement tabMeasurement = this.mTabsHeightCache.get(i);
        if (tabMeasurement == null) {
            int apply = this.mGetTabCountFn.apply();
            if (apply == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i);
            TabMeasurement tabMeasurement2 = new TabMeasurement(apply, new TabMeasurement.TabMeasurementFunction() { // from class: com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator$$ExternalSyntheticLambda0
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.TabMeasurementFunction
                public final int getTabHeight(int i3) {
                    int lambda$measureHeight$0;
                    lambda$measureHeight$0 = BaseCardHeightCalculator.this.lambda$measureHeight$0(size, i2, i3);
                    return lambda$measureHeight$0;
                }
            });
            Bundle bundle = this.mPendingState;
            if (bundle != null) {
                tabMeasurement2.restoreState(bundle, i);
                tabMeasurement2.removeState(this.mPendingState, i);
                if (this.mPendingState.isEmpty()) {
                    this.mPendingState = null;
                }
            }
            this.mTabsHeightCache.put(i, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return logAndReturnHeight(getOptimalHeight(tabMeasurement, this.mPosition, this.mPositionOffset), this.mPosition, this.mPositionOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$measureHeight$0(int i, int i2, int i3) {
        return this.mMeasureTabHeightFn.apply(this.mChannelGroup, i, i2, i3);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i, float f) {
        Log.d(TAG, "request layout for tab " + i + " with position offset " + f);
        this.mPosition = i;
        this.mPositionOffset = f;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
        Log.d(TAG, "reseting layout...");
        this.mPendingState = null;
        this.mTabsHeightCache.clear();
    }

    protected boolean isTabsHeightsIsUnknown() {
        return this.mTabsHeightCache.size() == 0;
    }

    private static int logAndReturnHeight(int i, int i2, float f) {
        Log.d(TAG, "New optimal height for tab " + i2 + " with position offset " + f + " is " + i);
        return i;
    }
}
