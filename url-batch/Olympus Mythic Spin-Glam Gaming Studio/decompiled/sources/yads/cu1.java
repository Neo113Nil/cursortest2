package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public final class cu1 {
    public final Executor a;
    public final ExecutorService b;

    public cu1() {
        Executor executor = new Executor() { // from class: yads.cu1$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                cu1.a(runnable);
            }
        };
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        this.a = executor;
        this.b = newFixedThreadPool;
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
