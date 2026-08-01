package com.luckycounter.drinkwater;

import G0.o;
import P0.ViewOnClickListenerC0033a;
import S0.m;
import T0.f;
import V0.g;
import android.os.Bundle;
import g.AbstractActivityC0129i;

/* loaded from: classes.dex */
public final class TargetCrashActivity extends AbstractActivityC0129i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2485z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2486y = new g(new m(this, 0));

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1159a);
        t().f1161c.setOnAnimationEnd(new m(this, 1));
        t().f1160b.setOnClickListener(new ViewOnClickListenerC0033a(4, this));
        t().f1161c.post(new o(6, this));
    }

    public final f t() {
        return (f) this.f2486y.a();
    }
}
