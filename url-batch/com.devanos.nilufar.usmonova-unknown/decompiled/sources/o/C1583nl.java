package o;

/* renamed from: o.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583nl {
    public final Object a;
    public final int b;

    public C1583nl(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1583nl)) {
            return false;
        }
        C1583nl c1583nl = (C1583nl) obj;
        return this.a == c1583nl.a && this.b == c1583nl.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
