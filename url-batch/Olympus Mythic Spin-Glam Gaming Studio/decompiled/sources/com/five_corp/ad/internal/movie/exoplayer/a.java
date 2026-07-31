package com.five_corp.ad.internal.movie.exoplayer;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.ad.internal.view.v;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class a {
    public k a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final v c;

    public a(l lVar, v vVar) {
        this.c = vVar;
        lVar.g = this;
        this.a = new d(lVar, this, 0, true);
    }

    public final void a() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        this.a = this.a.a();
    }

    public final /* synthetic */ void c() {
        this.a = this.a.c();
    }

    public final /* synthetic */ void d() {
        this.a = this.a.d();
    }

    public final void e(int i) {
        com.five_corp.ad.f fVar = this.c.d;
        fVar.t.a();
        fVar.o.s(i, fVar.u);
    }

    public final /* synthetic */ void f() {
        this.a = this.a.f();
    }

    public final /* synthetic */ void g() {
        this.a = this.a.g();
    }

    public final /* synthetic */ void h() {
        this.a = this.a.h();
    }

    public final void i() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c();
            }
        });
    }

    public final void j() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d();
            }
        });
    }

    public final void k() {
        Handler handler = this.b;
        final v vVar = this.c;
        Objects.requireNonNull(vVar);
        handler.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.five_corp.ad.internal.movie.a.this.a();
            }
        });
    }

    public final void l() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                a.this.e();
            }
        });
    }

    public final void m() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f();
            }
        });
    }

    public final void n() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                a.this.g();
            }
        });
    }

    public final void o() {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.h();
            }
        });
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.l lVar) {
        this.a = this.a.a(lVar);
    }

    public final void b(int i) {
        v vVar = this.c;
        if (vVar.j == 3) {
            vVar.j = 4;
        }
        com.five_corp.ad.f fVar = vVar.d;
        fVar.t.a();
        fVar.o.m(i, fVar.u);
        com.five_corp.ad.internal.layouter.i iVar = fVar.x;
        com.five_corp.ad.internal.layouter.g gVar = iVar.b;
        iVar.a(com.five_corp.ad.internal.layouter.g.a(i, gVar.c, false, gVar.f, false));
    }

    public final void c(int i) {
        com.five_corp.ad.f fVar = this.c.d;
        fVar.o.n(i, fVar.u);
    }

    public final void d(int i) {
        v vVar = this.c;
        if (vVar.j == 4) {
            vVar.j = 3;
            com.five_corp.ad.f fVar = vVar.d;
            fVar.o.q(i, fVar.u);
            com.five_corp.ad.internal.layouter.i iVar = fVar.x;
            com.five_corp.ad.internal.layouter.g gVar = iVar.b;
            iVar.a(com.five_corp.ad.internal.layouter.g.a(i, gVar.c, false, gVar.f, true));
        }
    }

    public final void f(final int i) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(i);
            }
        });
    }

    public final void g(final int i) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i);
            }
        });
    }

    public final void h(final int i) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(i);
            }
        });
    }

    public final void i(final int i) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(i);
            }
        });
    }

    public final void j(final int i) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.e(i);
            }
        });
    }

    public final /* synthetic */ void a(long j) {
        this.a = this.a.a(j);
    }

    public final void a(int i) {
        v vVar = this.c;
        if (vVar.j != 3) {
            return;
        }
        vVar.j = 5;
        com.five_corp.ad.f fVar = vVar.d;
        long j = i;
        Iterator it = fVar.t.a.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.beacon.e eVar = (com.five_corp.ad.internal.beacon.e) it.next();
            if (!eVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar = eVar.b;
                if (aVar.a == 1 && aVar.b == 3) {
                    long j2 = aVar.c;
                    if (j < j2) {
                        com.five_corp.ad.internal.hub.ad_instance.e eVar2 = eVar.a;
                        Locale locale = Locale.US;
                        eVar2.a(com.five_corp.ad.internal.logger.b.a("eventThresholdMs is larger than movie duration. ots = " + eVar.h + ", thresholdMs = " + j2 + ", (estimated) movie duration = " + j));
                    }
                    eVar.f = true;
                    eVar.g.a(j, eVar.b);
                }
            }
        }
        fVar.o.t(j, fVar.u);
        com.five_corp.ad.internal.layouter.i iVar = fVar.x;
        com.five_corp.ad.internal.layouter.g gVar = iVar.b;
        int i2 = gVar.c;
        iVar.a(com.five_corp.ad.internal.layouter.g.a(i2, i2, true, gVar.f, false));
        com.five_corp.ad.internal.fullscreen.c cVar = fVar.w;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final /* synthetic */ void e() {
        this.a = this.a.e();
    }

    public final void c(final long j) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(j);
            }
        });
    }

    public final void b(long j) {
        v vVar = this.c;
        if (vVar.j == 2) {
            vVar.j = 4;
            vVar.d.a(j);
            vVar.k.b(vVar.l);
        }
    }

    public final void d(final long j) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(j);
            }
        });
    }

    public final void b(final com.five_corp.ad.internal.l lVar) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(lVar);
            }
        });
    }

    public final void b(final int i, final com.five_corp.ad.internal.l lVar) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(i, lVar);
            }
        });
    }

    public final void b(final boolean z) {
        this.b.post(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.a$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(z);
            }
        });
    }

    public final void a(int i, com.five_corp.ad.internal.l lVar) {
        v vVar = this.c;
        vVar.getClass();
        try {
            lVar.getClass();
            vVar.j = 1;
            vVar.d.a(vVar.getCurrentPositionMs(), lVar);
        } catch (Throwable th) {
            vVar.e.a(com.five_corp.ad.internal.logger.b.a(th));
        }
    }

    public final /* synthetic */ void a(boolean z) {
        this.a.a(z);
    }
}
