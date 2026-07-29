package o;

/* renamed from: o.rI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817rI {
    public final TD a;

    public C1817rI(TD td) {
        this.a = td;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1817rI)) {
            return false;
        }
        C1817rI c1817rI = (C1817rI) obj;
        c1817rI.getClass();
        return AbstractC0556Vi.a(Float.NaN, Float.NaN) && this.a.equals(c1817rI.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + AbstractC1888sN.e(Float.NaN, Boolean.hashCode(true) * 31, 31);
    }
}
