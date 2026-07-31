package yads;

import android.os.Handler;

/* loaded from: classes14.dex */
public final class l93 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = m93.i;
        if (handler != null) {
            handler.post(m93.j);
            m93.i.postDelayed(m93.k, 200L);
        }
    }
}
