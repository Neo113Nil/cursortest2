package yads;

/* loaded from: classes15.dex */
public final class fe0 implements tj1 {
    public final u33 b;
    public final fo0 c;
    public fo d;
    public tj1 e;
    public boolean f = true;
    public boolean g;

    public fe0(fo0 fo0Var, p53 p53Var) {
        this.c = fo0Var;
        this.b = new u33(p53Var);
    }

    @Override // yads.tj1
    public final long a() {
        if (this.f) {
            return this.b.a();
        }
        tj1 tj1Var = this.e;
        tj1Var.getClass();
        return tj1Var.a();
    }

    @Override // yads.tj1
    public final re2 getPlaybackParameters() {
        tj1 tj1Var = this.e;
        return tj1Var != null ? tj1Var.getPlaybackParameters() : this.b.f;
    }

    @Override // yads.tj1
    public final void a(re2 re2Var) {
        tj1 tj1Var = this.e;
        if (tj1Var != null) {
            tj1Var.a(re2Var);
            re2Var = this.e.getPlaybackParameters();
        }
        this.b.a(re2Var);
    }
}
