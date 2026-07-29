package o;

/* renamed from: o.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267y6 {
    public final Object a;
    public final Object b;

    public C2267y6(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2267y6)) {
            return false;
        }
        C2267y6 c2267y6 = (C2267y6) obj;
        return AbstractC0048Bt.h(this.a, c2267y6.a) && AbstractC0048Bt.h(this.b, c2267y6.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}
