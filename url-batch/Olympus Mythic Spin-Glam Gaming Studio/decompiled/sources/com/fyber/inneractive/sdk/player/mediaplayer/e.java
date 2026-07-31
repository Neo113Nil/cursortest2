package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* loaded from: classes15.dex */
public final class e implements Runnable {
    public final /* synthetic */ SurfaceHolder a;
    public final /* synthetic */ p b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.b = pVar;
        this.a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.b, this.a);
    }
}
