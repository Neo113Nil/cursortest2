package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ DelegatingScheduledExecutorService i;
    public final /* synthetic */ Runnable j;
    public final /* synthetic */ DelegatingScheduledFuture.Completer k;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.h = i;
        this.i = delegatingScheduledExecutorService;
        this.j = runnable;
        this.k = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                this.i.lambda$scheduleWithFixedDelay$10(this.j, this.k);
                break;
            case 1:
                this.i.lambda$scheduleAtFixedRate$7(this.j, this.k);
                break;
            default:
                this.i.lambda$schedule$1(this.j, this.k);
                break;
        }
    }
}
