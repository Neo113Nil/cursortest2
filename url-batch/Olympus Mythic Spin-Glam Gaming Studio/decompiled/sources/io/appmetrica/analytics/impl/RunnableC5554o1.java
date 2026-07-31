package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5554o1 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5554o1(C5736v1 c5736v1, Activity activity) {
        this.b = c5736v1;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1 c5736v1 = this.b;
        C5627ql c5627ql = c5736v1.h;
        Activity activity = this.a;
        InterfaceC5383hb interfaceC5383hb = c5736v1.c().a;
        if (activity != null) {
            c5627ql.f.a(activity);
        }
        if (c5627ql.e.a(activity, EnumC5578p.PAUSED)) {
            interfaceC5383hb.b(activity);
        }
    }
}
