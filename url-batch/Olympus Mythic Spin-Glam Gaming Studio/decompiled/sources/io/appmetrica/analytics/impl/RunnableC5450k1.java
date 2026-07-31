package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5450k1 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ StartupParamsCallback b;
    public final /* synthetic */ List c;
    public final /* synthetic */ C5736v1 d;

    public RunnableC5450k1(C5736v1 c5736v1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.d = c5736v1;
        this.a = context;
        this.b = startupParamsCallback;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.d.a;
        Context applicationContext = this.a.getApplicationContext();
        b0.getClass();
        A0 a = A0.a(applicationContext);
        a.f().a(this.b, this.c);
    }
}
