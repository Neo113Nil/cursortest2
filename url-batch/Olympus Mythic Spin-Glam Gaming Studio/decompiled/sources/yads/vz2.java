package yads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class vz2 implements s2 {
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public final t8 a;

    public vz2(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.s2
    public final long a() {
        Long l = this.a.s;
        return l != null ? l.longValue() : b;
    }

    @Override // yads.s2
    public final long a(long j) {
        Long l = this.a.s;
        return l != null ? Math.min(j, l.longValue()) : j;
    }
}
