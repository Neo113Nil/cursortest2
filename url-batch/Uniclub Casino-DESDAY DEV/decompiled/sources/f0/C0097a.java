package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097a {

    /* renamed from: a, reason: collision with root package name */
    public int f2031a;

    /* renamed from: b, reason: collision with root package name */
    public int f2032b;

    /* renamed from: c, reason: collision with root package name */
    public int f2033c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0097a.class != obj.getClass()) {
            return false;
        }
        C0097a c0097a = (C0097a) obj;
        int i = this.f2031a;
        if (i != c0097a.f2031a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2033c - this.f2032b) == 1 && this.f2033c == c0097a.f2032b && this.f2032b == c0097a.f2033c) {
            return true;
        }
        return this.f2033c == c0097a.f2033c && this.f2032b == c0097a.f2032b;
    }

    public final int hashCode() {
        return (((this.f2031a * 31) + this.f2032b) * 31) + this.f2033c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2031a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2032b);
        sb.append("c:");
        sb.append(this.f2033c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
