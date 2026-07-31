package yads;

/* loaded from: classes5.dex */
public final class gu implements ys2 {
    public final hu b;
    public final xs2 c;
    public final int d;
    public boolean e;
    public final /* synthetic */ hu f;

    public gu(hu huVar, hu huVar2, xs2 xs2Var, int i) {
        this.f = huVar;
        this.b = huVar2;
        this.c = xs2Var;
        this.d = i;
    }

    @Override // yads.ys2
    public final void a() {
    }

    @Override // yads.ys2
    public final int b(long j) {
        if (this.f.d()) {
            return 0;
        }
        int b = this.c.b(j, this.f.x);
        xn xnVar = this.f.w;
        if (xnVar != null) {
            int a = xnVar.a(this.d + 1);
            xs2 xs2Var = this.c;
            b = Math.min(b, a - (xs2Var.q + xs2Var.s));
        }
        xs2 xs2Var2 = this.c;
        synchronized (xs2Var2) {
            if (b >= 0) {
                int i = xs2Var2.s + b;
                if (i <= xs2Var2.p) {
                    xs2Var2.s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        if (b > 0 && !this.e) {
            hu huVar = this.f;
            sm1 sm1Var = huVar.h;
            int[] iArr = huVar.c;
            int i2 = this.d;
            sm1Var.a(new yl1(1, iArr[i2], huVar.d[i2], 0, null, sm1Var.a(huVar.u), -9223372036854775807L));
            this.e = true;
        }
        return b;
    }

    @Override // yads.ys2
    public final boolean c() {
        return !this.f.d() && this.c.a(this.f.x);
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        if (this.f.d()) {
            return -3;
        }
        xn xnVar = this.f.w;
        if (xnVar != null) {
            int a = xnVar.a(this.d + 1);
            xs2 xs2Var = this.c;
            if (a <= xs2Var.q + xs2Var.s) {
                return -3;
            }
        }
        if (!this.e) {
            hu huVar = this.f;
            sm1 sm1Var = huVar.h;
            int[] iArr = huVar.c;
            int i2 = this.d;
            sm1Var.a(new yl1(1, iArr[i2], huVar.d[i2], 0, null, sm1Var.a(huVar.u), -9223372036854775807L));
            this.e = true;
        }
        return this.c.a(kw0Var, fb0Var, i, this.f.x);
    }
}
