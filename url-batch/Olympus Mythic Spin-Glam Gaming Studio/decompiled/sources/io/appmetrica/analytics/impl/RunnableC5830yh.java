package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5830yh implements Runnable {
    public final Context a;
    public final C5326f6 b;
    public final Bundle c;
    public final C5635r4 d;

    public RunnableC5830yh(Context context, C5326f6 c5326f6, Bundle bundle, C5635r4 c5635r4) {
        this.a = context;
        this.b = c5326f6;
        this.c = bundle;
        this.d = c5635r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Y3 a = Y3.a(this.a, this.c);
            if (a == null) {
                return;
            }
            C5350g4 a2 = C5350g4.a(a);
            C5728uj v = Ka.I.v();
            v.a(a.b.getAppVersion(), a.b.getAppBuildNumber());
            v.a(a.b.getDeviceType());
            G4 g4 = new G4(new C5628qm(a), new F4(a.b, Cb.c(a.a.a.getAsString("PROCESS_CFG_CLIDS"))), a.a.b);
            this.d.a(a2, g4).a(this.b, g4);
        } catch (Throwable th) {
            C5340fk c5340fk = Dj.a;
            String str = "Exception during processing event with type: " + this.b.d + " (" + this.b.e + "): " + th.getMessage();
            c5340fk.getClass();
            c5340fk.a(new Ej(str, th));
        }
    }
}
