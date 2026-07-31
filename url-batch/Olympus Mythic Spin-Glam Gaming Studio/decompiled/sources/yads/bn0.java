package yads;

/* loaded from: classes5.dex */
public final class bn0 implements ys2 {
    public final jw0 b;
    public long[] d;
    public boolean e;
    public cn0 f;
    public boolean g;
    public int h;
    public final an0 c = new an0();
    public long i = -9223372036854775807L;

    public bn0(cn0 cn0Var, jw0 jw0Var, boolean z) {
        this.b = jw0Var;
        this.f = cn0Var;
        this.d = cn0Var.b;
        a(cn0Var, z);
    }

    @Override // yads.ys2
    public final void a() {
    }

    public final void a(cn0 cn0Var, boolean z) {
        int i = this.h;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.d[i - 1];
        this.e = z;
        this.f = cn0Var;
        long[] jArr = cn0Var.b;
        this.d = jArr;
        long j3 = this.i;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.h = sb3.a(jArr, j2, false);
            }
        } else {
            int a = sb3.a(jArr, j3, true);
            this.h = a;
            if (this.e && a == this.d.length) {
                j = j3;
            }
            this.i = j;
        }
    }

    @Override // yads.ys2
    public final int b(long j) {
        int max = Math.max(this.h, sb3.a(this.d, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // yads.ys2
    public final boolean c() {
        return true;
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        int i2 = this.h;
        boolean z = i2 == this.d.length;
        if (z && !this.e) {
            fb0Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.g) {
            kw0Var.b = this.b;
            this.g = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.h = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.c.a(this.f.a[i2]);
            fb0Var.c(a.length);
            fb0Var.d.put(a);
        }
        fb0Var.f = this.d[i2];
        fb0Var.b = 1;
        return -4;
    }
}
