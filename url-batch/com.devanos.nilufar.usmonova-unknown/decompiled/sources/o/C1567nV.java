package o;

/* renamed from: o.nV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567nV {
    public final long a;
    public final long b;

    public C1567nV(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567nV)) {
            return false;
        }
        C1567nV c1567nV = (C1567nV) obj;
        return C1114gc.b(this.a, c1567nV.a) && C1114gc.b(this.b, c1567nV.b);
    }

    public final int hashCode() {
        int i = C1114gc.g;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC2188wx.l(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C1114gc.g(this.b));
        sb.append(')');
        return sb.toString();
    }
}
