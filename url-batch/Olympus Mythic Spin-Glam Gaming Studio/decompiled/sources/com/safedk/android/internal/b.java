package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final String a = "LifecycleManager";
    private static b b = null;
    private static final Object c = new Object();
    private static boolean h;
    private final LinkedHashSet<WeakReference<Activity>> d = new LinkedHashSet<>();
    private final ArrayList<WeakReference<Activity>> e = new ArrayList<>();
    private int f = 0;
    private boolean g = true;
    private Set<a> i = Collections.newSetFromMap(new ConcurrentHashMap());
    private final ScheduledExecutorService j = Executors.newScheduledThreadPool(1);

    private b() {
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.e;
    }

    public static synchronized b getInstance() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
                Logger.d(a, "LifecycleManager created");
            }
            bVar = b;
        }
        return bVar;
    }

    public void AddActivity(Activity activity) {
        this.d.add(new WeakReference<>(activity));
        if (!BrandSafetyUtils.d(activity.getClass())) {
            this.e.add(new WeakReference<>(activity));
        }
    }

    public Activity getForegroundActivity() {
        Activity activity;
        Throwable th;
        Activity activity2 = null;
        try {
            if (this.d.size() > 0) {
                try {
                    try {
                        synchronized (this.d) {
                            try {
                                Activity activity3 = (Activity) ((WeakReference) this.d.toArray()[this.d.size() - 1]).get();
                                if (activity3 != null) {
                                    Logger.d(a, "getForegroundActivity Foreground activity is ", activity3);
                                }
                                activity2 = activity3;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Logger.e(a, "Exception in getForegroundActivity : ", th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                        return activity;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                Logger.d(a, "No foreground activity found");
            }
            return activity2;
        } catch (Throwable th5) {
            activity = activity2;
            th = th5;
        }
    }

    public boolean isInBackground() {
        return this.g;
    }

    public synchronized boolean isInterstitialActivity(Context activity) {
        if (this.f == 0) {
            return false;
        }
        return this.f == System.identityHashCode(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (h) {
            Logger.d(a, "onActivityCreated ", activity.toString());
            if (!BrandSafetyUtils.d(activity.getClass())) {
                this.e.add(new WeakReference<>(activity));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
        } finally {
        }
        if (h) {
            Logger.d(a, "onActivityStarted ", activity.toString());
            synchronized (this.d) {
                this.d.add(new WeakReference<>(activity));
            }
            if (this.d.size() == 1) {
                d();
            }
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder("{ ");
        synchronized (this.d) {
            Iterator<WeakReference<Activity>> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next().get());
                sb.append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private boolean b() {
        Iterator<WeakReference<Activity>> it = this.d.iterator();
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (next != null && next.get() != null && BrandSafetyUtils.d(next.get().getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        boolean z;
        try {
            if (h) {
                Logger.d(a, "onActivityResumed ", activity.toString(), ", isActive=", Boolean.valueOf(h), ", foregroundActivities=", a());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f = System.identityHashCode(activity);
                    SafeDK.getInstance().a(activity);
                    z = true;
                } else {
                    SafeDK.getInstance().d(activity);
                    z = false;
                }
                if (b()) {
                    Logger.d(a, "onActivityResumed - interstitial activity found in foreground, don't start banner redirect monitoring");
                } else {
                    if (z && !BrandSafetyUtils.c(activity.getClass())) {
                        if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                            this.j.schedule(new Runnable() { // from class: com.safedk.android.internal.b.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                                        SafeDK.getInstance().c(activity);
                                    }
                                }
                            }, 3L, TimeUnit.SECONDS);
                        }
                    }
                    SafeDK.getInstance().c(activity);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.b(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityResumed failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (h) {
                Logger.d(a, "onActivityPaused ", activity.toString());
                this.j.execute(new Runnable() { // from class: com.safedk.android.internal.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PersistentConcurrentHashMap.a();
                    }
                });
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.c(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityPaused failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r5.remove(r1);
        r1.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void removeActivity(Activity activity, Collection<WeakReference<Activity>> collection) {
        Iterator<WeakReference<Activity>> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference<Activity> next = it.next();
            if (next.get() == activity) {
                break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (h) {
                Logger.d(a, "onActivityStopped ", activity.toString());
                synchronized (this.d) {
                    removeActivity(activity, this.d);
                }
                Logger.d(a, "onActivityStopped foregroundActivities=", a());
                if (this.d.isEmpty()) {
                    c();
                    Logger.d(a, "onActivityStopped, checking for redirect");
                    BrandSafetyUtils.g();
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityStopped failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (h) {
            Logger.d(a, "onActivitySaveInstanceState ", activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (h) {
            Logger.d(a, "onActivityDestroyed ", activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.e);
            }
        }
    }

    private void a(boolean z) {
        this.g = z;
    }

    private void c() {
        Logger.d(a, "Identified background");
        a(true);
        for (a aVar : this.i) {
            Logger.d(a, "notifyBackground to ", aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void d() {
        Logger.d(a, "Identified foreground");
        a(false);
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public synchronized void registerBackgroundForegroundListener(a listener) {
        try {
        } finally {
        }
        if (h) {
            if (!this.i.contains(listener) && !a(listener)) {
                Logger.d(a, "Adding ", listener.getClass(), " to listen to BG FG events");
                this.i.add(listener);
                if (isInBackground()) {
                    listener.g();
                } else {
                    listener.h();
                }
            }
        }
    }

    private boolean a(a aVar) {
        Logger.d(a, "listenersContainsType started, listener is ", aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.i != null) {
            Logger.d(a, "listenersContainsType iteration listener is ", aVar.getClass());
            Iterator<a> it = this.i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(a, "Clearing Background Foreground listeners collection");
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void setActiveMode(boolean enable) {
        h = enable;
        Logger.d(a, "setting active mode to ", Boolean.valueOf(enable));
    }
}
