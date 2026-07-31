package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface LottieAnimationViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void pause(T t);

    void play(T t, int i, int i2);

    void reset(T t);

    void resume(T t);

    void setAutoPlay(T t, boolean z);

    void setCacheComposition(T t, boolean z);

    void setColorFilters(T t, ReadableArray readableArray);

    void setDummy(T t, ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(T t, boolean z);

    void setEnableSafeModeAndroid(T t, boolean z);

    void setHardwareAccelerationAndroid(T t, boolean z);

    void setImageAssetsFolder(T t, String str);

    void setLoop(T t, boolean z);

    void setProgress(T t, float f);

    void setRenderMode(T t, String str);

    void setResizeMode(T t, String str);

    void setSourceDotLottieURI(T t, String str);

    void setSourceJson(T t, String str);

    void setSourceName(T t, String str);

    void setSourceURL(T t, String str);

    void setSpeed(T t, double d);

    void setTextFiltersAndroid(T t, ReadableArray readableArray);

    void setTextFiltersIOS(T t, ReadableArray readableArray);
}
