package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class xf0 implements sl {
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(xf0 xf0Var, yf0 yf0Var) {
        xf0Var.getClass();
        if (yf0Var instanceof g60) {
            ((g60) yf0Var).j(xf0Var.d);
        }
    }

    public static void g(xf0 xf0Var, yf0 yf0Var, int i, int i2) {
        xf0Var.getClass();
        b(xf0Var, yf0Var);
        yf0Var.M(bz.c((i2 & 4294967295L) | (i << 32), yf0Var.h), 0.0f, null);
    }

    public static void i(xf0 xf0Var, yf0 yf0Var, long j) {
        xf0Var.getClass();
        b(xf0Var, yf0Var);
        yf0Var.M(bz.c(j, yf0Var.h), 0.0f, null);
    }

    public static void j(xf0 xf0Var, yf0 yf0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (xf0Var.e() == c10.d || xf0Var.f() == 0) {
            b(xf0Var, yf0Var);
            yf0Var.M(bz.c(j, yf0Var.h), 0.0f, null);
        } else {
            int f = (xf0Var.f() - yf0Var.d) - ((int) (j >> 32));
            b(xf0Var, yf0Var);
            yf0Var.M(bz.c((f << 32) | (((int) (j & 4294967295L)) & 4294967295L), yf0Var.h), 0.0f, null);
        }
    }

    public static void l(xf0 xf0Var, yf0 yf0Var, int i, int i2) {
        int i3 = zf0.b;
        j80 j80Var = j80.u;
        long j = (i << 32) | (i2 & 4294967295L);
        if (xf0Var.e() == c10.d || xf0Var.f() == 0) {
            b(xf0Var, yf0Var);
            yf0Var.M(bz.c(j, yf0Var.h), 0.0f, j80Var);
        } else {
            int f = (xf0Var.f() - yf0Var.d) - ((int) (j >> 32));
            b(xf0Var, yf0Var);
            yf0Var.M(bz.c((f << 32) | (((int) (j & 4294967295L)) & 4294967295L), yf0Var.h), 0.0f, j80Var);
        }
    }

    public static void m(xf0 xf0Var, yf0 yf0Var, mu muVar) {
        xf0Var.getClass();
        b(xf0Var, yf0Var);
        yf0Var.M(bz.c(0L, yf0Var.h), 0.0f, muVar);
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / a(), this);
    }

    public float d(nw nwVar) {
        return Float.NaN;
    }

    public abstract c10 e();

    public abstract int f();

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
