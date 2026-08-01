package o1;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3312a = new ThreadLocal();

    public static G a() {
        ThreadLocal threadLocal = f3312a;
        G g2 = (G) threadLocal.get();
        if (g2 != null) {
            return g2;
        }
        C0286c c0286c = new C0286c(Thread.currentThread());
        threadLocal.set(c0286c);
        return c0286c;
    }
}
