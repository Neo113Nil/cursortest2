package com.ogury.ad.internal;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ca implements xa {
    public final Activity a;
    public final ia b;
    public final aa c;
    public final sh d;
    public final Application e;
    public ba f;

    public ca(Activity activity, ia adLayoutController, aa overlayActivityFilter) {
        sh topActivityMonitor = sh.a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adLayoutController, "adLayoutController");
        Intrinsics.checkNotNullParameter(overlayActivityFilter, "overlayActivityFilter");
        Intrinsics.checkNotNullParameter(topActivityMonitor, "topActivityMonitor");
        this.a = activity;
        this.b = adLayoutController;
        this.c = overlayActivityFilter;
        this.d = topActivityMonitor;
        this.e = activity.getApplication();
    }

    @Override // com.ogury.ad.internal.xa
    public final void a() {
        this.d.getClass();
        Activity activity = (Activity) sh.b.get();
        if (activity == null) {
            activity = this.a;
        }
        if (this.c.a(activity)) {
            this.b.a(activity);
        }
    }

    @Override // com.ogury.ad.internal.xa
    public final void b() {
        this.e.unregisterActivityLifecycleCallbacks(this.f);
    }

    @Override // com.ogury.ad.internal.xa
    public final void c() {
        ba baVar = new ba(this);
        this.f = baVar;
        this.e.registerActivityLifecycleCallbacks(baVar);
    }
}
