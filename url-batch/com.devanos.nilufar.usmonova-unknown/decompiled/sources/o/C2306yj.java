package o;

/* renamed from: o.yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306yj implements NY {
    public final C2278yH a;

    public C2306yj(C2278yH c2278yH) {
        this.a = c2278yH;
    }

    @Override // o.NY
    public final Object a(JH jh) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2306yj) && this.a.equals(((C2306yj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
