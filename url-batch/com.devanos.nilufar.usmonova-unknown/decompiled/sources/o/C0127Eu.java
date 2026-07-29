package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Eu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0127Eu extends C0283Ku {
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127Eu(InterfaceC0075Cu interfaceC0075Cu) {
        super(true);
        boolean z = true;
        J(interfaceC0075Cu);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0283Ku.i;
        InterfaceC0652Za interfaceC0652Za = (InterfaceC0652Za) atomicReferenceFieldUpdater.get(this);
        C0719ab c0719ab = interfaceC0652Za instanceof C0719ab ? (C0719ab) interfaceC0652Za : null;
        if (c0719ab != null) {
            C0283Ku j = c0719ab.j();
            while (!j.z()) {
                InterfaceC0652Za interfaceC0652Za2 = (InterfaceC0652Za) atomicReferenceFieldUpdater.get(j);
                C0719ab c0719ab2 = interfaceC0652Za2 instanceof C0719ab ? (C0719ab) interfaceC0652Za2 : null;
                if (c0719ab2 != null) {
                    j = c0719ab2.j();
                }
            }
            this.j = z;
        }
        z = false;
        this.j = z;
    }

    @Override // o.C0283Ku
    public final boolean A() {
        return true;
    }

    @Override // o.C0283Ku
    public final boolean z() {
        return this.j;
    }
}
