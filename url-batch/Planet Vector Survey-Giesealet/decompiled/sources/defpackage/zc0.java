package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zc0 {
    public final long a;
    public final id0 b;

    public zc0() {
        long d = d31.d(4284900966L);
        id0 id0Var = new id0(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = d;
        this.b = id0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zc0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zc0 zc0Var = (zc0) obj;
        return ge.c(this.a, zc0Var.a) && nz.l(this.b, zc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (ge.i(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        y6.z(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
