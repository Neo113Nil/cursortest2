package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class sh {
    public static final sh a = new sh();
    public static WeakReference b = new WeakReference(null);
    public static boolean c;

    public final synchronized void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!c) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                c = true;
                application.registerActivityLifecycleCallbacks(new rh());
            }
        }
    }
}
