package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5774wd {
    public final Executor a;
    public final Ol b;
    public final String c;
    public final SystemTimeProvider d;

    public C5774wd(IHandlerExecutor iHandlerExecutor, Sd sd, String str, SystemTimeProvider systemTimeProvider) {
        this.a = iHandlerExecutor;
        this.b = sd;
        this.c = str;
        this.d = systemTimeProvider;
    }

    public static final void a(C5774wd c5774wd, List list) {
        C5340fk c5340fk = Dj.a;
        C5826yd c5826yd = new C5826yd(c5774wd.b, c5774wd.c, c5774wd.d, list);
        c5340fk.getClass();
        c5340fk.a(new Tj(c5826yd));
    }

    public final void a(final ArrayList arrayList) {
        this.a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.wd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5774wd.a(C5774wd.this, arrayList);
            }
        });
    }
}
