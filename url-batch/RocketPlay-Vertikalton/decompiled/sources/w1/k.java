package w1;

import java.util.concurrent.TimeUnit;
import u1.r;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4435a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4436b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4437c;
    public static final int d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4438e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f4439f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f4440g;
    public static final i h;

    static {
        String str;
        int i = r.f4203a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4435a = str;
        f4436b = u1.a.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = r.f4203a;
        if (i2 < 2) {
            i2 = 2;
        }
        f4437c = u1.a.f("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = u1.a.f("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f4438e = TimeUnit.SECONDS.toNanos(u1.a.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4439f = f.f4429a;
        f4440g = new i(0);
        h = new i(1);
    }
}
