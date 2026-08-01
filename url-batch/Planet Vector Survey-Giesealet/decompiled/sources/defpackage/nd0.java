package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nd0 extends t50 implements i10, no {
    public md0 r;
    public boolean s;
    public o9 t;
    public y7 u;
    public float v;
    public q9 w;

    public static boolean j0(long j) {
        return !fr0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean k0(long j) {
        return !fr0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        nc ncVar = r10Var.d;
        long d = this.r.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(k0(d) ? Float.intBitsToFloat((int) (d >> 32)) : Float.intBitsToFloat((int) (ncVar.e.r() >> 32))) << 32) | (Float.floatToRawIntBits(j0(d) ? Float.intBitsToFloat((int) (d & 4294967295L)) : Float.intBitsToFloat((int) (ncVar.e.r() & 4294967295L))) & 4294967295L);
        long s = (Float.intBitsToFloat((int) (ncVar.e.r() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ncVar.e.r() & 4294967295L)) == 0.0f) ? 0L : yc0.s(floatToRawIntBits, this.u.f(floatToRawIntBits, ncVar.e.r()));
        long a = this.t.a((Math.round(Float.intBitsToFloat((int) (s >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (s & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (ncVar.e.r() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (ncVar.e.r() & 4294967295L))) & 4294967295L), r10Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((p01) ncVar.e.e).v(f, f2);
        try {
            this.r.c(r10Var, s, this.v, this.w);
            ((p01) ncVar.e.e).v(-f, -f2);
            r10Var.b();
        } catch (Throwable th) {
            ((p01) ncVar.e.e).v(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        long a;
        boolean z = false;
        boolean z2 = ui.d(j) && ui.c(j);
        if (ui.f(j) && ui.e(j)) {
            z = true;
        }
        if (((!this.s || this.r.d() == 9205357640488583168L) && z2) || z) {
            a = ui.a(j, ui.h(j), 0, ui.g(j), 0, 10);
        } else {
            long d = this.r.d();
            int round = k0(d) ? Math.round(Float.intBitsToFloat((int) (d >> 32))) : ui.j(j);
            int round2 = j0(d) ? Math.round(Float.intBitsToFloat((int) (d & 4294967295L))) : ui.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(vi.f(j, round)) << 32) | (Float.floatToRawIntBits(vi.e(j, round2)) & 4294967295L);
            if (this.s && this.r.d() != 9205357640488583168L) {
                float intBitsToFloat = !k0(this.r.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.r.d() >> 32));
                float intBitsToFloat2 = !j0(this.r.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.r.d() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : yc0.s(floatToRawIntBits2, this.u.f(floatToRawIntBits2, floatToRawIntBits));
            }
            a = ui.a(j, vi.f(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, vi.e(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
        }
        yf0 d2 = b50Var.d(a);
        return f40Var.h0(d2.d, d2.e, xp.d, new hq(d2, 3));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.r + ", sizeToIntrinsics=" + this.s + ", alignment=" + this.t + ", alpha=" + this.v + ", colorFilter=" + this.w + ')';
    }

    @Override // defpackage.no
    public final /* synthetic */ void R() {
    }
}
