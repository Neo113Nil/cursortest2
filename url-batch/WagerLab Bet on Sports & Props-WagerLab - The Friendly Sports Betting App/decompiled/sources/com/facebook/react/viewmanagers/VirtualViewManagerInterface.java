package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface VirtualViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialHidden(T t, boolean z);

    void setRenderState(T t, int i);
}
