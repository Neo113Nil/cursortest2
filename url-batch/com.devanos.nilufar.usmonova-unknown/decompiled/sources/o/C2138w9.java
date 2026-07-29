package o;

/* renamed from: o.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138w9 {
    public final C2245xo a;
    public final C0827cE b;

    static {
        C2245xo.j(YS.f);
    }

    public C2138w9(C2245xo c2245xo, C0827cE c0827cE) {
        AbstractC0048Bt.n(c2245xo, "packageName");
        this.a = c2245xo;
        this.b = c0827cE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138w9)) {
            return false;
        }
        C2138w9 c2138w9 = (C2138w9) obj;
        return AbstractC0048Bt.h(this.a, c2138w9.a) && this.b.equals(c2138w9.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = AbstractC0778bU.y(this.a.b(), '.', '/') + "/" + this.b;
        AbstractC0048Bt.m(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
