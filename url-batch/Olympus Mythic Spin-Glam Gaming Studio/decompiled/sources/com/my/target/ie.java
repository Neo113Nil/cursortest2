package com.my.target;

import com.my.target.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ie {
    private final a a;
    final hb b;
    final float c;
    private volatile boolean d;
    private boolean e;
    private int f;
    private int g;
    public List h;
    final AtomicReference i;
    public eb j;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(eb ebVar);

        void a(eb ebVar, String str);

        void a(ie ieVar, boolean z);

        boolean a(List list, p.b bVar);
    }

    private ie(hb hbVar, float f, List list, a aVar, AtomicReference atomicReference) {
        atomicReference.set(this);
        this.b = hbVar;
        this.c = f;
        this.a = aVar;
        this.h = list;
        this.i = atomicReference;
        this.d = false;
        this.e = false;
        this.f = hbVar.f();
        this.g = -1;
        this.j = null;
    }

    public static ie a(hb hbVar, float f, a aVar, AtomicReference atomicReference) {
        return new ie(hbVar, f, hbVar.d(), aVar, atomicReference);
    }

    private void b() {
        List a2 = this.b.a(this.c);
        int size = a2.size();
        if (size > 0 && this.g < size - 1) {
            this.h = a2;
            c();
            return;
        }
        List b = this.b.b(this.c);
        if (b.isEmpty()) {
            mi.a("InstreamAdEngine: There is no one midpoint service for point - " + this.c);
            a();
            return;
        }
        mi.a("InstreamAdEngine: Loading midpoint services for point - " + this.c);
        a(b);
    }

    void c() {
        eb ebVar;
        boolean equals;
        this.a.a();
        if (this.f == 0 || this.h.isEmpty()) {
            a();
            return;
        }
        do {
            int i = this.g + 1;
            if (i >= this.h.size()) {
                a();
                return;
            }
            this.g = i;
            ebVar = (eb) this.h.get(i);
            equals = "statistics".equals(ebVar.M());
            if (equals) {
                this.a.a(ebVar, "playbackStarted");
            }
        } while (equals);
        int i2 = this.f;
        if (i2 > 0) {
            this.f = i2 - 1;
        }
        this.j = ebVar;
        this.a.a(ebVar);
    }

    public void d() {
        if (this.b.k()) {
            b();
        } else {
            c();
        }
    }

    public void e() {
        this.d = true;
    }

    void a() {
        y l = this.b.l();
        if (l != null) {
            if (this.b.k()) {
                mi.a("InstreamAdEngine: Using doAfter service for point - " + this.c);
            } else {
                mi.a("InstreamAdEngine: Loading doAfter service - " + l.b);
            }
            if (this.b.k()) {
                l.c(true);
                l.b(this.c);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(l);
            a(arrayList);
            return;
        }
        a(true);
    }

    private void a(List list) {
        if (this.a.a(list, new p.b() { // from class: com.my.target.ie$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                ie.this.a((l6) xVar, sVar);
            }
        })) {
            return;
        }
        a(false);
    }

    private void a(boolean z) {
        if (this.b.k()) {
            this.b.b(this.f);
        }
        if (this.e || this.d) {
            return;
        }
        this.a.a(this, z);
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l6 l6Var, s sVar) {
        if (l6Var == null) {
            q a2 = sVar.a();
            if (a2 != null) {
                mi.a("InstreamAdEngine: play - loading services failed - " + a2);
            }
            if (!this.d && this == this.i.get()) {
                a();
            }
        } else {
            hb a3 = l6Var.a(this.b.h());
            if (a3 != null) {
                this.b.a(a3);
            }
            if (!this.d && this == this.i.get()) {
                if (this.b.k()) {
                    b();
                } else {
                    this.h = this.b.d();
                    c();
                }
            }
        }
        if (this.d) {
            a(true);
        }
    }
}
