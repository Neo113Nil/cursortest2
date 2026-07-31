package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5268d extends Thread {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final /* synthetic */ C5293e b;

    public C5268d(C5293e c5293e) {
        this.b = c5293e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.a.get()) {
            this.b.e.set(false);
            C5293e c5293e = this.b;
            c5293e.c.postAtFrontOfQueue(c5293e.f);
            int i = this.b.b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C5293e.g);
                    if (this.b.e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.b.a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5242c) it.next()).onAppNotResponding();
                }
            }
            while (!this.b.e.get()) {
                try {
                    Thread.sleep(C5293e.g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
