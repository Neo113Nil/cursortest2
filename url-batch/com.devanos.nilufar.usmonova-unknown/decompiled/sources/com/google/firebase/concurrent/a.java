package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ((CustomThreadFactory) this.i).lambda$newThread$0((Runnable) this.j);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) this.i, (DelegatingScheduledFuture.Completer) this.j);
                break;
            default:
                ((LimitedConcurrencyExecutor) this.i).lambda$decorate$0((Runnable) this.j);
                break;
        }
    }
}
