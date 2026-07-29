package o;

/* loaded from: classes.dex */
public abstract class EV {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC0454Rk a() {
        ThreadLocal threadLocal = a;
        AbstractC0454Rk abstractC0454Rk = (AbstractC0454Rk) threadLocal.get();
        if (abstractC0454Rk != null) {
            return abstractC0454Rk;
        }
        C1676p8 c1676p8 = new C1676p8(Thread.currentThread());
        threadLocal.set(c1676p8);
        return c1676p8;
    }
}
