package yads;

import java.util.List;

/* loaded from: classes5.dex */
public final class bp0 implements c53 {
    public final long b;
    public final um2 c;

    public bp0(long j, um2 um2Var) {
        this.b = j;
        this.c = um2Var;
    }

    @Override // yads.c53
    public final int a() {
        return 1;
    }

    @Override // yads.c53
    public final int a(long j) {
        return this.b > j ? 0 : -1;
    }

    @Override // yads.c53
    public final List b(long j) {
        if (j >= this.b) {
            return this.c;
        }
        i41 i41Var = l41.c;
        return um2.f;
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i == 0) {
            return this.b;
        }
        throw new IllegalArgumentException();
    }
}
