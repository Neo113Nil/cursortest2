package com.five_corp.ad.internal;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.ad.FiveAdErrorCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q {
    public final r b;
    public final t c;
    public final com.five_corp.ad.internal.soundstate.c d;
    public final com.five_corp.ad.internal.time.a e;
    public final com.five_corp.ad.internal.context.h f;
    public final com.five_corp.ad.internal.hub.global.b h;
    public final HashSet g = new HashSet();
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public final Handler a = new Handler(Looper.getMainLooper());
    public int i = 1;

    public q(r rVar, t tVar, com.five_corp.ad.internal.soundstate.c cVar, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.hub.global.b bVar) {
        this.b = rVar;
        this.c = tVar;
        this.d = cVar;
        this.e = aVar;
        this.f = hVar;
        this.h = bVar;
    }

    public final void a() {
        f fVar;
        if (this.m || (fVar = (f) this.b.c.get()) == null) {
            return;
        }
        fVar.d();
    }

    public final /* synthetic */ void b() {
        a(com.five_corp.ad.internal.ad.beacon.e.CLICK_BEACON);
    }

    public final void c(long j, double d) {
        f fVar;
        a(7, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.PAUSE);
        if (this.m || (fVar = (f) this.b.c.get()) == null) {
            return;
        }
        fVar.c();
    }

    public final void d(long j, double d) {
        a(18, j, d, null, null);
    }

    public final void e(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
        i iVar = (i) this.b.e.get();
        if (iVar != null) {
            iVar.a();
        }
    }

    public final void f(long j, double d) {
        f fVar;
        a(9, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.REWIND);
        if (!this.m && (fVar = (f) this.b.c.get()) != null) {
            fVar.a();
        }
        this.i = 3;
    }

    public final void g(long j, double d) {
        f fVar;
        f fVar2;
        int a = com.five_corp.ad.e.a(this.i);
        if (a != 0) {
            if (a == 1) {
                a(8, j, d, null, null);
                a(com.five_corp.ad.internal.ad.beacon.e.RESUME);
                if (!this.m && (fVar2 = (f) this.b.c.get()) != null) {
                    fVar2.a();
                }
            }
        } else if (!this.m && (fVar = (f) this.b.c.get()) != null) {
            fVar.a();
        }
        this.i = 2;
    }

    public final void h(long j, double d) {
        if (this.m || this.l) {
            return;
        }
        this.l = true;
        a(19, j, d, null, null);
        p pVar = (p) this.b.d.get();
        if (pVar != null) {
            pVar.a();
        }
    }

    public final void i(long j, double d) {
        a(17, j, d, null, null);
    }

    public final void j(long j, double d) {
        f fVar;
        if (!this.j) {
            this.j = true;
            a(2, j, d, null, null);
            a(com.five_corp.ad.internal.ad.beacon.e.VT_100);
        }
        if (this.m || (fVar = (f) this.b.c.get()) == null) {
            return;
        }
        fVar.b();
    }

    public final void k(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(j, d);
            }
        });
    }

    public final void l(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                q.this.b(j, d);
            }
        });
    }

    public final void m(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                q.this.c(j, d);
            }
        });
    }

    public final void n(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                q.this.d(j, d);
            }
        });
    }

    public final void o(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                q.this.e(j, d);
            }
        });
    }

    public final void p(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                q.this.f(j, d);
            }
        });
    }

    public final void q(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                q.this.g(j, d);
            }
        });
    }

    public final void r(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                q.this.h(j, d);
            }
        });
    }

    public final void s(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q.this.i(j, d);
            }
        });
    }

    public final void t(final long j, final double d) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                q.this.j(j, d);
            }
        });
    }

    public final void b(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
    }

    public final void d() {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                q.this.b();
            }
        });
    }

    public final void a(long j, double d) {
        a(6, j, d, null, null);
        a(com.five_corp.ad.internal.ad.beacon.e.CLOSE);
    }

    public final void b(final long j, final double d, final com.five_corp.ad.internal.ad.beacon.a aVar) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(j, d, aVar);
            }
        });
    }

    public final void a(long j, double d, com.five_corp.ad.internal.ad.beacon.a aVar) {
        f fVar;
        com.five_corp.ad.internal.context.h hVar = this.f;
        this.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (hVar) {
            hVar.i = currentTimeMillis;
        }
        a(1, j, d, aVar, null);
        a(com.five_corp.ad.internal.ad.beacon.e.IMPRESSION);
        if (this.m || (fVar = (f) this.b.c.get()) == null) {
            return;
        }
        fVar.e();
    }

    public final void b(final l lVar, final long j) {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(lVar, j);
            }
        });
    }

    public final void c() {
        this.a.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a();
            }
        });
    }

    public final void e() {
        Handler handler = this.a;
        final r rVar = this.b;
        Objects.requireNonNull(rVar);
        handler.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                r.this.a();
            }
        });
    }

    public final void f() {
        Handler handler = this.a;
        final r rVar = this.b;
        Objects.requireNonNull(rVar);
        handler.post(new Runnable() { // from class: com.five_corp.ad.internal.q$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                r.this.c();
            }
        });
    }

    public final void a(l lVar, long j) {
        long j2;
        com.five_corp.ad.internal.hub.global.b bVar = this.h;
        com.five_corp.ad.internal.context.h hVar = this.f;
        com.five_corp.ad.internal.ad.a aVar = hVar.a;
        com.five_corp.ad.internal.context.g gVar = hVar.c.a;
        com.five_corp.ad.internal.soundstate.a a = this.d.a();
        com.five_corp.ad.internal.context.h hVar2 = this.f;
        synchronized (hVar2) {
            j2 = hVar2.i;
        }
        bVar.a(new com.five_corp.ad.internal.beacon.c(aVar, gVar, lVar, a, j, Long.valueOf(j2), this.f.h));
        a(com.five_corp.ad.internal.ad.beacon.e.ERROR);
        if (this.m) {
            return;
        }
        r rVar = this.b;
        FiveAdErrorCode fiveAdErrorCode = lVar.a.b;
        f fVar = (f) rVar.c.get();
        if (fVar != null) {
            fVar.a(fiveAdErrorCode);
        }
        this.m = true;
    }

    public final void a(int i, long j, double d, com.five_corp.ad.internal.ad.beacon.a aVar, HashMap hashMap) {
        com.five_corp.ad.internal.beacon.a aVar2 = new com.five_corp.ad.internal.beacon.a(this.f, i, this.d.a(), j, d);
        aVar2.k = aVar;
        aVar2.l = hashMap;
        this.h.a(aVar2);
    }

    public final void a(com.five_corp.ad.internal.ad.beacon.e eVar) {
        if (eVar.b || this.g.add(eVar)) {
            for (com.five_corp.ad.internal.ad.beacon.d dVar : this.f.a.u) {
                if (dVar.a == eVar) {
                    com.five_corp.ad.internal.hub.global.b bVar = this.h;
                    String str = dVar.b;
                    String str2 = dVar.d;
                    Iterator it = bVar.d.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) ((com.five_corp.ad.internal.hub.global.c) it.next());
                        com.five_corp.ad.internal.bgtask.b bVar2 = vVar.c;
                        com.five_corp.ad.internal.bgtask.k kVar = new com.five_corp.ad.internal.bgtask.k(str, str2, vVar.b);
                        com.five_corp.ad.internal.bgtask.a aVar = bVar2.b;
                        aVar.getClass();
                        aVar.a(new com.five_corp.ad.internal.bgtask.g(kVar, aVar.c));
                        Iterator it2 = bVar2.c.iterator();
                        while (it2.hasNext()) {
                            com.five_corp.ad.internal.bgtask.e eVar2 = (com.five_corp.ad.internal.bgtask.e) it2.next();
                            eVar2.d.post(new com.five_corp.ad.internal.bgtask.c(eVar2));
                        }
                    }
                }
            }
        }
    }
}
