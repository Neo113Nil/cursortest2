package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5857zi implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Bi b;

    public RunnableC5857zi(Bi bi, Context context) {
        this.b = bi;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.b.b;
        Context context = this.a;
        b0.getClass();
        A0.a(context);
    }
}
