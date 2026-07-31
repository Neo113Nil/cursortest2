package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5608q2 {
    public final Cc a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d = true;
    public final Runnable e = new Runnable() { // from class: io.appmetrica.analytics.impl.q2$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            C5608q2.a(C5608q2.this);
        }
    };

    public C5608q2(Cc cc, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = cc;
        this.b = iHandlerExecutor;
        this.c = j;
    }

    public static final void a(C5608q2 c5608q2) {
        Dc dc = c5608q2.a.a;
        Ji ji = dc.h;
        ji.c.a(dc.b.a);
    }
}
