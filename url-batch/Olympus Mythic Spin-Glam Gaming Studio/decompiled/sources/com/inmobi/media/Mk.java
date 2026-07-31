package com.inmobi.media;

import java.util.TimerTask;

/* loaded from: classes11.dex */
public final class Mk extends TimerTask {
    public final /* synthetic */ Nk a;
    public final /* synthetic */ byte b;

    public Mk(Nk nk, byte b) {
        this.a = nk;
        this.b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
