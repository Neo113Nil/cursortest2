package yads;

/* loaded from: classes3.dex */
public final class ov implements ys2 {
    public final ys2 b;
    public boolean c;
    public final /* synthetic */ pv d;

    public ov(pv pvVar, ys2 ys2Var) {
        this.d = pvVar;
        this.b = ys2Var;
    }

    @Override // yads.ys2
    public final void a() {
        this.b.a();
    }

    @Override // yads.ys2
    public final int b(long j) {
        if (this.d.e != -9223372036854775807L) {
            return -3;
        }
        return this.b.b(j);
    }

    @Override // yads.ys2
    public final boolean c() {
        return this.d.e == -9223372036854775807L && this.b.c();
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        if (this.d.e != -9223372036854775807L) {
            return -3;
        }
        if (this.c) {
            fb0Var.b = 4;
            return -4;
        }
        int a = this.b.a(kw0Var, fb0Var, i);
        if (a != -5) {
            pv pvVar = this.d;
            long j = pvVar.g;
            if (j == Long.MIN_VALUE || ((a != -4 || fb0Var.f < j) && !(a == -3 && pvVar.getBufferedPositionUs() == Long.MIN_VALUE && !fb0Var.e))) {
                return a;
            }
            fb0Var.b();
            fb0Var.b = 4;
            this.c = true;
            return -4;
        }
        jw0 jw0Var = kw0Var.b;
        jw0Var.getClass();
        int i2 = jw0Var.C;
        if (i2 != 0 || jw0Var.D != 0) {
            pv pvVar2 = this.d;
            if (pvVar2.f != 0) {
                i2 = 0;
            }
            int i3 = pvVar2.g == Long.MIN_VALUE ? jw0Var.D : 0;
            iw0 iw0Var = new iw0(jw0Var);
            iw0Var.A = i2;
            iw0Var.B = i3;
            kw0Var.b = new jw0(iw0Var);
        }
        return -5;
    }
}
