package com.unity3d.player;

import android.view.Surface;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class G0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Surface b;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, Surface surface, Semaphore semaphore) {
        this.d = unityPlayerForActivityOrService;
        this.a = i;
        this.b = surface;
        this.c = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.nativeRecreateGfxState(this.a, this.b);
        this.c.release();
    }
}
