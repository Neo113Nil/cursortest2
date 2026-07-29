package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Q {
    public static final Q d = new Q(null, null);
    public final Runnable a;
    public final Executor b;
    public Q c;

    public Q(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
