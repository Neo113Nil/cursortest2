package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cl extends vq implements Executor {
    public static final cl f = new cl();
    public static final uj g;

    static {
        ly0 ly0Var = ly0.f;
        int i = ru0.a;
        if (64 >= i) {
            i = 64;
        }
        g = ly0Var.j(rg0.t(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        g.d(rjVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(up.d, runnable);
    }

    @Override // defpackage.uj
    public final String toString() {
        return "Dispatchers.IO";
    }
}
