package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jq extends t50 implements i10 {
    public cx0 r;
    public wq s;
    public bu t;
    public dq u;
    public long v;
    public o9 w;

    @Override // defpackage.t50
    public final void Z() {
        this.v = z6.a;
    }

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        Object b = this.r.a.b();
        Object value = this.r.d.getValue();
        cq cqVar = cq.d;
        if (b == value) {
            this.w = null;
        } else if (this.w == null) {
            if (this.r.f().a(cqVar, cq.e)) {
                dx0 dx0Var = this.s.a;
            } else {
                dx0 dx0Var2 = this.s.a;
            }
            this.w = b2.e;
        }
        boolean f0 = f40Var.f0();
        xp xpVar = xp.d;
        if (f0) {
            yf0 d = b50Var.d(j);
            long c = px0.c(d.d, d.e);
            this.v = c;
            return f40Var.h0((int) (c >> 32), (int) (c & 4294967295L), xpVar, new hq(d, 0));
        }
        if (!((Boolean) this.t.a()).booleanValue()) {
            yf0 d2 = b50Var.d(j);
            return f40Var.h0(d2.d, d2.e, xpVar, new hq(d2, 1));
        }
        dq dqVar = this.u;
        xw0 xw0Var = dqVar.a;
        xw0 xw0Var2 = dqVar.b;
        cx0 cx0Var = dqVar.c;
        kq kqVar = dqVar.d;
        wq wqVar = dqVar.e;
        xw0 xw0Var3 = dqVar.f;
        ww0 a = xw0Var != null ? xw0Var.a(new eq(kqVar, wqVar, 0), new eq(kqVar, wqVar, 1)) : null;
        ww0 a2 = xw0Var2 != null ? xw0Var2.a(new eq(kqVar, wqVar, 2), new eq(kqVar, wqVar, 3)) : null;
        if (cx0Var.a.b() == cqVar) {
            dx0 dx0Var3 = wqVar.a;
        } else {
            dx0 dx0Var4 = wqVar.a;
        }
        y5 y5Var = new y5(a, a2, xw0Var3 != null ? xw0Var3.a(o1.x, new y5(r5, kqVar, wqVar, 6)) : null, 5);
        yf0 d3 = b50Var.d(j);
        long c2 = px0.c(d3.d, d3.e);
        long j2 = !iz.a(this.v, z6.a) ? this.v : c2;
        long d4 = vi.d(j, c2);
        o9 o9Var = this.w;
        return f40Var.h0((int) (d4 >> 32), (int) (d4 & 4294967295L), xpVar, new v9(d3, bz.c(o9Var != null ? o9Var.a(j2, d4, c10.d) : 0L, 0L), 0L, y5Var, 1));
    }
}
