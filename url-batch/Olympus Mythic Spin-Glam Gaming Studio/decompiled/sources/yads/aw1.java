package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class aw1 implements c53 {
    public final List b;

    public aw1(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
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
    public final List b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
