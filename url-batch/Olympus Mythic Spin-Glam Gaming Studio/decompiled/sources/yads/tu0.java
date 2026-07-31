package yads;

/* loaded from: classes4.dex */
public final class tu0 implements ba2 {
    public final xu0 a;
    public final wu0 b;
    public long c = -1;
    public long d = -1;

    public tu0(xu0 xu0Var, wu0 wu0Var) {
        this.a = xu0Var;
        this.b = wu0Var;
    }

    @Override // yads.ba2
    public final long a(pd0 pd0Var) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.d = -1L;
        return j2;
    }

    @Override // yads.ba2
    public final void a(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[sb3.b(jArr, j, true)];
    }

    @Override // yads.ba2
    public final mx2 a() {
        long j = this.c;
        if (j != -1) {
            return new vu0(this.a, j);
        }
        throw new IllegalStateException();
    }
}
