package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class g implements Runnable {
    public final /* synthetic */ p a;

    public g(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.a);
        Handler handler = this.a.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.a.o = null;
        }
        this.a.n = null;
        Looper.myLooper().quit();
    }
}
