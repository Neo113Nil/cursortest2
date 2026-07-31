package yads;

/* loaded from: classes5.dex */
public final class dj implements bj {
    public final int a;
    public final int b;
    public final xb2 c;

    public dj(xi xiVar, jw0 jw0Var) {
        xb2 xb2Var = xiVar.b;
        this.c = xb2Var;
        xb2Var.e(12);
        int n = xb2Var.n();
        if ("audio/raw".equals(jw0Var.m)) {
            int a = sb3.a(jw0Var.B, jw0Var.z);
            if (n == 0 || n % a != 0) {
                gh1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + a + ", stsz sample size: " + n);
                n = a;
            }
        }
        this.a = n == 0 ? -1 : n;
        this.b = xb2Var.n();
    }

    @Override // yads.bj
    public final int a() {
        return this.a;
    }

    @Override // yads.bj
    public final int b() {
        return this.b;
    }

    @Override // yads.bj
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.n() : i;
    }
}
