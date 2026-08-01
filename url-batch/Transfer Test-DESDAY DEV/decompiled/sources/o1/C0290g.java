package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290g extends Q {

    /* renamed from: e, reason: collision with root package name */
    public final C0288e f3315e;

    public C0290g(C0288e c0288e) {
        this.f3315e = c0288e;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f870a;
    }

    @Override // o1.S
    public final void o(Throwable th) {
        W n2 = n();
        C0288e c0288e = this.f3315e;
        c0288e.getClass();
        CancellationException s2 = n2.s();
        if (c0288e.p()) {
            X0.d dVar = c0288e.d;
            g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            s1.f fVar = (s1.f) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = s1.a.f3689c;
                if (!g1.f.a(obj, qVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, s2)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0288e.k(s2);
        if (c0288e.p()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0288e.h;
        A a2 = (A) atomicReferenceFieldUpdater2.get(c0288e);
        if (a2 == null) {
            return;
        }
        a2.e();
        atomicReferenceFieldUpdater2.set(c0288e, Y.f3303a);
    }
}
