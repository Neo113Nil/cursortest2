package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5501m0 {
    public final HashMap a = new HashMap();

    public final synchronized C5475l0 a(C5351g5 c5351g5, PublicLogger publicLogger, C5621qf c5621qf) {
        C5475l0 c5475l0;
        c5475l0 = (C5475l0) this.a.get(c5351g5.toString());
        if (c5475l0 == null) {
            C5449k0 d = c5621qf.d();
            c5475l0 = new C5475l0(d.a, d.b, new Ll(publicLogger, "[App Environment]"));
            this.a.put(c5351g5.toString(), c5475l0);
        }
        return c5475l0;
    }

    public final synchronized void a(C5449k0 c5449k0, C5621qf c5621qf) {
        c5621qf.a(c5449k0);
    }
}
