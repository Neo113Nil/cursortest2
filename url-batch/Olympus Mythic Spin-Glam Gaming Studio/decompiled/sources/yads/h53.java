package yads;

import java.util.List;

/* loaded from: classes13.dex */
public abstract class h53 extends iq implements c53 {
    public long c;
    public c53 d;
    public long e;

    @Override // yads.c53
    public final int a() {
        c53 c53Var = this.d;
        c53Var.getClass();
        return c53Var.a();
    }

    @Override // yads.c53
    public final List b(long j) {
        c53 c53Var = this.d;
        c53Var.getClass();
        return c53Var.b(j - this.e);
    }

    public abstract void b();

    @Override // yads.c53
    public final long a(int i) {
        c53 c53Var = this.d;
        c53Var.getClass();
        return c53Var.a(i) + this.e;
    }

    @Override // yads.c53
    public final int a(long j) {
        c53 c53Var = this.d;
        c53Var.getClass();
        return c53Var.a(j - this.e);
    }
}
