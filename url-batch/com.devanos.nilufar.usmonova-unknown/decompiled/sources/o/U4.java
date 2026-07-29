package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class U4 implements Executor {
    public final Object h = new Object();
    public final ArrayDeque i = new ArrayDeque();
    public final ExecutorC2239xi j;
    public Runnable k;

    public U4(ExecutorC2239xi executorC2239xi) {
        this.j = executorC2239xi;
    }

    public final void a() {
        synchronized (this.h) {
            try {
                Runnable runnable = (Runnable) this.i.poll();
                this.k = runnable;
                if (runnable != null) {
                    this.j.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.h) {
            try {
                this.i.add(new RunnableC1866s2(this, 3, runnable));
                if (this.k == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
