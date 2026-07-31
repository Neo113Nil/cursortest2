package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Bi {
    public final HashMap a = new HashMap();
    public final B0 b;

    public Bi(B0 b0) {
        this.b = b0;
    }

    public static Bi a() {
        return Ai.a;
    }

    public final C5701ti a(Context context, String str) {
        C5701ti c5701ti = (C5701ti) this.a.get(str);
        if (c5701ti == null) {
            synchronized (this.a) {
                try {
                    c5701ti = (C5701ti) this.a.get(str);
                    if (c5701ti == null) {
                        IHandlerExecutor a = C5661s4.l().c.a();
                        this.b.getClass();
                        if (A0.e == null) {
                            ((U9) a).b.post(new RunnableC5857zi(this, context));
                        }
                        c5701ti = new C5701ti(context.getApplicationContext(), str, new B0());
                        this.a.put(str, c5701ti);
                        c5701ti.c(str);
                    }
                } finally {
                }
            }
        }
        return c5701ti;
    }
}
