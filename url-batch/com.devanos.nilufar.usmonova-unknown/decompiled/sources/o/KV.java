package o;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class KV extends C0169Gk {
    @Override // o.C0169Gk, o.WB
    public final /* bridge */ /* synthetic */ Collection a(C0827cE c0827cE, DE de) {
        a(c0827cE, de);
        throw null;
    }

    @Override // o.C0169Gk, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        throw new IllegalStateException(this.b);
    }

    @Override // o.C0169Gk, o.WB
    public final /* bridge */ /* synthetic */ Collection c(C0827cE c0827cE, DE de) {
        c(c0827cE, de);
        throw null;
    }

    @Override // o.C0169Gk, o.WB
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // o.C0169Gk, o.WB
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // o.C0169Gk, o.WB
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // o.C0169Gk, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        throw new IllegalStateException(this.b + ", required name: " + c0827cE);
    }

    @Override // o.C0169Gk
    /* renamed from: h */
    public final Set a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        throw new IllegalStateException(this.b + ", required name: " + c0827cE);
    }

    @Override // o.C0169Gk
    /* renamed from: i */
    public final Set c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        throw new IllegalStateException(this.b + ", required name: " + c0827cE);
    }

    @Override // o.C0169Gk
    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
