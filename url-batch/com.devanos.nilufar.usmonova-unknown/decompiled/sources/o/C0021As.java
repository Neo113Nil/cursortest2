package o;

/* renamed from: o.As, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021As {
    public final int a;
    public final Object b;

    public C0021As(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0021As)) {
            return false;
        }
        C0021As c0021As = (C0021As) obj;
        return this.a == c0021As.a && AbstractC0048Bt.h(this.b, c0021As.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
