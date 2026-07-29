package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.al, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0729al implements Executor {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ ExecutorC0729al(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.h) {
            case 0:
                Handler handler = (Handler) this.i;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) this.i).execute(new RunnableC2154wP(runnable, 0));
                return;
            default:
                ((E20) this.i).post(runnable);
                return;
        }
    }

    public ExecutorC0729al() {
        this.h = 2;
        E20 e20 = new E20(Looper.getMainLooper());
        Looper.getMainLooper();
        this.i = e20;
    }
}
