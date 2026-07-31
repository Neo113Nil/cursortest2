package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5627ql {
    public final C5552o a;
    public final C5 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final C5605q e;
    public final C5500m f;
    public boolean g;

    public C5627ql(C5552o c5552o, C5500m c5500m) {
        this(c5552o, c5500m, new C5(), new C5605q());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C5 c5 = this.b;
            InterfaceC5749ve interfaceC5749ve = new InterfaceC5749ve() { // from class: io.appmetrica.analytics.impl.ql$$ExternalSyntheticLambda1
                @Override // io.appmetrica.analytics.impl.InterfaceC5749ve
                public final void consume(Object obj) {
                    C5627ql.this.a(activity, (Dc) obj);
                }
            };
            c5.getClass();
            C5661s4.l().c.a().execute(new B5(c5, interfaceC5749ve));
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C5 c5 = this.b;
            InterfaceC5749ve interfaceC5749ve = new InterfaceC5749ve() { // from class: io.appmetrica.analytics.impl.ql$$ExternalSyntheticLambda0
                @Override // io.appmetrica.analytics.impl.InterfaceC5749ve
                public final void consume(Object obj) {
                    C5627ql.this.b(activity, (Dc) obj);
                }
            };
            c5.getClass();
            C5661s4.l().c.a().execute(new B5(c5, interfaceC5749ve));
        }
    }

    public C5627ql(C5552o c5552o, C5500m c5500m, C5 c5, C5605q c5605q) {
        this.g = false;
        this.a = c5552o;
        this.f = c5500m;
        this.b = c5;
        this.e = c5605q;
        this.c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.ql$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                C5627ql.this.a(activity, activityEvent);
            }
        };
        this.d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.ql$$ExternalSyntheticLambda3
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                C5627ql.this.b(activity, activityEvent);
            }
        };
    }

    public final void b(Activity activity, Dc dc) {
        if (this.g && this.e.a(activity, EnumC5578p.PAUSED)) {
            dc.b(activity);
        }
    }

    public final void a(Activity activity, Dc dc) {
        if (this.g && this.e.a(activity, EnumC5578p.RESUMED)) {
            dc.a(activity);
        }
    }

    public final synchronized EnumC5526n a() {
        try {
            if (!this.g) {
                this.a.registerListener(this.c, ActivityEvent.RESUMED);
                this.a.registerListener(this.d, ActivityEvent.PAUSED);
                this.g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.b;
    }
}
