package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m3 implements Executor {
    public final Object f = new Object();
    public final ArrayDeque g = new ArrayDeque();
    public final n3 h;
    public Runnable i;

    public m3(n3 n3Var) {
        this.h = n3Var;
    }

    public final void a() {
        synchronized (this.f) {
            try {
                Runnable runnable = (Runnable) this.g.poll();
                this.i = runnable;
                if (runnable != null) {
                    this.h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f) {
            try {
                this.g.add(new l3(this, runnable, 0));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
