package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5552o extends R7 implements ActivityLifecycleRegistry {
    public Application a;
    public volatile EnumC5526n b = EnumC5526n.d;
    public final Pa c = new Pa(true);

    @AnyThread
    public final synchronized void a(@NonNull Context context) {
        if (this.a == null) {
            try {
                this.a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC5526n enumC5526n = this.b;
        EnumC5526n enumC5526n2 = EnumC5526n.b;
        if (enumC5526n != enumC5526n2 && !this.c.a.isEmpty()) {
            if (this.a == null) {
                this.b = EnumC5526n.c;
            } else {
                this.b = enumC5526n2;
                this.a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.b == EnumC5526n.b && this.c.a.isEmpty()) {
            this.b = EnumC5526n.d;
            Application application = this.a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, LOOP:0: B:5:0x000f->B:6:0x0011, LOOP_END, TryCatch #0 {all -> 0x0007, blocks: (B:18:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001b, B:3:0x0009), top: B:17:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void registerListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (ActivityEvent activityEvent : activityEventArr) {
                    this.c.a(activityEvent, activityLifecycleListener);
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
        activityEventArr = ActivityEvent.values();
        while (r1 < r0) {
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:31:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x002f, B:15:0x0034, B:17:0x0039, B:21:0x003c, B:3:0x0009), top: B:30:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void unregisterListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (ActivityEvent activityEvent : activityEventArr) {
                    Pa pa = this.c;
                    Collection collection = (Collection) pa.a.get(activityEvent);
                    if (collection != null && collection.remove(activityLifecycleListener)) {
                        if (collection.isEmpty() && pa.b) {
                            pa.a.remove(activityEvent);
                        }
                        new ArrayList(collection);
                    }
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
        activityEventArr = ActivityEvent.values();
        while (r1 < r0) {
        }
        c();
    }

    @AnyThread
    public final synchronized void a(@NonNull Application application) {
        try {
            if (this.a == null) {
                this.a = application;
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    @AnyThread
    public final EnumC5526n a() {
        return this.b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.c.a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
