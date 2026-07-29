package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class FT extends AbstractC0679a0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // o.AbstractC0679a0
    public final boolean a(Z z) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC1305jX.l);
        return true;
    }

    @Override // o.AbstractC0679a0
    public final InterfaceC2235xe[] b(Z z) {
        this.a.set(null);
        return AbstractC1807r8.a;
    }
}
