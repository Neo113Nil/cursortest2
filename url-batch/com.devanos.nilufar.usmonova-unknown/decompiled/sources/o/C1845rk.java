package o;

/* renamed from: o.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1845rk {
    public final String a;

    public C1845rk(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845rk)) {
            return false;
        }
        return this.a.equals(((C1845rk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1888sN.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
