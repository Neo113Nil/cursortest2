package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112a {

    /* renamed from: a, reason: collision with root package name */
    public int f2408a;

    /* renamed from: b, reason: collision with root package name */
    public int f2409b;

    /* renamed from: c, reason: collision with root package name */
    public int f2410c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0112a)) {
            return false;
        }
        C0112a c0112a = (C0112a) obj;
        int i = this.f2408a;
        if (i != c0112a.f2408a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2410c - this.f2409b) == 1 && this.f2410c == c0112a.f2409b && this.f2409b == c0112a.f2410c) {
            return true;
        }
        return this.f2410c == c0112a.f2410c && this.f2409b == c0112a.f2409b;
    }

    public final int hashCode() {
        return (((this.f2408a * 31) + this.f2409b) * 31) + this.f2410c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2408a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2409b);
        sb.append("c:");
        sb.append(this.f2410c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
