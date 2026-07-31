package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class ma3 implements c53 {
    public static final ma3 c = new ma3();
    public final List b;

    public ma3(s20 s20Var) {
        this.b = Collections.singletonList(s20Var);
    }

    @Override // yads.c53
    public final int a() {
        return 1;
    }

    @Override // yads.c53
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.c53
    public final List b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public ma3() {
        this.b = Collections.emptyList();
    }
}
