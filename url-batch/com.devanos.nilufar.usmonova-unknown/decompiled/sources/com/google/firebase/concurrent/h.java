package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Runnable runnable, Object obj, int i) {
        this.a = i;
        this.b = runnable;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$0;
        Object lambda$submit$02;
        switch (this.a) {
            case 0:
                lambda$submit$0 = LimitedConcurrencyExecutorService.lambda$submit$0(this.b, this.c);
                return lambda$submit$0;
            default:
                lambda$submit$02 = PausableExecutorServiceImpl.lambda$submit$0(this.b, this.c);
                return lambda$submit$02;
        }
    }
}
