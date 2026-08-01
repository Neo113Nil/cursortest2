package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148a {

    /* renamed from: a, reason: collision with root package name */
    public int f2846a;

    /* renamed from: b, reason: collision with root package name */
    public int f2847b;

    /* renamed from: c, reason: collision with root package name */
    public int f2848c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0148a)) {
            return false;
        }
        C0148a c0148a = (C0148a) obj;
        int i = this.f2846a;
        if (i != c0148a.f2846a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2848c - this.f2847b) == 1 && this.f2848c == c0148a.f2847b && this.f2847b == c0148a.f2848c) {
            return true;
        }
        return this.f2848c == c0148a.f2848c && this.f2847b == c0148a.f2847b;
    }

    public final int hashCode() {
        return (((this.f2846a * 31) + this.f2847b) * 31) + this.f2848c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2846a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2847b);
        sb.append("c:");
        sb.append(this.f2848c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
