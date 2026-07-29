package o;

/* renamed from: o.gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128gq extends AbstractC1259iq {
    public final String a;

    public C1128gq(String str) {
        AbstractC0048Bt.n(str, "dest");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1128gq) && AbstractC0048Bt.h(this.a, ((C1128gq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1888sN.k("S0(dest=", this.a, ")");
    }
}
