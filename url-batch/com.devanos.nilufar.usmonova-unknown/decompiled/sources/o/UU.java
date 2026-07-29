package o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class UU {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final HO f;

    static {
        String str;
        int i = HU.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = AbstractC1035fP.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = HU.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = AbstractC1035fP.k("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = AbstractC1035fP.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(AbstractC1035fP.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = HO.F;
    }
}
