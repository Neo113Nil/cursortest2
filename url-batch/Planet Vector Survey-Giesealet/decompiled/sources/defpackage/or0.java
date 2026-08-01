package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class or0 {
    public sr0 a;
    public long b;
    public boolean c;
    public int d;

    public or0(long j, sr0 sr0Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = sr0Var;
        this.b = j;
        tn0 tn0Var = ur0.a;
        if (j != 0) {
            sr0 d = d();
            long j2 = d.f;
            long[] jArr = d.g;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.e;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.d;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (ur0.c) {
                i = ur0.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(or0 or0Var) {
        ur0.b.x(or0Var);
    }

    public final void a() {
        synchronized (ur0.c) {
            b();
            p();
        }
    }

    public void b() {
        ur0.d = ur0.d.b(g());
    }

    public abstract void c();

    public sr0 d() {
        return this.a;
    }

    public abstract mu e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract mu i();

    public final or0 j() {
        t7 t7Var = ur0.b;
        or0 or0Var = (or0) t7Var.o();
        t7Var.x(this);
        return or0Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(ht0 ht0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ur0.v(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(sr0 sr0Var) {
        this.a = sr0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract or0 u(mu muVar);
}
