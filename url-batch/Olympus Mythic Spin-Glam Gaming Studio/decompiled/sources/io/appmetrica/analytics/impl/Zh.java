package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Zh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5701ti b;

    public Zh(C5701ti c5701ti, String str) {
        this.b = c5701ti;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).setUserProfileID(this.a);
    }
}
