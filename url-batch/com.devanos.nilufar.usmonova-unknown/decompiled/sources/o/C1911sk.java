package o;

import java.util.Map;

/* renamed from: o.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911sk implements InterfaceC0948e4 {
    public static final C1911sk a = new C1911sk();

    @Override // o.InterfaceC0948e4
    public final AbstractC1004ey c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // o.InterfaceC0948e4
    public final IS d() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // o.InterfaceC0948e4
    public final C2245xo e() {
        InterfaceC1245ib d = AbstractC0192Hh.d(this);
        if (d != null) {
            if (C0273Kk.f(d)) {
                d = null;
            }
            if (d != null) {
                return AbstractC0192Hh.c(d);
            }
        }
        return null;
    }

    @Override // o.InterfaceC0948e4
    public final Map f() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
