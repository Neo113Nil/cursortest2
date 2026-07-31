package yads;

/* loaded from: classes14.dex */
public final class fk2 implements ys2 {
    public final int b;
    public final /* synthetic */ ik2 c;

    public fk2(ik2 ik2Var, int i) {
        this.c = ik2Var;
        this.b = i;
    }

    @Override // yads.ys2
    public final void a() {
        ik2 ik2Var = this.c;
        xs2 xs2Var = ik2Var.t[this.b];
        um0 um0Var = xs2Var.h;
        if (um0Var == null || um0Var.c() != 1) {
            ik2Var.l.a(ik2Var.e.a(ik2Var.C));
        } else {
            wk0 a = xs2Var.h.a();
            a.getClass();
            throw a;
        }
    }

    @Override // yads.ys2
    public final int b(long j) {
        ik2 ik2Var = this.c;
        int i = this.b;
        int i2 = 0;
        if (!ik2Var.E && ik2Var.I == -9223372036854775807L) {
            ik2Var.c();
            hk2 hk2Var = ik2Var.y;
            boolean[] zArr = hk2Var.d;
            if (!zArr[i]) {
                jw0 jw0Var = hk2Var.a.a(i).e[0];
                sm1 sm1Var = ik2Var.f;
                sm1Var.a(new yl1(1, vt1.d(jw0Var.m), jw0Var, 0, null, sm1Var.a(ik2Var.H), -9223372036854775807L));
                zArr[i] = true;
            }
            xs2 xs2Var = ik2Var.t[i];
            i2 = xs2Var.b(j, ik2Var.L);
            synchronized (xs2Var) {
                if (i2 >= 0) {
                    int i3 = xs2Var.s + i2;
                    if (i3 <= xs2Var.p) {
                        xs2Var.s = i3;
                    }
                }
                throw new IllegalArgumentException();
            }
            if (i2 == 0) {
                ik2Var.a(i);
            }
        }
        return i2;
    }

    @Override // yads.ys2
    public final boolean c() {
        ik2 ik2Var = this.c;
        return !ik2Var.E && ik2Var.I == -9223372036854775807L && ik2Var.t[this.b].a(ik2Var.L);
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        ik2 ik2Var = this.c;
        int i2 = this.b;
        if (ik2Var.E || ik2Var.I != -9223372036854775807L) {
            return -3;
        }
        ik2Var.c();
        hk2 hk2Var = ik2Var.y;
        boolean[] zArr = hk2Var.d;
        if (!zArr[i2]) {
            jw0 jw0Var = hk2Var.a.a(i2).e[0];
            sm1 sm1Var = ik2Var.f;
            sm1Var.a(new yl1(1, vt1.d(jw0Var.m), jw0Var, 0, null, sm1Var.a(ik2Var.H), -9223372036854775807L));
            zArr[i2] = true;
        }
        int a = ik2Var.t[i2].a(kw0Var, fb0Var, i, ik2Var.L);
        if (a == -3) {
            ik2Var.a(i2);
        }
        return a;
    }
}
