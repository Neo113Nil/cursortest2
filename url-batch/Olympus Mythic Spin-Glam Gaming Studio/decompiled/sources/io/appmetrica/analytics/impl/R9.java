package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class R9 {
    public final ReentrantLock a;
    public final C5719ua b;

    public R9(Context context, String str) {
        this(new ReentrantLock(), new C5719ua(context, str));
    }

    public final void a() {
        this.a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.a.unlock();
    }

    public final void c() {
        C5719ua c5719ua = this.b;
        synchronized (c5719ua) {
            c5719ua.b();
            c5719ua.a.delete();
        }
        this.a.unlock();
    }

    public R9(ReentrantLock reentrantLock, C5719ua c5719ua) {
        this.a = reentrantLock;
        this.b = c5719ua;
    }
}
