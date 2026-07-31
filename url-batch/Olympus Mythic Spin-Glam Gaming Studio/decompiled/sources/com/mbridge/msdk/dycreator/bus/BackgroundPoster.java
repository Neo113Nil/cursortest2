package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes6.dex */
final class BackgroundPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();
    private volatile boolean b;
    private final EventBus c;

    BackgroundPoster(EventBus eventBus) {
        this.c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.a.a(a);
                if (!this.b) {
                    this.b = true;
                    EventBus.n.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost a = this.a.a(1000);
                    if (a == null) {
                        synchronized (this) {
                            a = this.a.a();
                            if (a == null) {
                                this.b = false;
                                this.b = false;
                                return;
                            }
                        }
                    }
                    this.c.a(a);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.b = false;
                    return;
                }
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }
}
