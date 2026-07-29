package com.unity3d.player;

/* loaded from: classes.dex */
public final class F implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityAccessibilityDelegate c;

    public F(UnityAccessibilityDelegate unityAccessibilityDelegate, int i, int i2) {
        this.c = unityAccessibilityDelegate;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.sendEventForVirtualViewId(this.a, this.b);
    }
}
