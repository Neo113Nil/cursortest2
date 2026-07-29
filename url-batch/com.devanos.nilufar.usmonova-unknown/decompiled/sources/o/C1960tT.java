package o;

/* renamed from: o.tT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1960tT extends AbstractC2224xT {
    public final String a;

    public C1960tT(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1960tT) && AbstractC0048Bt.h(this.a, ((C1960tT) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1888sN.k("Fallback(reason=", this.a, ")");
    }
}
