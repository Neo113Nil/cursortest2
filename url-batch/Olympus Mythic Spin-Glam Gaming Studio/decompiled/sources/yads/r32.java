package yads;

/* loaded from: classes3.dex */
public final class r32 implements k73 {
    public final long a;
    public final /* synthetic */ s32 b;

    public r32(s32 s32Var, long j) {
        this.b = s32Var;
        this.a = j;
    }

    @Override // yads.k73
    public final void a(long j, long j2) {
        zj2 zj2Var = this.b.b;
        if (zj2Var != null) {
            long j3 = this.a;
            zj2Var.a(j3, j3 - j);
        }
    }
}
