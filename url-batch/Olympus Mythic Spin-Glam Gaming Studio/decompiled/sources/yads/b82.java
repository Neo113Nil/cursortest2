package yads;

/* loaded from: classes12.dex */
public final class b82 implements pc2, k73 {
    public final long a;
    public final /* synthetic */ c82 b;

    public b82(c82 c82Var, long j) {
        this.b = c82Var;
        this.a = j;
    }

    @Override // yads.pc2
    public final void a() {
        c82 c82Var = this.b;
        zj2 zj2Var = c82Var.d;
        if (zj2Var != null) {
            zj2Var.a();
        }
        s3 s3Var = c82Var.b;
        if (s3Var != null) {
            s3Var.b();
        }
        c82Var.a.a.remove(c82Var);
        c82Var.b = null;
        c82Var.d = null;
    }

    @Override // yads.k73
    public final void a(long j, long j2) {
        zj2 zj2Var = this.b.d;
        if (zj2Var != null) {
            long j3 = this.a;
            zj2Var.a(j3, j3 - j);
        }
    }
}
