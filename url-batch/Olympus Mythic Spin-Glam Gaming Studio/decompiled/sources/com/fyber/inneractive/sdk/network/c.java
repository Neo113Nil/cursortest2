package com.fyber.inneractive.sdk.network;

/* loaded from: classes11.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f c;

    public c(f fVar, int i, long j) {
        this.c = fVar;
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d.sendEmptyMessageDelayed(this.a, this.b);
    }
}
