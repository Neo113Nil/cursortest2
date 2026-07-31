package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5470kl {
    public final C5532n5 a;
    public final C5506m5 b;
    public final InterfaceC5590pb c;
    public final InterfaceC5590pb d;
    public final InterfaceC5590pb e;
    public Uk f;
    public int g = 0;
    public Long h = null;

    public C5470kl(C5532n5 c5532n5, C5506m5 c5506m5, Ea ea, M2 m2, C5418il c5418il) {
        this.a = c5532n5;
        this.b = c5506m5;
        this.c = ea;
        this.d = m2;
        this.e = c5418il;
    }

    public final synchronized long a() {
        Long l;
        l = this.h;
        return l != null ? l.longValue() : 10000000000L;
    }

    public final synchronized Uk b(C5326f6 c5326f6) {
        try {
            d(c5326f6);
            if (this.g != 1 && !a(this.f, c5326f6)) {
                this.g = 1;
                this.f = null;
            }
            int a = AbstractC5251c8.a(this.g);
            if (a == 1) {
                Uk uk = this.f;
                long j = c5326f6.i;
                uk.i = j;
                C5574ol c5574ol = uk.b;
                c5574ol.a(C5574ol.d, Long.valueOf(j));
                c5574ol.a();
                return this.f;
            }
            if (a == 2) {
                return this.f;
            }
            this.a.m.info("Start background session", new Object[0]);
            this.g = 2;
            long j2 = c5326f6.i;
            Uk a2 = this.d.a(new Vk(j2, c5326f6.j, null));
            a(a2.d);
            if (this.a.t.c()) {
                C5506m5 c5506m5 = this.b;
                c5506m5.a.n.a(C5326f6.a(c5326f6, Ka.I.i()), a(a2, c5326f6.i));
            } else {
                int i = c5326f6.d;
                EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    C5506m5 c5506m52 = this.b;
                    c5506m52.a.n.a(c5326f6, a(a2, j2));
                    C5506m5 c5506m53 = this.b;
                    c5506m53.a.n.a(C5326f6.a(c5326f6, Ka.I.i()), a(a2, j2));
                }
            }
            this.f = a2;
            return a2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(C5326f6 c5326f6) {
        try {
            d(c5326f6);
            int a = AbstractC5251c8.a(this.g);
            if (a == 0) {
                this.f = a(c5326f6);
            } else if (a == 1) {
                b(this.f, c5326f6);
                this.f = a(c5326f6);
            } else if (a == 2) {
                if (a(this.f, c5326f6)) {
                    Uk uk = this.f;
                    long j = c5326f6.i;
                    uk.i = j;
                    C5574ol c5574ol = uk.b;
                    c5574ol.a(C5574ol.d, Long.valueOf(j));
                    c5574ol.a();
                } else {
                    this.f = a(c5326f6);
                }
            }
        } finally {
        }
    }

    public final void d(C5326f6 c5326f6) {
        if (this.g == 0) {
            Uk a = this.c.a();
            if (a != null) {
                a(a.d);
            }
            if (a(a, c5326f6)) {
                this.f = a;
                this.g = 3;
                return;
            }
            Uk a2 = this.d.a();
            if (a2 != null) {
                a(a2.d);
            }
            if (a(a2, c5326f6)) {
                this.f = a2;
                this.g = 2;
            } else {
                this.f = null;
                this.g = 1;
            }
        }
    }

    public final void a(long j) {
        Long l = this.h;
        if (l == null || j < l.longValue()) {
            this.h = Long.valueOf(j);
        }
    }

    public final Uk a(C5326f6 c5326f6) {
        this.a.m.info("Start foreground session", new Object[0]);
        long j = c5326f6.i;
        Uk a = this.c.a(new Vk(j, c5326f6.j, null));
        a(a.d);
        this.g = 3;
        ((A5) this.a.p).e();
        C5506m5 c5506m5 = this.b;
        c5506m5.a.n.a(C5326f6.a(c5326f6, Ka.I.i()), a(a, j));
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Uk uk, C5326f6 c5326f6) {
        boolean z;
        boolean z2;
        boolean z3;
        if (uk == null) {
            return false;
        }
        long j = c5326f6.i;
        long j2 = uk.d;
        boolean z4 = j2 >= 0;
        C5496ll a = uk.a.e.a(j2, uk.c.a);
        if (a != null) {
            C5804xh c5804xh = (C5804xh) uk.a.k.a();
            List listOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(Intrinsics.areEqual(c5804xh.getAnalyticsSdkVersionName(), a.n)), Boolean.valueOf(Intrinsics.areEqual(c5804xh.getAnalyticsSdkBuildNumber(), a.o)), Boolean.valueOf(Intrinsics.areEqual(c5804xh.getAppVersion(), a.d)), Boolean.valueOf(Intrinsics.areEqual(c5804xh.getAppBuildNumber(), a.e)), Boolean.valueOf(Intrinsics.areEqual(c5804xh.getOsVersion(), a.g)), Boolean.valueOf(a.h == c5804xh.getOsApiLevel()), Boolean.valueOf(a.m == c5804xh.r)});
            if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                Iterator it = listOf.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = uk.l.elapsedRealtime();
            long j3 = uk.i;
            z2 = elapsedRealtime >= j3;
            long j4 = j - j3;
            long j5 = j - uk.e;
            if (!z2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Xk xk = uk.c;
                int i = ((C5804xh) uk.a.k.a()).f;
                Integer num = xk.e;
                if (num != null) {
                    i = num.intValue();
                }
                if (j4 < timeUnit.toMillis(i) && j5 < timeUnit.toMillis(Yk.a)) {
                    z3 = false;
                    if (!z4 && z && !z3 && !uk.k) {
                        return true;
                    }
                    b(uk, c5326f6);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(uk, c5326f6);
            return false;
        }
        z = false;
        long elapsedRealtime2 = uk.l.elapsedRealtime();
        long j32 = uk.i;
        if (elapsedRealtime2 >= j32) {
        }
        long j42 = j - j32;
        long j52 = j - uk.e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(uk, c5326f6);
        return false;
    }

    public final void b(Uk uk, C5326f6 c5326f6) {
        if (uk.h && uk.d > 0) {
            C5506m5 c5506m5 = this.b;
            C5326f6 a = C5326f6.a(c5326f6, EnumC5798xb.EVENT_TYPE_ALIVE);
            C5548nl c5548nl = new C5548nl();
            c5548nl.a = uk.d;
            c5548nl.d = uk.c.a;
            long andIncrement = uk.g.getAndIncrement();
            C5574ol c5574ol = uk.b;
            c5574ol.a(C5574ol.g, Long.valueOf(uk.g.get()));
            c5574ol.a();
            c5548nl.b = andIncrement;
            c5548nl.c = TimeUnit.MILLISECONDS.toSeconds(Math.max(uk.i - uk.e, uk.j));
            c5506m5.a.n.a(a, c5548nl);
            if (uk.h) {
                uk.h = false;
                C5574ol c5574ol2 = uk.b;
                c5574ol2.a(C5574ol.j, Boolean.FALSE);
                c5574ol2.a();
            }
        }
        PublicLogger publicLogger = this.a.m;
        int ordinal = uk.c.a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (uk) {
            C5574ol c5574ol3 = uk.b;
            c5574ol3.getClass();
            c5574ol3.c = new Bb();
            c5574ol3.a();
        }
    }

    public static C5548nl a(Uk uk, long j) {
        C5548nl c5548nl = new C5548nl();
        c5548nl.a = uk.d;
        long andIncrement = uk.g.getAndIncrement();
        C5574ol c5574ol = uk.b;
        c5574ol.a(C5574ol.g, Long.valueOf(uk.g.get()));
        c5574ol.a();
        c5548nl.b = andIncrement;
        C5574ol c5574ol2 = uk.b;
        long j2 = j - uk.e;
        uk.j = j2;
        c5574ol2.a(C5574ol.e, Long.valueOf(j2));
        c5574ol2.a();
        c5548nl.c = TimeUnit.MILLISECONDS.toSeconds(uk.j);
        c5548nl.d = uk.c.a;
        return c5548nl;
    }
}
