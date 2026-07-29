package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingScheduledExecutorService b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = delegatingScheduledExecutorService;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$scheduleAtFixedRate$8;
        ScheduledFuture lambda$scheduleWithFixedDelay$11;
        switch (this.a) {
            case 0:
                lambda$scheduleAtFixedRate$8 = this.b.lambda$scheduleAtFixedRate$8(this.c, this.d, this.e, this.f, completer);
                return lambda$scheduleAtFixedRate$8;
            default:
                lambda$scheduleWithFixedDelay$11 = this.b.lambda$scheduleWithFixedDelay$11(this.c, this.d, this.e, this.f, completer);
                return lambda$scheduleWithFixedDelay$11;
        }
    }
}
