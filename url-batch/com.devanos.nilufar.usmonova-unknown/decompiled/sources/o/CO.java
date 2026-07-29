package o;

/* loaded from: classes.dex */
public final class CO {
    public final boolean a;
    public final long b;

    public CO(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CO)) {
            return false;
        }
        CO co = (CO) obj;
        if (this.a == co.a && AbstractC0556Vi.a(Float.NaN, Float.NaN)) {
            return C1114gc.b(this.b, co.b);
        }
        return false;
    }

    public final int hashCode() {
        int e = AbstractC1888sN.e(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = C1114gc.g;
        return Long.hashCode(this.b) + e;
    }
}
