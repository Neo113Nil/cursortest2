package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5596ph extends AbstractC5208ah {
    public C5596ph(@NotNull C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NotNull C5326f6 c5326f6) {
        Uk uk;
        C5548nl c5548nl;
        boolean z;
        boolean z2;
        E9 e9 = this.a.n;
        C5470kl c5470kl = e9.c;
        if (c5470kl.g == 0) {
            uk = c5470kl.c.a();
            Uk a = c5470kl.d.a();
            if ((uk == null ? -1L : uk.d) <= (a != null ? a.d : -1L)) {
                uk = a;
            }
        } else {
            uk = c5470kl.f;
        }
        if (uk != null) {
            synchronized (uk) {
                z2 = uk.k;
            }
            if (z2) {
                C5496ll a2 = c5470kl.a.e.a(uk.d, uk.c.a);
                long j = c5326f6.i;
                long j2 = c5326f6.j;
                c5470kl.g = 2;
                Uk a3 = c5470kl.e.a(new Vk(j, j2, a2));
                c5470kl.f = a3;
                c5470kl.a(a3.d);
                c5548nl = C5470kl.a(c5470kl.f, j);
            } else {
                c5548nl = new C5548nl();
                c5548nl.a = uk.d;
                long andIncrement = uk.g.getAndIncrement();
                C5574ol c5574ol = uk.b;
                c5574ol.a(C5574ol.g, Long.valueOf(uk.g.get()));
                c5574ol.a();
                c5548nl.b = andIncrement;
                long j3 = c5326f6.j;
                long j4 = c5326f6.i;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long seconds = timeUnit.toSeconds(j3 - uk.f);
                C5574ol c5574ol2 = uk.b;
                long j5 = j4 - uk.e;
                uk.j = j5;
                c5574ol2.a(C5574ol.e, Long.valueOf(j5));
                c5574ol2.a();
                c5548nl.c = Math.max(seconds, timeUnit.toSeconds(uk.j));
                c5548nl.d = uk.c.a;
            }
        } else {
            c5548nl = null;
        }
        if (c5548nl != null) {
            e9.a(c5326f6, c5548nl);
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
