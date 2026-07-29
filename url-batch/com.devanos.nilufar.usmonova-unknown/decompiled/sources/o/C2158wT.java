package o;

/* renamed from: o.wT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158wT extends AbstractC2224xT {
    public final String a;

    public C2158wT(String str) {
        AbstractC0048Bt.n(str, "dest");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2158wT) && AbstractC0048Bt.h(this.a, ((C2158wT) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1888sN.k("OpenS0(dest=", this.a, ")");
    }
}
