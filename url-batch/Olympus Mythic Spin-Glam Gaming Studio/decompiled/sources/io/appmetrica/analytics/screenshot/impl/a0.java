package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ d0 a;

    public a0(d0 d0Var) {
        this.a = d0Var;
    }

    public static final Boolean a(d0 d0Var, a0 a0Var, C5877n c5877n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = CollectionsKt.emptyList();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C5886x) d0Var.b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(d0Var.c.postDelayed(a0Var, TimeUnit.SECONDS.toMillis(c5877n.b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C5877n c5877n = this.a.e;
        if (this.a.d || c5877n == null || !c5877n.a) {
            return;
        }
        Context context = this.a.a.getContext();
        final d0 d0Var = this.a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.screenshot.impl.a0$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return a0.a(d0.this, this, c5877n, (ActivityManager) obj);
            }
        });
    }
}
