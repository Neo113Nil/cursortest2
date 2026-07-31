package yads;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class cd0 extends yn {
    public final bd0 e;

    public cd0(bd0 bd0Var, long j, long j2) {
        super(j, j2);
        this.e = bd0Var;
    }

    @Override // yads.sj1
    public final long a() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
        return this.e.a(j);
    }

    @Override // yads.sj1
    public final long b() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
        bd0 bd0Var = this.e;
        return bd0Var.d.a(j - bd0Var.f);
    }
}
