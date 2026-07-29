package com.unity3d.player;

/* loaded from: classes.dex */
public final class I0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public I0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.nativeResume();
    }
}
