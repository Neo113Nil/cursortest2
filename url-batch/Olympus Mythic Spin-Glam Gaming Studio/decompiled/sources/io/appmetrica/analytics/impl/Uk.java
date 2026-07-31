package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public final class Uk {
    public final C5532n5 a;
    public final C5574ol b;
    public final Xk c;
    public long d;
    public long e;
    public long f;
    public AtomicLong g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public final SystemTimeProvider l;

    public Uk(C5532n5 c5532n5, C5574ol c5574ol, Xk xk, SystemTimeProvider systemTimeProvider) {
        this.a = c5532n5;
        this.b = c5574ol;
        this.c = xk;
        this.l = systemTimeProvider;
        a();
    }

    public final void a() {
        Xk xk = this.c;
        long elapsedRealtime = this.l.elapsedRealtime();
        Long l = xk.c;
        if (l != null) {
            elapsedRealtime = l.longValue();
        }
        this.e = elapsedRealtime;
        Xk xk2 = this.c;
        long currentTimeMillis = this.l.currentTimeMillis();
        Long l2 = xk2.d;
        if (l2 != null) {
            currentTimeMillis = l2.longValue();
        }
        this.f = currentTimeMillis;
        Long l3 = this.c.b;
        this.d = l3 == null ? -1L : l3.longValue();
        Long l4 = this.c.f;
        this.g = new AtomicLong(l4 == null ? 0L : l4.longValue());
        Boolean bool = this.c.g;
        this.h = bool == null ? true : bool.booleanValue();
        Long l5 = this.c.h;
        long longValue = l5 != null ? l5.longValue() : 0L;
        this.i = longValue;
        Xk xk3 = this.c;
        long j = longValue - this.e;
        Long l6 = xk3.i;
        if (l6 != null) {
            j = l6.longValue();
        }
        this.j = j;
        Boolean bool2 = this.c.j;
        this.k = bool2 == null ? false : bool2.booleanValue();
    }

    public final synchronized void b() {
        this.k = true;
        C5574ol c5574ol = this.b;
        c5574ol.a(C5574ol.k, Boolean.TRUE);
        c5574ol.a();
    }

    public final String toString() {
        return "Session{id=" + this.d + ", creationTime=" + this.e + ", sessionCreationCurrentTimeMillis=" + this.f + ", currentReportId=" + this.g + ", sessionRequestParams=null, sleepStart=" + this.i + ", aliveNeeded=" + this.h + ", crashedSession=" + this.k + '}';
    }
}
