package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d9 extends t50 implements no, pa0 {
    public long r;
    public px0 s;
    public float t;
    public rq0 u;
    public long v;
    public c10 w;
    public xc0 x;
    public rq0 y;

    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    @Override // defpackage.no
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(r10 r10Var) {
        char c;
        long j;
        px0 px0Var;
        px0 px0Var2;
        e5 e5Var;
        nc ncVar = r10Var.d;
        if (this.u == px0.f) {
            if (!ge.c(this.r, ge.g)) {
                y6.q(r10Var, this.r, 0L, 126);
            }
            px0 px0Var3 = this.s;
            if (px0Var3 != null) {
                y6.p(r10Var, px0Var3, 0L, 0L, this.t, null, 118);
            }
        } else {
            ar arVar = ar.o;
            gj0 gj0Var = new gj0();
            if (fr0.b(ncVar.e.r(), this.v) && r10Var.getLayoutDirection() == this.w && nz.l(this.y, this.u)) {
                xc0 xc0Var = this.x;
                xc0Var.getClass();
                gj0Var.d = xc0Var;
            } else {
                nk.H(this, new c9(gj0Var, this, r10Var, 0));
            }
            this.x = (xc0) gj0Var.d;
            this.v = ncVar.e.r();
            this.w = r10Var.getLayoutDirection();
            this.y = this.u;
            Object obj = gj0Var.d;
            obj.getClass();
            xc0 xc0Var2 = (xc0) obj;
            if (!ge.c(this.r, ge.g)) {
                long j2 = this.r;
                if (xc0Var2 instanceof vc0) {
                    zi0 zi0Var = ((vc0) xc0Var2).a;
                    float f = zi0Var.a;
                    float f2 = zi0Var.b;
                    r10Var.p(j2, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), yc0.r(zi0Var), arVar, 3);
                    arVar = arVar;
                } else {
                    if (xc0Var2 instanceof wc0) {
                        wc0 wc0Var = (wc0) xc0Var2;
                        e5 e5Var2 = wc0Var.b;
                        if (e5Var2 != null) {
                            r10Var.e(e5Var2, j2, arVar);
                        } else {
                            zl0 zl0Var = wc0Var.a;
                            float f3 = zl0Var.b;
                            float f4 = zl0Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (zl0Var.h >> 32));
                            c = ' ';
                            j = 4294967295L;
                            float f5 = zl0Var.c - f4;
                            float f6 = zl0Var.d - f3;
                            r10Var.U(j2, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), arVar);
                            arVar = arVar;
                        }
                    } else {
                        c = ' ';
                        j = 4294967295L;
                        if (!(xc0Var2 instanceof uc0)) {
                            g8.c();
                            return;
                        }
                        r10Var.e(((uc0) xc0Var2).a, j2, arVar);
                    }
                    px0Var = this.s;
                    if (px0Var != null) {
                        float f7 = this.t;
                        if (xc0Var2 instanceof vc0) {
                            zi0 zi0Var2 = ((vc0) xc0Var2).a;
                            float f8 = zi0Var2.a;
                            float f9 = zi0Var2.b;
                            r10Var.f(px0Var, (Float.floatToRawIntBits(f9) & j) | (Float.floatToRawIntBits(f8) << c), yc0.r(zi0Var2), f7, arVar);
                        } else {
                            if (xc0Var2 instanceof wc0) {
                                wc0 wc0Var2 = (wc0) xc0Var2;
                                px0Var2 = px0Var;
                                e5Var = wc0Var2.b;
                                if (e5Var == null) {
                                    zl0 zl0Var2 = wc0Var2.a;
                                    float f10 = zl0Var2.b;
                                    float f11 = zl0Var2.a;
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (zl0Var2.h >> c));
                                    float f12 = zl0Var2.c - f11;
                                    float f13 = zl0Var2.d - f10;
                                    r10Var.J(px0Var2, (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f10) & j), (Float.floatToRawIntBits(f12) << c) | (Float.floatToRawIntBits(f13) & j), (Float.floatToRawIntBits(intBitsToFloat2) & j) | (Float.floatToRawIntBits(intBitsToFloat2) << c), f7, arVar);
                                }
                            } else if (!(xc0Var2 instanceof uc0)) {
                                g8.c();
                                return;
                            } else {
                                px0Var2 = px0Var;
                                e5Var = ((uc0) xc0Var2).a;
                            }
                            r10Var.F(e5Var, px0Var2, f7, arVar, 3);
                        }
                    }
                }
            }
            c = ' ';
            j = 4294967295L;
            px0Var = this.s;
            if (px0Var != null) {
            }
        }
        r10Var.b();
    }

    @Override // defpackage.pa0
    public final void u() {
        this.v = 9205357640488583168L;
        this.w = null;
        this.x = null;
        this.y = null;
        mz.H(this);
    }

    @Override // defpackage.no
    public final /* synthetic */ void R() {
    }
}
