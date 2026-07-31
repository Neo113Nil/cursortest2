package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes9.dex */
public final class U5 {
    public final C5552o a;
    public final IReporter b;
    public Context c;
    public final T5 d;

    public U5(C5552o c5552o) {
        this(c5552o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.a.a(applicationContext);
            this.a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.c = applicationContext;
        }
    }

    public U5(C5552o c5552o, IReporter iReporter) {
        this.a = c5552o;
        this.b = iReporter;
        this.d = new T5(this);
    }

    public /* synthetic */ U5(C5552o c5552o, int i) {
        this(c5552o, AbstractC5840z1.a());
    }

    public final synchronized Context a() {
        return this.c;
    }
}
