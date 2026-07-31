package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes13.dex */
final class HandlerPoster extends Handler {
    private final PendingPostQueue a;
    private final int b;
    private final EventBus c;
    private boolean d;

    HandlerPoster(EventBus eventBus, Looper looper, int i) {
        super(looper);
        this.c = eventBus;
        this.b = i;
        this.a = new PendingPostQueue();
    }

    void a(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.a.a(a);
                if (!this.d) {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a = this.a.a();
                if (a == null) {
                    synchronized (this) {
                        a = this.a.a();
                        if (a == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.d = true;
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
