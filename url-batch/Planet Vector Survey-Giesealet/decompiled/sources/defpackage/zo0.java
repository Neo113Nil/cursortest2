package defpackage;

import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zo0 {
    public ro0 a;
    public bd0 b;
    public j3 c;
    public sc0 d;
    public boolean e;
    public k2 f;
    public int g = 1;
    public do0 h = a.a;
    public final xo0 i = new xo0(this);
    public final f2 j = new f2(21, this);

    public zo0(ro0 ro0Var, bd0 bd0Var, j3 j3Var, sc0 sc0Var, boolean z, k2 k2Var) {
        this.a = ro0Var;
        this.b = bd0Var;
        this.c = j3Var;
        this.d = sc0Var;
        this.e = z;
        this.f = k2Var;
    }

    public static final long a(zo0 zo0Var, do0 do0Var, long j, int i) {
        y90 y90Var = (y90) zo0Var.f.d;
        y90 y90Var2 = null;
        y90 y90Var3 = (y90Var == null || !y90Var.q) ? null : (y90) yc0.d(y90Var);
        long n0 = y90Var3 != null ? y90Var3.n0(j, i) : 0L;
        long g = ra0.g(j, n0);
        long d = zo0Var.d(zo0Var.g(do0Var.a(zo0Var.f(zo0Var.d(ra0.a(g, zo0Var.d == sc0.e ? 1 : 2))))));
        long g2 = ra0.g(g, d);
        y90 y90Var4 = (y90) zo0Var.f.d;
        if (y90Var4 != null && y90Var4.q) {
            y90Var2 = (y90) yc0.d(y90Var4);
        }
        y90 y90Var5 = y90Var2;
        return ra0.h(ra0.h(n0, d), y90Var5 != null ? y90Var5.l0(d, g2, i) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, lj ljVar) {
        uo0 uo0Var;
        int i;
        fj0 fj0Var;
        if (ljVar instanceof uo0) {
            uo0Var = (uo0) ljVar;
            int i2 = uo0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uo0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = uo0Var.e;
                i = uo0Var.g;
                if (i != 0) {
                    rg0.u(obj);
                    fj0 fj0Var2 = new fj0();
                    fj0Var2.d = j;
                    qu wo0Var = new wo0(this, fj0Var2, j, null);
                    uo0Var.d = fj0Var2;
                    uo0Var.g = 1;
                    Object e = e(1, wo0Var, uo0Var);
                    Object obj2 = ck.d;
                    if (e == obj2) {
                        return obj2;
                    }
                    fj0Var = fj0Var2;
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fj0Var = uo0Var.d;
                    rg0.u(obj);
                }
                return new mz0(fj0Var.d);
            }
        }
        uo0Var = new uo0(this, ljVar);
        Object obj3 = uo0Var.e;
        i = uo0Var.g;
        if (i != 0) {
        }
        return new mz0(fj0Var.d);
    }

    public final float c(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long d(long j) {
        return this.e ? ra0.i(j, -1.0f) : j;
    }

    public final Object e(int i, qu quVar, lj ljVar) {
        Object b = this.a.b(i, new u6(this, quVar, (kj) null, 11), ljVar);
        return b == ck.d ? b : ky0.a;
    }

    public final float f(long j) {
        return this.d == sc0.e ? ra0.d(j) : ra0.e(j);
    }

    public final long g(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == sc0.e ? mz.o(f, 0.0f) : mz.o(0.0f, f);
    }
}
