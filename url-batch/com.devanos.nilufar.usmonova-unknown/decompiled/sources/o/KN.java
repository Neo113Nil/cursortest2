package o;

import android.os.Process;

/* loaded from: classes.dex */
public final class KN extends Thread {
    public final int h;

    public KN(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.h = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.h);
        super.run();
    }
}
