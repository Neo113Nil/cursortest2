package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ x0 a;

    public w0(x0 x0Var) {
        this.a = x0Var;
    }

    public final HashSet a(WeakHashMap weakHashMap) {
        HashSet hashSet;
        synchronized (this.a.a) {
            Set keySet = weakHashMap.keySet();
            hashSet = new HashSet(keySet.size());
            for (Object obj : keySet) {
                if (obj != null) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = a(this.a.c).iterator();
        while (it.hasNext()) {
            ((b1) ((fq2) it.next())).a(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = a(this.a.b).iterator();
        while (it.hasNext()) {
            ((j1) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = a(this.a.b).iterator();
        while (it.hasNext()) {
            ((j1) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = a(this.a.c).iterator();
        while (it.hasNext()) {
            ((b1) ((fq2) it.next())).b(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.b(activity);
    }
}
