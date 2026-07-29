package o;

/* renamed from: o.lV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435lV {
    public final LS a;
    public final LS b;
    public final LS c;
    public final LS d;

    public C1435lV(LS ls, LS ls2, LS ls3, LS ls4) {
        this.a = ls;
        this.b = ls2;
        this.c = ls3;
        this.d = ls4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1435lV)) {
            return false;
        }
        C1435lV c1435lV = (C1435lV) obj;
        return AbstractC0048Bt.h(this.a, c1435lV.a) && AbstractC0048Bt.h(this.b, c1435lV.b) && AbstractC0048Bt.h(this.c, c1435lV.c) && AbstractC0048Bt.h(this.d, c1435lV.d);
    }

    public final int hashCode() {
        LS ls = this.a;
        int hashCode = (ls != null ? ls.hashCode() : 0) * 31;
        LS ls2 = this.b;
        int hashCode2 = (hashCode + (ls2 != null ? ls2.hashCode() : 0)) * 31;
        LS ls3 = this.c;
        int hashCode3 = (hashCode2 + (ls3 != null ? ls3.hashCode() : 0)) * 31;
        LS ls4 = this.d;
        return hashCode3 + (ls4 != null ? ls4.hashCode() : 0);
    }
}
