package yads;

/* loaded from: classes3.dex */
public final class c32 implements s62 {
    public final j62 a;
    public vh3 b;

    public c32(j62 j62Var, vh3 vh3Var) {
        this.a = j62Var;
        this.b = vh3Var;
    }

    @Override // yads.s62
    public final void a() {
    }

    @Override // yads.s62
    public final void a(long j, long j2) {
    }

    @Override // yads.s62
    public final void b() {
        vh3 vh3Var = this.b;
        if (vh3Var != null) {
            vh3Var.onVideoComplete();
        }
    }
}
