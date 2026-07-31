package com.my.target;

import android.os.Handler;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class t3 {
    private final Handler a;
    private Runnable b;

    private t3(Handler handler) {
        this.a = handler;
    }

    public static t3 a(Handler handler) {
        return new t3(handler);
    }

    public synchronized void b() {
        Runnable runnable = this.b;
        a();
        if (runnable != null) {
            this.a.post(runnable);
        }
    }

    public synchronized void a(long j, final Runnable runnable) {
        a();
        Runnable runnable2 = new Runnable() { // from class: com.my.target.t3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                t3.a(runnable);
            }
        };
        this.b = runnable2;
        this.a.postDelayed(runnable2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            mi.b("Unexpected exception: " + th.getMessage() + "\nexception=" + gi.b(th));
        }
    }

    public synchronized void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.b = null;
        }
    }
}
