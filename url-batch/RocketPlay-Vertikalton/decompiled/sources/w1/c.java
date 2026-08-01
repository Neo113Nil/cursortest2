package w1;

import E1.AbstractC0001b;
import java.util.concurrent.Executor;
import q1.AbstractC0349o;
import q1.E;
import u1.r;

/* loaded from: classes.dex */
public final class c extends E implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f4428c = new c();
    public static final AbstractC0349o d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [u1.g] */
    static {
        l lVar = l.f4441c;
        int i = r.f4203a;
        if (64 >= i) {
            i = 64;
        }
        int f2 = u1.a.f("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (f2 < 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("Expected positive parallelism level, but got ", f2).toString());
        }
        if (f2 < k.d) {
            if (f2 < 1) {
                throw new IllegalArgumentException(AbstractC0001b.f("Expected positive parallelism level, but got ", f2).toString());
            }
            lVar = new u1.g(lVar, f2);
        }
        d = lVar;
    }

    @Override // q1.AbstractC0349o
    public final void D(Z0.i iVar, Runnable runnable) {
        d.D(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D(Z0.j.f1558a, runnable);
    }

    @Override // q1.AbstractC0349o
    public final String toString() {
        return "Dispatchers.IO";
    }
}
