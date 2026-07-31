package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class H1 implements Application.ActivityLifecycleCallbacks {
    public final G1 a;
    public WeakReference b;
    public final /* synthetic */ Context c;

    public H1(Context context) {
        this.c = context;
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
        this.a = new G1(mainLooper);
    }

    public static final void a(Context context, H1 h1) {
        if (I1.a(context) || h1.b != null) {
            return;
        }
        h1.a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.b;
        if (!Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.b = new WeakReference(activity);
        }
        this.a.removeMessages(1001);
        this.a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.b;
        if (!Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.b = new WeakReference(activity);
        }
        this.a.removeMessages(1001);
        this.a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.b;
        if (Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.b == null) {
            final Context context = this.c;
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.H1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    H1.a(context, this);
                }
            };
            Context context2 = AbstractC4002fj.a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC4002fj.g.submit(runnable);
        }
    }
}
