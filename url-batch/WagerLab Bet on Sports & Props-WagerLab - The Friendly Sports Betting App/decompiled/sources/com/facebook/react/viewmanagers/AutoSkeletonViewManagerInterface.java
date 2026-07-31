package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface AutoSkeletonViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimationType(T t, String str);

    void setDefaultRadius(T t, float f);

    void setGradientColors(T t, ReadableArray readableArray);

    void setIsLoading(T t, boolean z);

    void setShimmerBackgroundColor(T t, Integer num);

    void setShimmerSpeed(T t, float f);
}
