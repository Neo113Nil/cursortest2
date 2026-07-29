package com.unity3d.player.a;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class I implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ com.unity3d.player.C a;

    public I(com.unity3d.player.C c) {
        this.a = c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }
}
