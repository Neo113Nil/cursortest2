package o;

import java.util.Collection;

/* loaded from: classes.dex */
public final class HM extends BM implements InterfaceC0489St {
    public final C2245xo a;

    public HM(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        this.a = c2245xo;
    }

    @Override // o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HM) {
            return AbstractC0048Bt.h(this.a, ((HM) obj).a);
        }
        return false;
    }

    @Override // o.InterfaceC0489St
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C1318jk.h;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return HM.class.getName() + ": " + this.a;
    }
}
