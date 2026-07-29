package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ g(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$1;
        Object lambda$submit$12;
        switch (this.a) {
            case 0:
                lambda$submit$1 = LimitedConcurrencyExecutorService.lambda$submit$1(this.b);
                return lambda$submit$1;
            default:
                lambda$submit$12 = PausableExecutorServiceImpl.lambda$submit$1(this.b);
                return lambda$submit$12;
        }
    }
}
