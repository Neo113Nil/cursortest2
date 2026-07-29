package o;

import android.os.Process;

/* renamed from: o.wP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2154wP implements Runnable {
    public final /* synthetic */ int h;
    public final Runnable i;

    public /* synthetic */ RunnableC2154wP(Runnable runnable, int i) {
        this.h = i;
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                try {
                    this.i.run();
                    break;
                } catch (Exception e) {
                    AbstractC0868ct.r("Executor", "Background execution failure.", e);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.i.run();
                break;
        }
    }
}
