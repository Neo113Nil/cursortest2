package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i40 implements b10 {
    public final h40 d;

    public i40(h40 h40Var) {
        this.d = h40Var;
    }

    @Override // defpackage.b10
    public final long A() {
        h40 h40Var = this.d;
        return (h40Var.d << 32) | (h40Var.e & 4294967295L);
    }

    public final long a() {
        h40 h40Var = this.d;
        h40 y = d31.y(h40Var);
        return ra0.g(c(y.u, 0L), h40Var.r.E0(y.r, 0L));
    }

    @Override // defpackage.b10
    public final long b(long j) {
        return this.d.r.b(ra0.h(0L, a()));
    }

    public final long c(b10 b10Var, long j) {
        boolean z = b10Var instanceof i40;
        h40 h40Var = this.d;
        if (!z) {
            h40 y = d31.y(h40Var);
            ea0 ea0Var = y.r;
            long c = c(y.u, j);
            float f = (int) (y.s & 4294967295L);
            long g = ra0.g(c, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!ea0Var.v0().q) {
                cy.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            ea0Var.G0();
            ea0 ea0Var2 = ea0Var.t;
            if (ea0Var2 != null) {
                ea0Var = ea0Var2;
            }
            return ra0.h(g, ea0Var.E0(b10Var, 0L));
        }
        h40 h40Var2 = ((i40) b10Var).d;
        ea0 ea0Var3 = h40Var2.r;
        ea0Var3.G0();
        h40 t0 = h40Var.r.r0(ea0Var3).t0();
        if (t0 != null) {
            long b = bz.b(bz.c(h40Var2.n0(t0, false), nz.c0(j)), h40Var.n0(t0, false));
            return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
        }
        h40 y2 = d31.y(h40Var2);
        long c2 = bz.c(bz.c(h40Var2.n0(y2, false), y2.s), nz.c0(j));
        h40 y3 = d31.y(h40Var);
        long b2 = bz.b(c2, bz.c(h40Var.n0(y3, false), y3.s));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
        ea0 ea0Var4 = y3.r.t;
        ea0Var4.getClass();
        ea0 ea0Var5 = y2.r.t;
        ea0Var5.getClass();
        return ea0Var4.E0(ea0Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.b10
    public final long e(long j) {
        return this.d.r.e(ra0.h(j, a()));
    }

    @Override // defpackage.b10
    public final b10 g() {
        h40 t0;
        if (!v()) {
            cy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ea0 ea0Var = ((ea0) this.d.r.r.F.h).t;
        if (ea0Var == null || (t0 = ea0Var.t0()) == null) {
            return null;
        }
        return t0.u;
    }

    @Override // defpackage.b10
    public final long u(b10 b10Var, long j) {
        return c(b10Var, j);
    }

    @Override // defpackage.b10
    public final boolean v() {
        return this.d.r.v0().q;
    }

    @Override // defpackage.b10
    public final zi0 z(b10 b10Var, boolean z) {
        return this.d.r.z(b10Var, z);
    }
}
