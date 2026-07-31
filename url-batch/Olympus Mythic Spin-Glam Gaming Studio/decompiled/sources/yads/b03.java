package yads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class b03 implements yc0 {
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public final t8 a;

    public b03(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.yc0
    public final long a() {
        Long l = this.a.s;
        return l != null ? l.longValue() : b;
    }
}
