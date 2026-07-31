package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes8.dex */
public final class Q0 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C5736v1 b;

    public Q0(C5736v1 c5736v1, Intent intent) {
        this.b = c5736v1;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q7 q7 = this.b.c().b;
        Intent intent = this.a;
        q7.getClass();
        if (intent != null) {
            q7.a(intent.getDataString(), false);
        }
    }
}
