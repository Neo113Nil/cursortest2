package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static final d f = new d();
    public volatile int b;
    public volatile boolean c;
    public volatile c d;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.d);
        p0.startActivity(p1);
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
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b++;
        if (this.c || this.b != 1) {
            return;
        }
        this.c = true;
        c cVar = this.d;
        if (cVar != null) {
            Context it = (Context) cVar.b().get();
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                a.a(it, cVar.c(), cVar.d(), cVar.a());
            }
            this.d = null;
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b--;
        if (this.c && this.b == 0) {
            this.c = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public static final boolean a(d dVar, Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        dVar.getClass();
        try {
            if (intent != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                if (mVar != null) {
                    mVar.a(true);
                }
            } else {
                if (intent2 == null) {
                    return false;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            }
        } catch (Exception e) {
            boolean z = u.a;
            t.b("ActivityManager", "Failed to start activity: " + e);
            if (intent != null && mVar != null) {
                try {
                    mVar.a(false);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            }
            return false;
        }
        return true;
    }

    public static final void a(d dVar, Context context) {
        Object m8023constructorimpl;
        if (dVar.a.getAndSet(true)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(dVar);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z = u.a;
            t.a("ActivityManager", "Error initializing ActivityManager", m8026exceptionOrNullimpl);
            dVar.a.set(false);
        }
    }

    public static final boolean a(d dVar) {
        return !dVar.a.get() || dVar.c;
    }

    public static final void a(d dVar, b bVar) {
        dVar.e.add(bVar);
    }

    public final void a(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e.remove(callback);
    }
}
