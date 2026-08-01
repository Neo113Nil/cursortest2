package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dw0 {
    public static final dw0 d;
    public final ns0 a;
    public final wd0 b;
    public final ng0 c;

    static {
        long j = ge.g;
        long j2 = fw0.c;
        d = new dw0(new ns0(j, j2, null, null, null, null, null, j2, null, null, null, j, null, null), new wd0(Integer.MIN_VALUE, Integer.MIN_VALUE, j2, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dw0(ns0 ns0Var, wd0 wd0Var) {
        this(ns0Var, wd0Var, r0 == null ? null : new ng0(r0));
        ns0Var.getClass();
        lg0 lg0Var = wd0Var.e;
    }

    public static dw0 a(dw0 dw0Var, long j, ut utVar, qu0 qu0Var, long j2, long j3, z20 z20Var, int i) {
        i9 i9Var;
        lv0 lv0Var;
        long j4;
        ng0 ng0Var = a50.e;
        long b = dw0Var.a.a.b();
        long j5 = (i & 2) != 0 ? dw0Var.a.b : j;
        ut utVar2 = (i & 4) != 0 ? dw0Var.a.c : utVar;
        ns0 ns0Var = dw0Var.a;
        st stVar = ns0Var.d;
        tt ttVar = ns0Var.e;
        qu0 qu0Var2 = (i & 32) != 0 ? ns0Var.f : qu0Var;
        String str = ns0Var.g;
        long j6 = (i & 128) != 0 ? ns0Var.h : j2;
        i9 i9Var2 = ns0Var.i;
        lv0 lv0Var2 = ns0Var.j;
        t30 t30Var = ns0Var.k;
        long j7 = ns0Var.l;
        gv0 gv0Var = ns0Var.m;
        pq0 pq0Var = ns0Var.n;
        nz nzVar = ns0Var.o;
        wd0 wd0Var = dw0Var.b;
        int i2 = wd0Var.a;
        int i3 = wd0Var.b;
        if ((i & 131072) != 0) {
            i9Var = i9Var2;
            lv0Var = lv0Var2;
            j4 = wd0Var.c;
        } else {
            i9Var = i9Var2;
            lv0Var = lv0Var2;
            j4 = j3;
        }
        mv0 mv0Var = wd0Var.d;
        ng0 ng0Var2 = (i & 524288) != 0 ? dw0Var.c : ng0Var;
        return new dw0(new ns0(ge.c(b, ns0Var.a.b()) ? ns0Var.a : b != 16 ? new se(b) : jv0.a, j5, utVar2, stVar, ttVar, qu0Var2, str, j6, i9Var, lv0Var, t30Var, j7, gv0Var, pq0Var, nzVar), new wd0(i2, i3, j4, mv0Var, ng0Var2 != null ? ng0Var2.a : null, (i & 1048576) != 0 ? wd0Var.f : z20Var, wd0Var.g, wd0Var.h, wd0Var.i), ng0Var2);
    }

    public static dw0 d(dw0 dw0Var, long j, long j2, ut utVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? fw0.c : j2;
        ut utVar2 = (i2 & 4) != 0 ? null : utVar;
        long j6 = (i2 & 128) != 0 ? fw0.c : j3;
        long j7 = ge.g;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? fw0.c : j4;
        ns0 a = os0.a(dw0Var.a, j, null, Float.NaN, j5, utVar2, null, null, null, null, j6, null, null, null, j7, null, null, null);
        wd0 a2 = xd0.a(dw0Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (dw0Var.a == a && dw0Var.b == a2) ? dw0Var : new dw0(a, a2);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final dw0 c(dw0 dw0Var) {
        return (dw0Var == null || dw0Var.equals(d)) ? this : new dw0(this.a.c(dw0Var.a), this.b.a(dw0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        return nz.l(this.a, dw0Var.a) && nz.l(this.b, dw0Var.b) && nz.l(this.c, dw0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ng0 ng0Var = this.c;
        return hashCode + (ng0Var != null ? ng0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) ge.j(b()));
        sb.append(", brush=");
        ns0 ns0Var = this.a;
        sb.append(ns0Var.a.e());
        sb.append(", alpha=");
        sb.append(ns0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) fw0.e(ns0Var.b));
        sb.append(", fontWeight=");
        sb.append(ns0Var.c);
        sb.append(", fontStyle=");
        sb.append(ns0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(ns0Var.e);
        sb.append(", fontFamily=");
        sb.append(ns0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(ns0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) fw0.e(ns0Var.h));
        sb.append(", baselineShift=");
        sb.append(ns0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(ns0Var.j);
        sb.append(", localeList=");
        sb.append(ns0Var.k);
        sb.append(", background=");
        y6.z(ns0Var.l, sb, ", textDecoration=");
        sb.append(ns0Var.m);
        sb.append(", shadow=");
        sb.append(ns0Var.n);
        sb.append(", drawStyle=");
        sb.append(ns0Var.o);
        sb.append(", textAlign=");
        wd0 wd0Var = this.b;
        sb.append((Object) dv0.a(wd0Var.a));
        sb.append(", textDirection=");
        sb.append((Object) iv0.a(wd0Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) fw0.e(wd0Var.c));
        sb.append(", textIndent=");
        sb.append(wd0Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(wd0Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) u20.a(wd0Var.g));
        sb.append(", hyphens=");
        sb.append((Object) qw.a(wd0Var.h));
        sb.append(", textMotion=");
        sb.append(wd0Var.i);
        sb.append(')');
        return sb.toString();
    }

    public dw0(ns0 ns0Var, wd0 wd0Var, ng0 ng0Var) {
        this.a = ns0Var;
        this.b = wd0Var;
        this.c = ng0Var;
    }
}
