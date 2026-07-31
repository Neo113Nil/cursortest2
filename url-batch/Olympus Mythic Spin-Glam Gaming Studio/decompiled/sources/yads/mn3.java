package yads;

/* loaded from: classes12.dex */
public final class mn3 implements ln3 {
    public final wp0 a;
    public final c83 b;
    public final on3 c;
    public final jw0 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public mn3(wp0 wp0Var, c83 c83Var, on3 on3Var, String str, int i) {
        this.a = wp0Var;
        this.b = c83Var;
        this.c = on3Var;
        int i2 = (on3Var.a * on3Var.d) / 8;
        if (on3Var.c != i2) {
            throw new cc2("Expected block size: " + i2 + "; got: " + on3Var.c, null, true, 1);
        }
        int i3 = on3Var.b * i2;
        int i4 = i3 * 8;
        int max = Math.max(i2, i3 / 10);
        this.e = max;
        iw0 iw0Var = new iw0();
        iw0Var.k = str;
        iw0Var.f = i4;
        iw0Var.g = i4;
        iw0Var.l = max;
        iw0Var.x = on3Var.a;
        iw0Var.y = on3Var.b;
        iw0Var.z = i;
        this.d = new jw0(iw0Var);
    }

    @Override // yads.ln3
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // yads.ln3
    public final void a(int i, long j) {
        this.a.a(new rn3(this.c, 1, i, j));
        this.b.a(this.d);
    }

    @Override // yads.ln3
    public final boolean a(pd0 pd0Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int a = this.b.a(pd0Var, (int) Math.min(i2 - i, j2), true);
            if (a == -1) {
                j2 = 0;
            } else {
                this.g += a;
                j2 -= a;
            }
        }
        int i3 = this.c.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long a2 = this.f + sb3.a(this.h, 1000000L, r1.b);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(a2, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }
}
