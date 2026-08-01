package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2325b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final n f2326c;
    public Runnable d;

    public m(n nVar) {
        this.f2326c = nVar;
    }

    public final void a() {
        synchronized (this.f2324a) {
            try {
                Runnable runnable = (Runnable) this.f2325b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f2326c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2324a) {
            try {
                this.f2325b.add(new B.o(this, 3, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
