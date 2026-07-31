package yads;

/* loaded from: classes6.dex */
public final class cy2 extends ns2 {
    public final fr i;
    public final ay2 j;
    public final byte[] k;
    public final or l;

    public cy2(by2 by2Var, fr frVar, ay2 ay2Var, byte[] bArr) {
        this.i = frVar;
        this.j = ay2Var;
        this.k = bArr;
        this.l = new or(frVar, by2Var.c, bArr, ay2Var);
    }

    @Override // yads.ns2
    public final void a() {
        this.l.j = true;
    }

    @Override // yads.ns2
    public final Object b() {
        float f;
        float f2;
        this.l.a();
        ay2 ay2Var = this.j;
        if (ay2Var == null) {
            return null;
        }
        int i = ay2Var.e + 1;
        ay2Var.e = i;
        yj0 yj0Var = ay2Var.a;
        long j = ay2Var.b;
        long j2 = ay2Var.d;
        if (j == -1 || j == 0) {
            int i2 = ay2Var.c;
            if (i2 != 0) {
                f2 = (i * 100.0f) / i2;
                yj0Var.a(j, j2, f2);
                return null;
            }
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        f2 = f;
        yj0Var.a(j, j2, f2);
        return null;
    }
}
