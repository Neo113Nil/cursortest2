package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ok implements x6 {
    public final k2 a;
    public final j3 b;
    public final Object c;
    public final i7 d;
    public final i7 e;
    public final i7 f;
    public final Object g;
    public final long h;

    public ok(p01 p01Var, j3 j3Var, Object obj, i7 i7Var) {
        k2 k2Var = new k2((p01) p01Var.e);
        this.a = k2Var;
        this.b = j3Var;
        this.c = obj;
        i7 i7Var2 = (i7) ((mu) j3Var.e).c(obj);
        this.d = i7Var2;
        this.e = mz.y(i7Var);
        mu muVar = (mu) j3Var.f;
        if (((i7) k2Var.g) == null) {
            k2Var.g = i7Var2.c();
        }
        i7 i7Var3 = (i7) k2Var.g;
        if (i7Var3 == null) {
            nz.f0("targetVector");
            throw null;
        }
        int b = i7Var3.b();
        int i = 0;
        while (true) {
            i7 i7Var4 = (i7) k2Var.g;
            if (i >= b) {
                if (i7Var4 == null) {
                    nz.f0("targetVector");
                    throw null;
                }
                this.g = muVar.c(i7Var4);
                k2 k2Var2 = this.a;
                i7 i7Var5 = this.d;
                if (((i7) k2Var2.f) == null) {
                    k2Var2.f = i7Var5.c();
                }
                i7 i7Var6 = (i7) k2Var2.f;
                if (i7Var6 == null) {
                    nz.f0("velocityVector");
                    throw null;
                }
                int b2 = i7Var6.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    p01 p01Var2 = (p01) k2Var2.d;
                    i7Var5.getClass();
                    j = Math.max(j, ((long) (Math.exp(((ir) p01Var2.e).b(i7Var.a(i2)) / (jr.a - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = j;
                i7 y = mz.y(this.a.f(j, this.d, i7Var));
                this.f = y;
                int b3 = y.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    i7 i7Var7 = this.f;
                    float a = i7Var7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    i7Var7.e(rg0.f(a, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (i7Var4 == null) {
                nz.f0("targetVector");
                throw null;
            }
            p01 p01Var3 = (p01) k2Var.d;
            float a2 = i7Var2.a(i);
            float a3 = i7Var.a(i);
            double b4 = ((ir) p01Var3.e).b(a3);
            double d = jr.a;
            int i4 = i;
            i7Var4.e((Math.signum(a3) * ((float) (Math.exp((d / (d - 1.0d)) * b4) * r13.a * r13.b))) + a2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.x6
    public final boolean a() {
        return false;
    }

    @Override // defpackage.x6
    public final Object b(long j) {
        if (y6.a(this, j)) {
            return this.g;
        }
        mu muVar = (mu) this.b.f;
        k2 k2Var = this.a;
        i7 i7Var = (i7) k2Var.e;
        i7 i7Var2 = this.d;
        if (i7Var == null) {
            k2Var.e = i7Var2.c();
        }
        i7 i7Var3 = (i7) k2Var.e;
        if (i7Var3 == null) {
            nz.f0("valueVector");
            throw null;
        }
        int b = i7Var3.b();
        int i = 0;
        while (true) {
            i7 i7Var4 = (i7) k2Var.e;
            if (i >= b) {
                if (i7Var4 != null) {
                    return muVar.c(i7Var4);
                }
                nz.f0("valueVector");
                throw null;
            }
            if (i7Var4 == null) {
                nz.f0("valueVector");
                throw null;
            }
            p01 p01Var = (p01) k2Var.d;
            float a = i7Var2.a(i);
            long j2 = j / 1000000;
            hr a2 = ((ir) p01Var.e).a(this.e.a(i));
            long j3 = a2.c;
            i7Var4.e((Math.signum(a2.a) * a2.b * t4.a(j3 > 0 ? j2 / j3 : 1.0f).a) + a, i);
            i++;
        }
    }

    @Override // defpackage.x6
    public final long c() {
        return this.h;
    }

    @Override // defpackage.x6
    public final j3 d() {
        return this.b;
    }

    @Override // defpackage.x6
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.x6
    public final i7 f(long j) {
        if (y6.a(this, j)) {
            return this.f;
        }
        return this.a.f(j, this.d, this.e);
    }

    @Override // defpackage.x6
    public final /* synthetic */ boolean g(long j) {
        return y6.a(this, j);
    }
}
