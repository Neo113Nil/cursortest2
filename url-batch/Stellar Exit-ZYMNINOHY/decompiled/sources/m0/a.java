package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0060t;
import k0.C0046e;
import k0.d0;
import p0.w;

/* loaded from: classes.dex */
public final class a implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f986b = e.f1016p;

    /* renamed from: c, reason: collision with root package name */
    public C0046e f987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f988d;

    public a(c cVar) {
        this.f988d = cVar;
    }

    @Override // k0.d0
    public final void a(k kVar, int i2) {
        C0046e c0046e = this.f987c;
        if (c0046e != null) {
            c0046e.a(kVar, i2);
        }
    }

    public final Object b(n0.e eVar) {
        C0046e c0046e;
        p0.q qVar;
        Boolean bool;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f994i;
        c cVar = this.f988d;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.o(c.f989d.get(cVar), true)) {
                this.f986b = e.f1012l;
                Throwable k2 = cVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i3 = w.f1172a;
                throw k2;
            }
            long andIncrement = c.f990e.getAndIncrement(cVar);
            long j2 = e.f1002b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (kVar.f1171c != j3) {
                k j4 = cVar.j(j3, kVar);
                if (j4 == null) {
                    continue;
                } else {
                    kVar = j4;
                }
            }
            Object w2 = cVar.w(kVar, i4, andIncrement, null);
            io.flutter.plugin.platform.c cVar2 = e.f1013m;
            if (w2 == cVar2) {
                throw new IllegalStateException("unreachable");
            }
            io.flutter.plugin.platform.c cVar3 = e.f1015o;
            if (w2 != cVar3) {
                if (w2 != e.f1014n) {
                    kVar.a();
                    this.f986b = w2;
                    return Boolean.TRUE;
                }
                c cVar4 = this.f988d;
                C0046e b2 = AbstractC0060t.b(a.a.o(eVar));
                try {
                    this.f987c = b2;
                    c0046e = b2;
                } catch (Throwable th) {
                    th = th;
                    c0046e = b2;
                }
                try {
                    Object w3 = cVar4.w(kVar, i4, andIncrement, this);
                    if (w3 == cVar2) {
                        a(kVar, i4);
                    } else {
                        W.i iVar = c0046e.f863f;
                        d0.l lVar = cVar4.f999c;
                        if (w3 == cVar3) {
                            if (andIncrement < cVar4.m()) {
                                kVar.a();
                            }
                            k kVar2 = (k) c.f994i.get(cVar4);
                            while (true) {
                                if (cVar4.o(c.f989d.get(cVar4), true)) {
                                    C0046e c0046e2 = this.f987c;
                                    e0.h.b(c0046e2);
                                    this.f987c = null;
                                    this.f986b = e.f1012l;
                                    Throwable k3 = cVar.k();
                                    if (k3 == null) {
                                        c0046e2.d(Boolean.FALSE);
                                    } else {
                                        c0046e2.d(a.a.h(k3));
                                    }
                                } else {
                                    long andIncrement2 = c.f990e.getAndIncrement(cVar4);
                                    long j5 = e.f1002b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (kVar2.f1171c != j6) {
                                        k j7 = cVar4.j(j6, kVar2);
                                        if (j7 != null) {
                                            kVar2 = j7;
                                        }
                                    }
                                    d0.l lVar2 = lVar;
                                    Object w4 = cVar4.w(kVar2, i5, andIncrement2, this);
                                    if (w4 == e.f1013m) {
                                        a(kVar2, i5);
                                        break;
                                    }
                                    if (w4 == e.f1015o) {
                                        if (andIncrement2 < cVar4.m()) {
                                            kVar2.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (w4 == e.f1014n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f986b = w4;
                                        this.f987c = null;
                                        qVar = lVar2 != null ? new p0.q(lVar2, w4, iVar) : null;
                                        bool = Boolean.TRUE;
                                        i2 = c0046e.f896d;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f986b = w3;
                            this.f987c = null;
                            qVar = lVar != null ? new p0.q(lVar, w3, iVar) : null;
                            bool = Boolean.TRUE;
                            i2 = c0046e.f896d;
                        }
                        c0046e.v(bool, i2, qVar);
                    }
                    return c0046e.p();
                } catch (Throwable th2) {
                    th = th2;
                    c0046e.u();
                    throw th;
                }
            }
            if (andIncrement < cVar.m()) {
                kVar.a();
            }
        }
    }
}
