package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nz extends Thread {
    public final int f;

    public nz(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f);
        super.run();
    }
}
