package q1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends U {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(M m2) {
        super(true);
        boolean z2 = true;
        x(m2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U.f3883b;
        InterfaceC0341g interfaceC0341g = (InterfaceC0341g) atomicReferenceFieldUpdater.get(this);
        C0342h c0342h = interfaceC0341g instanceof C0342h ? (C0342h) interfaceC0341g : null;
        if (c0342h != null) {
            U n2 = c0342h.n();
            while (!n2.s()) {
                InterfaceC0341g interfaceC0341g2 = (InterfaceC0341g) atomicReferenceFieldUpdater.get(n2);
                C0342h c0342h2 = interfaceC0341g2 instanceof C0342h ? (C0342h) interfaceC0341g2 : null;
                if (c0342h2 != null) {
                    n2 = c0342h2.n();
                }
            }
            this.f3886c = z2;
        }
        z2 = false;
        this.f3886c = z2;
    }

    @Override // q1.U
    public final boolean m(Throwable th) {
        return false;
    }

    @Override // q1.U
    public final boolean s() {
        return this.f3886c;
    }
}
