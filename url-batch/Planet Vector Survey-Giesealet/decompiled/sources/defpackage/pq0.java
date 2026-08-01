package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pq0 {
    public static final pq0 d = new pq0(0.0f, d31.d(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public pq0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq0)) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return ge.c(this.a, pq0Var.a) && ra0.b(this.b, pq0Var.b) && this.c == pq0Var.c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + ((ra0.f(this.b) + (ge.i(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        y6.z(this.a, sb, ", offset=");
        sb.append((Object) ra0.j(this.b));
        sb.append(", blurRadius=");
        return y6.w(sb, this.c, ')');
    }
}
