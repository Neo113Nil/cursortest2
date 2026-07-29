package o;

import java.util.concurrent.Executor;

/* renamed from: o.xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2239xi implements Executor {
    public static final ExecutorC2239xi i = new ExecutorC2239xi(0);
    public static final /* synthetic */ ExecutorC2239xi j = new ExecutorC2239xi(1);
    public static final /* synthetic */ ExecutorC2239xi k = new ExecutorC2239xi(2);
    public final /* synthetic */ int h;

    public /* synthetic */ ExecutorC2239xi(int i2) {
        this.h = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.h) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
