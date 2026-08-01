package q1;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3888a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f3888a;
        D d = (D) threadLocal.get();
        if (d != null) {
            return d;
        }
        C0337c c0337c = new C0337c(Thread.currentThread());
        threadLocal.set(c0337c);
        return c0337c;
    }
}
