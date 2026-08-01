package b1;

import Z0.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q1.AbstractC0349o;
import q1.C0338d;
import q1.InterfaceC0359z;
import q1.W;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0094c extends AbstractC0092a {
    private final i _context;
    private transient Z0.d intercepted;

    public AbstractC0094c(Z0.d dVar, i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // Z0.d
    public i getContext() {
        i iVar = this._context;
        i1.f.b(iVar);
        return iVar;
    }

    public final Z0.d intercepted() {
        Z0.d dVar = this.intercepted;
        if (dVar == null) {
            Z0.f fVar = (Z0.f) getContext().f(Z0.e.f1557a);
            dVar = fVar != null ? new u1.f((AbstractC0349o) fVar, this) : this;
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // b1.AbstractC0092a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Z0.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            Z0.g f2 = getContext().f(Z0.e.f1557a);
            i1.f.b(f2);
            u1.f fVar = (u1.f) dVar;
            do {
                atomicReferenceFieldUpdater = u1.f.h;
            } while (atomicReferenceFieldUpdater.get(fVar) == u1.a.f4176c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0338d c0338d = obj instanceof C0338d ? (C0338d) obj : null;
            if (c0338d != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0338d.h;
                InterfaceC0359z interfaceC0359z = (InterfaceC0359z) atomicReferenceFieldUpdater2.get(c0338d);
                if (interfaceC0359z != null) {
                    interfaceC0359z.e();
                    atomicReferenceFieldUpdater2.set(c0338d, W.f3884a);
                }
            }
        }
        this.intercepted = C0093b.f2103a;
    }

    public AbstractC0094c(Z0.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
