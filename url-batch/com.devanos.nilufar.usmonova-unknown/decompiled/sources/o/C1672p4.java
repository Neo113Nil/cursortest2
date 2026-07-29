package o;

import java.util.Iterator;

/* renamed from: o.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1672p4 implements InterfaceC1738q4 {
    @Override // o.InterfaceC1738q4
    public final InterfaceC0948e4 c(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return null;
    }

    @Override // o.InterfaceC1738q4
    public final boolean i(C2245xo c2245xo) {
        return AbstractC1052fg.F(this, c2245xo);
    }

    @Override // o.InterfaceC1738q4
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C1253ik.h;
    }

    public final String toString() {
        return "EMPTY";
    }
}
