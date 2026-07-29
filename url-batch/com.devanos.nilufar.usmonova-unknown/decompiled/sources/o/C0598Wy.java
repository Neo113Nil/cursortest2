package o;

/* renamed from: o.Wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598Wy {
    public final C0827cE a;
    public final C2217xM b;

    public C0598Wy(C0827cE c0827cE, C2217xM c2217xM) {
        AbstractC0048Bt.n(c0827cE, "name");
        this.a = c0827cE;
        this.b = c2217xM;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0598Wy) {
            return AbstractC0048Bt.h(this.a, ((C0598Wy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
