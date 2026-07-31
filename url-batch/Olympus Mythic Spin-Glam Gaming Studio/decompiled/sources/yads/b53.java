package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class b53 implements c53 {
    public final s20[] b;
    public final long[] c;

    public b53(s20[] s20VarArr, long[] jArr) {
        this.b = s20VarArr;
        this.c = jArr;
    }

    @Override // yads.c53
    public final int a(long j) {
        int a = sb3.a(this.c, j, false);
        if (a < this.c.length) {
            return a;
        }
        return -1;
    }

    @Override // yads.c53
    public final List b(long j) {
        s20 s20Var;
        int b = sb3.b(this.c, j, false);
        return (b == -1 || (s20Var = this.b[b]) == s20.s) ? Collections.emptyList() : Collections.singletonList(s20Var);
    }

    @Override // yads.c53
    public final int a() {
        return this.c.length;
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i >= 0) {
            long[] jArr = this.c;
            if (i < jArr.length) {
                return jArr[i];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
