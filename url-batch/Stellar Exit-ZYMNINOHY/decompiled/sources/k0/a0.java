package k0;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f854a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f854a;
        D d2 = (D) threadLocal.get();
        if (d2 != null) {
            return d2;
        }
        C0044c c0044c = new C0044c(Thread.currentThread());
        threadLocal.set(c0044c);
        return c0044c;
    }
}
