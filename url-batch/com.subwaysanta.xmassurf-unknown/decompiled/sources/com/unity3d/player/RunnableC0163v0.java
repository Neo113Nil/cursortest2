package com.unity3d.player;

/* renamed from: com.unity3d.player.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0163v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    public RunnableC0163v0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, int i2) {
        this.c = unityPlayerForActivityOrService;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        rVar = this.c.mSoftInput;
        if (rVar != null) {
            rVar.setSelection(this.a, this.b);
        }
    }
}
