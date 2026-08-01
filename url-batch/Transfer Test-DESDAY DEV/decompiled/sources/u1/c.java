package u1;

import java.util.concurrent.Executor;
import o1.AbstractC0299p;
import o1.H;
import s1.r;

/* loaded from: classes.dex */
public final class c extends H implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f3821c = new c();
    public static final AbstractC0299p d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [s1.g] */
    static {
        l lVar = l.f3834c;
        int i = r.f3716a;
        if (64 >= i) {
            i = 64;
        }
        int e2 = s1.a.e("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (e2 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + e2).toString());
        }
        if (e2 < k.d) {
            if (e2 < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + e2).toString());
            }
            lVar = new s1.g(lVar, e2);
        }
        d = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z(X0.j.f936a, runnable);
    }

    @Override // o1.AbstractC0299p
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // o1.AbstractC0299p
    public final void z(X0.i iVar, Runnable runnable) {
        d.z(iVar, runnable);
    }
}
