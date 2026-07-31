package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class Y5 implements Runnable {
    public final List a;
    public final IHandlerExecutor b = Ka.k().w().a();
    public final WaitForActivationDelayBarrier c = Ka.k().a();

    public Y5(List list) {
        this.a = list;
    }

    public static final void a(Y5 y5) {
        Iterator it = y5.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.Y5$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                Y5.a(Y5.this);
            }
        });
    }
}
