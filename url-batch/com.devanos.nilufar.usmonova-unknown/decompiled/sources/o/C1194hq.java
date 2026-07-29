package o;

/* renamed from: o.hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194hq extends AbstractC1259iq {
    public final String a;

    public C1194hq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1194hq) && AbstractC0048Bt.h(this.a, ((C1194hq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1888sN.k("ShowFallback(reason=", this.a, ")");
    }
}
