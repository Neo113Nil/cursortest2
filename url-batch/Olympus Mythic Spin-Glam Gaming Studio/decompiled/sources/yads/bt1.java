package yads;

/* loaded from: classes5.dex */
public final class bt1 implements ys2 {
    public final ys2 b;
    public final long c;

    public bt1(ys2 ys2Var, long j) {
        this.b = ys2Var;
        this.c = j;
    }

    @Override // yads.ys2
    public final void a() {
        this.b.a();
    }

    @Override // yads.ys2
    public final int b(long j) {
        return this.b.b(j - this.c);
    }

    @Override // yads.ys2
    public final boolean c() {
        return this.b.c();
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        int a = this.b.a(kw0Var, fb0Var, i);
        if (a == -4) {
            fb0Var.f = Math.max(0L, fb0Var.f + this.c);
        }
        return a;
    }
}
