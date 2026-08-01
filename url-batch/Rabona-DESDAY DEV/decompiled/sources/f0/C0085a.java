package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085a {

    /* renamed from: a, reason: collision with root package name */
    public int f2029a;

    /* renamed from: b, reason: collision with root package name */
    public int f2030b;

    /* renamed from: c, reason: collision with root package name */
    public int f2031c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0085a.class != obj.getClass()) {
            return false;
        }
        C0085a c0085a = (C0085a) obj;
        int i = this.f2029a;
        if (i != c0085a.f2029a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2031c - this.f2030b) == 1 && this.f2031c == c0085a.f2030b && this.f2030b == c0085a.f2031c) {
            return true;
        }
        return this.f2031c == c0085a.f2031c && this.f2030b == c0085a.f2030b;
    }

    public final int hashCode() {
        return (((this.f2029a * 31) + this.f2030b) * 31) + this.f2031c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2029a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2030b);
        sb.append("c:");
        sb.append(this.f2031c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
