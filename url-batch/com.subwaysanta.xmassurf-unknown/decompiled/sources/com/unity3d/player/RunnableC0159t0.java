package com.unity3d.player;

/* renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0159t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0159t0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i) {
        this.b = unityPlayerForActivityOrService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        rVar = this.b.mSoftInput;
        if (rVar != null) {
            rVar.setCharacterLimit(this.a);
        }
    }
}
