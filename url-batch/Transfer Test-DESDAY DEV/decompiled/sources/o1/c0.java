package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(O o2) {
        super(true);
        boolean z2 = true;
        z(o2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f3302b;
        InterfaceC0291h interfaceC0291h = (InterfaceC0291h) atomicReferenceFieldUpdater.get(this);
        C0292i c0292i = interfaceC0291h instanceof C0292i ? (C0292i) interfaceC0291h : null;
        if (c0292i != null) {
            W n2 = c0292i.n();
            while (!n2.u()) {
                InterfaceC0291h interfaceC0291h2 = (InterfaceC0291h) atomicReferenceFieldUpdater.get(n2);
                C0292i c0292i2 = interfaceC0291h2 instanceof C0292i ? (C0292i) interfaceC0291h2 : null;
                if (c0292i2 != null) {
                    n2 = c0292i2.n();
                }
            }
            this.f3306c = z2;
        }
        z2 = false;
        this.f3306c = z2;
    }

    @Override // o1.W
    public final boolean o(Throwable th) {
        return false;
    }

    @Override // o1.W
    public final boolean u() {
        return this.f3306c;
    }
}
