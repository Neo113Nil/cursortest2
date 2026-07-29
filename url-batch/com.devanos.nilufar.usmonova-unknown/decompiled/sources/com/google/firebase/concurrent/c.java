package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Runnable i;
    public final /* synthetic */ DelegatingScheduledFuture.Completer j;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.h = i;
        this.i = runnable;
        this.j = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.i, this.j);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.i, this.j);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.i, this.j);
                break;
        }
    }
}
