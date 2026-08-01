package q1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340f extends O {

    /* renamed from: e, reason: collision with root package name */
    public final C0338d f3895e;

    public C0340f(C0338d c0338d) {
        this.f3895e = c0338d;
    }

    @Override // h1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return V0.i.f1250a;
    }

    @Override // q1.P
    public final void o(Throwable th) {
        U n2 = n();
        C0338d c0338d = this.f3895e;
        c0338d.getClass();
        CancellationException r2 = n2.r();
        if (c0338d.k()) {
            Z0.d dVar = c0338d.d;
            i1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            u1.f fVar = (u1.f) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = u1.a.f4176c;
                if (!i1.f.a(obj, qVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, r2)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0338d.h(r2);
        if (c0338d.k()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0338d.h;
        InterfaceC0359z interfaceC0359z = (InterfaceC0359z) atomicReferenceFieldUpdater2.get(c0338d);
        if (interfaceC0359z == null) {
            return;
        }
        interfaceC0359z.e();
        atomicReferenceFieldUpdater2.set(c0338d, W.f3884a);
    }
}
