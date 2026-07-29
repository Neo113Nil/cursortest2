package com.unity3d.player;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class E0 implements Runnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public E0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Configuration configuration) {
        this.b = unityPlayerForActivityOrService;
        this.a = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.nativeConfigurationChanged(this.a);
    }
}
