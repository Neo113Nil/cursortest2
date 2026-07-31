package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5454k5 extends AbstractC5428j5 {
    public C5454k5(@NotNull C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5428j5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5428j5
    public final void c() {
        C5621qf c5621qf = this.a.c;
        try {
            C5574ol c5574ol = new C5574ol(c5621qf, M2.g);
            Long b = c5574ol.c.b(C5574ol.d);
            if (b != null) {
                c5574ol.a(C5574ol.d, Long.valueOf(TimeUnit.SECONDS.toMillis(b.longValue())));
            }
            Long b2 = c5574ol.c.b(C5574ol.e);
            if (b2 != null) {
                c5574ol.a(C5574ol.e, Long.valueOf(TimeUnit.SECONDS.toMillis(b2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C5574ol c5574ol2 = new C5574ol(c5621qf, "foreground");
            Long b3 = c5574ol2.c.b(C5574ol.d);
            if (b3 != null) {
                c5574ol2.a(C5574ol.d, Long.valueOf(TimeUnit.SECONDS.toMillis(b3.longValue())));
            }
            Long b4 = c5574ol2.c.b(C5574ol.e);
            if (b4 != null) {
                c5574ol2.a(C5574ol.e, Long.valueOf(TimeUnit.SECONDS.toMillis(b4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
