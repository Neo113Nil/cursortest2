package com.ogury.ad.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class rh extends a {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        sh shVar = sh.a;
        sh.b = new WeakReference(activity);
    }
}
