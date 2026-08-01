package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ns0 implements j7 {
    public final kv0 a;
    public final long b;
    public final ut c;
    public final st d;
    public final tt e;
    public final qu0 f;
    public final String g;
    public final long h;
    public final i9 i;
    public final lv0 j;
    public final t30 k;
    public final long l;
    public final gv0 m;
    public final pq0 n;
    public final nz o;

    public ns0(long j, long j2, ut utVar, st stVar, tt ttVar, qu0 qu0Var, String str, long j3, i9 i9Var, lv0 lv0Var, t30 t30Var, long j4, gv0 gv0Var, pq0 pq0Var, int i) {
        this((i & 1) != 0 ? ge.g : j, (i & 2) != 0 ? fw0.c : j2, (i & 4) != 0 ? null : utVar, (i & 8) != 0 ? null : stVar, (i & 16) != 0 ? null : ttVar, (i & 32) != 0 ? null : qu0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? fw0.c : j3, (i & 256) != 0 ? null : i9Var, (i & 512) != 0 ? null : lv0Var, (i & 1024) != 0 ? null : t30Var, (i & 2048) != 0 ? ge.g : j4, (i & 4096) != 0 ? null : gv0Var, (i & 8192) != 0 ? null : pq0Var);
    }

    public final boolean a(ns0 ns0Var) {
        if (this == ns0Var) {
            return true;
        }
        return fw0.a(this.b, ns0Var.b) && nz.l(this.c, ns0Var.c) && nz.l(this.d, ns0Var.d) && nz.l(this.e, ns0Var.e) && nz.l(this.f, ns0Var.f) && nz.l(this.g, ns0Var.g) && fw0.a(this.h, ns0Var.h) && nz.l(this.i, ns0Var.i) && nz.l(this.j, ns0Var.j) && nz.l(this.k, ns0Var.k) && ge.c(this.l, ns0Var.l);
    }

    public final boolean b(ns0 ns0Var) {
        return nz.l(this.a, ns0Var.a) && nz.l(this.m, ns0Var.m) && nz.l(this.n, ns0Var.n) && nz.l(this.o, ns0Var.o);
    }

    public final ns0 c(ns0 ns0Var) {
        if (ns0Var == null) {
            return this;
        }
        kv0 kv0Var = ns0Var.a;
        return os0.a(this, kv0Var.b(), kv0Var.e(), kv0Var.a(), ns0Var.b, ns0Var.c, ns0Var.d, ns0Var.e, ns0Var.f, ns0Var.g, ns0Var.h, ns0Var.i, ns0Var.j, ns0Var.k, ns0Var.l, ns0Var.m, ns0Var.n, ns0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns0)) {
            return false;
        }
        ns0 ns0Var = (ns0) obj;
        return a(ns0Var) && b(ns0Var);
    }

    public final int hashCode() {
        kv0 kv0Var = this.a;
        int i = ge.i(kv0Var.b()) * 31;
        px0 e = kv0Var.e();
        int d = (fw0.d(this.b) + ((Float.floatToIntBits(kv0Var.a()) + ((i + (e != null ? e.hashCode() : 0)) * 31)) * 31)) * 31;
        ut utVar = this.c;
        int i2 = (d + (utVar != null ? utVar.d : 0)) * 31;
        st stVar = this.d;
        int i3 = (i2 + (stVar != null ? stVar.a : 0)) * 31;
        tt ttVar = this.e;
        int i4 = (i3 + (ttVar != null ? ttVar.a : 0)) * 31;
        qu0 qu0Var = this.f;
        int hashCode = (i4 + (qu0Var != null ? qu0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int d2 = (fw0.d(this.h) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        i9 i9Var = this.i;
        int floatToIntBits = (d2 + (i9Var != null ? Float.floatToIntBits(i9Var.a) : 0)) * 31;
        lv0 lv0Var = this.j;
        int hashCode2 = (floatToIntBits + (lv0Var != null ? lv0Var.hashCode() : 0)) * 31;
        t30 t30Var = this.k;
        int i5 = (ge.i(this.l) + ((hashCode2 + (t30Var != null ? t30Var.d.hashCode() : 0)) * 31)) * 31;
        gv0 gv0Var = this.m;
        int i6 = (i5 + (gv0Var != null ? gv0Var.a : 0)) * 31;
        pq0 pq0Var = this.n;
        int hashCode3 = (i6 + (pq0Var != null ? pq0Var.hashCode() : 0)) * 961;
        nz nzVar = this.o;
        return hashCode3 + (nzVar != null ? nzVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        kv0 kv0Var = this.a;
        sb.append((Object) ge.j(kv0Var.b()));
        sb.append(", brush=");
        sb.append(kv0Var.e());
        sb.append(", alpha=");
        sb.append(kv0Var.a());
        sb.append(", fontSize=");
        sb.append((Object) fw0.e(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) fw0.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        y6.z(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }

    public ns0(kv0 kv0Var, long j, ut utVar, st stVar, tt ttVar, qu0 qu0Var, String str, long j2, i9 i9Var, lv0 lv0Var, t30 t30Var, long j3, gv0 gv0Var, pq0 pq0Var, nz nzVar) {
        this.a = kv0Var;
        this.b = j;
        this.c = utVar;
        this.d = stVar;
        this.e = ttVar;
        this.f = qu0Var;
        this.g = str;
        this.h = j2;
        this.i = i9Var;
        this.j = lv0Var;
        this.k = t30Var;
        this.l = j3;
        this.m = gv0Var;
        this.n = pq0Var;
        this.o = nzVar;
    }

    public ns0(long j, long j2, ut utVar, st stVar, tt ttVar, qu0 qu0Var, String str, long j3, i9 i9Var, lv0 lv0Var, t30 t30Var, long j4, gv0 gv0Var, pq0 pq0Var) {
        this(j != 16 ? new se(j) : jv0.a, j2, utVar, stVar, ttVar, qu0Var, str, j3, i9Var, lv0Var, t30Var, j4, gv0Var, pq0Var, (nz) null);
    }
}
