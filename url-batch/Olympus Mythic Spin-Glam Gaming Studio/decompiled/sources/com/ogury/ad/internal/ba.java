package com.ogury.ad.internal;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ba extends a {
    public final /* synthetic */ ca a;

    public ba(ca caVar) {
        this.a = caVar;
    }

    @Override // com.ogury.ad.internal.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof o8) {
            return;
        }
        this.a.b.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof o8) {
            return;
        }
        ca caVar = this.a;
        if (caVar.c.a(activity)) {
            caVar.b.a(activity);
        }
    }
}
