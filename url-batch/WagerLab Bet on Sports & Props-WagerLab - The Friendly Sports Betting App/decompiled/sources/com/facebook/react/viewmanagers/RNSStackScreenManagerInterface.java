package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface RNSStackScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setMaxLifecycleState(T t, int i);

    void setScreenKey(T t, String str);
}
