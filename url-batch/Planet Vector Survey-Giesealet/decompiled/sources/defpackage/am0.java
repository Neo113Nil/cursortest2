package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class am0 implements rq0 {
    public final oj a;
    public final oj b;
    public final oj c;
    public final oj d;

    public am0(oj ojVar, oj ojVar2, oj ojVar3, oj ojVar4) {
        this.a = ojVar;
        this.b = ojVar2;
        this.c = ojVar3;
        this.d = ojVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [oj] */
    /* JADX WARN: Type inference failed for: r3v2, types: [oj] */
    public static am0 b(am0 am0Var, kn knVar, kn knVar2, kn knVar3, int i) {
        kn knVar4 = knVar;
        if ((i & 1) != 0) {
            knVar4 = am0Var.a;
        }
        oj ojVar = am0Var.b;
        kn knVar5 = knVar2;
        if ((i & 4) != 0) {
            knVar5 = am0Var.c;
        }
        am0Var.getClass();
        return new am0(knVar4, ojVar, knVar5, knVar3);
    }

    @Override // defpackage.rq0
    public final xc0 a(long j, c10 c10Var, sl slVar) {
        float a = this.a.a(j, slVar);
        float a2 = this.b.a(j, slVar);
        float a3 = this.c.a(j, slVar);
        float a4 = this.d.a(j, slVar);
        float d = fr0.d(j);
        float f = a + a4;
        if (f > d) {
            float f2 = d / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > d) {
            float f4 = d / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!").toString());
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new vc0(od0.b(0L, j));
        }
        zi0 b = od0.b(0L, j);
        c10 c10Var2 = c10.d;
        long g = mz.g(c10Var == c10Var2 ? a : a2);
        if (c10Var == c10Var2) {
            a = a2;
        }
        long g2 = mz.g(a);
        long g3 = mz.g(c10Var == c10Var2 ? a3 : a4);
        if (c10Var != c10Var2) {
            a4 = a3;
        }
        return new wc0(new zl0(b.a, b.b, b.c, b.d, g, g2, g3, mz.g(a4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj;
        return nz.l(this.a, am0Var.a) && this.b.equals(am0Var.b) && nz.l(this.c, am0Var.c) && this.d.equals(am0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
