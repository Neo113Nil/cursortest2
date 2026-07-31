package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class F2 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ G2 c;

    public F2(G2 g2, Context context, Intent intent) {
        this.c = g2;
        this.a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.consume(this.a, this.b);
    }
}
