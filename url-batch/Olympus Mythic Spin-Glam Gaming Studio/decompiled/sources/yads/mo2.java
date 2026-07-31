package yads;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class mo2 extends oo2 implements k30 {
    public final tx2 f;

    public mo2(jw0 jw0Var, l41 l41Var, tx2 tx2Var, ArrayList arrayList) {
        super(jw0Var, l41Var, tx2Var, arrayList);
        this.f = tx2Var;
    }

    @Override // yads.k30
    public final long a(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // yads.k30
    public final tl2 b(long j) {
        return this.f.a(this, j);
    }

    @Override // yads.oo2
    public final String c() {
        return null;
    }

    @Override // yads.oo2
    public final k30 d() {
        return this;
    }

    @Override // yads.oo2
    public final tl2 e() {
        return null;
    }

    @Override // yads.k30
    public final long a(long j) {
        return this.f.b(j);
    }

    @Override // yads.k30
    public final long b(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // yads.k30
    public final long c(long j, long j2) {
        return this.f.a(j, j2);
    }

    @Override // yads.k30
    public final long d(long j, long j2) {
        tx2 tx2Var = this.f;
        if (tx2Var.f != null) {
            return -9223372036854775807L;
        }
        long a = tx2Var.a(j, j2);
        long a2 = tx2Var.a(j);
        if (a2 == -1) {
            a2 = (int) (tx2Var.c((j2 - tx2Var.h) + tx2Var.i, j) - tx2Var.a(j, j2));
        }
        long j3 = a2 + a;
        return (tx2Var.b(j3, j) + tx2Var.b(j3)) - tx2Var.i;
    }

    @Override // yads.k30
    public final long e(long j, long j2) {
        long a = this.f.a(j);
        return a != -1 ? a : (int) (r0.c((j2 - r0.h) + r0.i, j) - r0.a(j, j2));
    }

    @Override // yads.k30
    public final boolean a() {
        return this.f.a();
    }

    @Override // yads.k30
    public final long b() {
        return this.f.d;
    }

    @Override // yads.k30
    public final long c(long j) {
        return this.f.a(j);
    }
}
