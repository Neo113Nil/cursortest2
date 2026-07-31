package yads;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class xx extends zx {
    @Override // yads.zx
    public final int a() {
        return 0;
    }

    @Override // yads.zx
    public final zx a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.zx
    public final zx b(boolean z, boolean z2) {
        return a(bq.a(z2, z));
    }

    @Override // yads.zx
    public final zx a(int i, int i2) {
        return a(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // yads.zx
    public final zx a(long j, long j2) {
        return a(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // yads.zx
    public final zx a(boolean z, boolean z2) {
        return a(bq.a(z, z2));
    }

    public static zx a(int i) {
        if (i < 0) {
            return zx.b;
        }
        return i > 0 ? zx.c : zx.a;
    }
}
