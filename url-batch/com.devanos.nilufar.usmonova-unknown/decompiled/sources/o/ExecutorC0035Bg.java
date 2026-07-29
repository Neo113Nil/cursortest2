package o;

import java.util.concurrent.Executor;

/* renamed from: o.Bg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0035Bg extends AbstractC0795bl implements Executor {
    public static final ExecutorC0035Bg j = new ExecutorC0035Bg();
    public static final AbstractC0267Ke k;

    static {
        C0978eY c0978eY = C0978eY.j;
        int i = HU.a;
        if (64 >= i) {
            i = 64;
        }
        k = c0978eY.N(AbstractC1035fP.k("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        k.L(interfaceC0189He, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        L(C1188hk.h, runnable);
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        return "Dispatchers.IO";
    }
}
