package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class hw0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static pq a() {
        ThreadLocal threadLocal = a;
        pq pqVar = (pq) threadLocal.get();
        if (pqVar != null) {
            return pqVar;
        }
        t9 t9Var = new t9(Thread.currentThread());
        threadLocal.set(t9Var);
        return t9Var;
    }
}
