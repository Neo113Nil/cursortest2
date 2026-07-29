package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingScheduledExecutorService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = delegatingScheduledExecutorService;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$schedule$2;
        ScheduledFuture lambda$schedule$5;
        switch (this.a) {
            case 0:
                lambda$schedule$2 = this.b.lambda$schedule$2((Runnable) this.e, this.c, this.d, completer);
                return lambda$schedule$2;
            default:
                lambda$schedule$5 = this.b.lambda$schedule$5((Callable) this.e, this.c, this.d, completer);
                return lambda$schedule$5;
        }
    }
}
