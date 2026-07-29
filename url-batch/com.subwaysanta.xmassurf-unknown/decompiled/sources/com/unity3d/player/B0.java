package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class B0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public B0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.invokeOnMainThread((Runnable) new C0149o0(this, windowInsets));
        return windowInsets;
    }
}
