package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ย, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0739 extends AbstractC0698 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public WeakReference f1663;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public WeakReference f1664;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f1665 = new WeakHashMap();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            synchronized (AbstractC0698.class) {
                try {
                    if (this.f1664 == null) {
                        this.f1664 = new WeakReference(activity);
                        AbstractC1026.m4316(new C0746(activity));
                        AbstractC0698.class.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = m4145().iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityCreated(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("gCij64KsXcGhIa/wgKx05K43uOyNpWP7oja64ICl\n", "x0TMiePAEag=\n"), StringFog.decrypt("yQidp4Y3mLOsFYGJl2OYq+UOlouGcpCp6R4=\n", "jHrvyPQX8d0=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1553);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityDestroyed(activity);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("aH4FtTqZdc5JdwmuOJlc60ZhHrI1kEv0SmAcvjiQ\n", "LxJq11v1Oac=\n"), StringFog.decrypt("cF5a/iT9QVkVQ0bQNalBQVxYUdUzrlxFWlVN9Q==\n", "NSwokVbdKDc=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1553);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityPaused(activity);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("NA7w6IP6K/sVB/zzgfoC3hoR6++M8xXBFhDp44Hz\n", "c2KfiuKWZ5I=\n"), StringFog.decrypt("D6La28KyWApqv8b10+ZYEiOk0eTR50IBLg==\n", "StCotLCSMWQ=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList;
        try {
            this.f1664 = new WeakReference(activity);
            AbstractC1026.m4316(new C0746(activity));
            synchronized (this) {
                arrayList = new ArrayList(this.f1553);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityResumed(activity);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("9vw7BsvFrPXX9TcdycWF0NjjIAHEzJLP1OIiDcnM\n", "sZBUZKqp4Jw=\n"), StringFog.decrypt("nJCUmjnM6BL5jYi0KJjoCrCWn6cun/QRvIY=\n", "2eLm9UvsgXw=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f1553);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("vOhhbZkXzc+d4W12mxfk6pL3emqWHvP1nvZ4Zpse\n", "+4QOD/h7gaY=\n"), StringFog.decrypt("aQaMyR+/F4UMG5DnDusXnUUAh/UM6RuiQgeKxwP8G7hYFYrD\n", "LHT+pm2ffus=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (this.f1664 == null) {
                this.f1664 = new WeakReference(activity);
                AbstractC1026.m4316(new C0746(activity));
            }
            synchronized (this) {
                this.f1665.put(activity, Boolean.TRUE);
            }
            Iterator it = m4145().iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityStarted(activity);
            }
            if (activity.getLocalClassName().equals(StringFog.decrypt("OfWkDPhVkJsjqa0M/VeYlj/o53fjUo2WCvaoW+hJqZ014rBj7k+QmTPusA==\n", "WprJIo07+e8=\n"))) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f1665.size() == 1 && !this.f1554) {
                        m4152(activity);
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("EUP29tzXUOgwSvrt3td5zT9c7fHT3m7SM13v/d7e\n", "Vi+ZlL27HIE=\n"), StringFog.decrypt("IrRMnffEJshHqVCz5pAm0A6yR6HxhT3SAqI=\n", "Z8Y+8oXkT6Y=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i;
        try {
            Iterator it = m4145().iterator();
            while (it.hasNext()) {
                ((InterfaceC1096) it.next()).onActivityStopped(activity);
            }
            this.f1554 = activity.isChangingConfigurations();
            synchronized (this) {
                try {
                    if (!this.f1665.containsKey(activity) || activity.getLocalClassName().equals(StringFog.decrypt("GB3bx9+cVbwCQdLH2p5dsR4AmLzEm0ixKx7XkM+AbLoUCs+oyYZVvhIGzw==\n", "e3K26aryPMg=\n"))) {
                        i = -1;
                    } else {
                        this.f1665.remove(activity);
                        i = this.f1665.size();
                    }
                } finally {
                }
            }
            if (i <= -1 || i != 0 || this.f1554) {
                return;
            }
            m4153(activity);
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("2uLCEjBPxeD7684JMk/sxfT92RU/Rvva+PzbGTJG\n", "nY6tcFEjiYk=\n"), StringFog.decrypt("RlK0uyIGq00jT6iVM1KrVWpUv4ckSbJTZkQ=\n", "AyDG1FAmwiM=\n"), (Throwable) e, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﻛ */
    public final synchronized boolean mo4144() {
        return this.f1665.size() > 0;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4152(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1553);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1096) it.next()).mo4165(activity);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﾒ */
    public final synchronized void mo4147(Application application, Activity activity) {
        try {
            if (this.f1663 == null) {
                this.f1663 = new WeakReference(application);
                if (activity != null) {
                    this.f1664 = new WeakReference(activity);
                    AbstractC1026.m4316(new C0746(activity));
                    synchronized (this) {
                        this.f1665.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﾒ */
    public final Activity mo4146() {
        WeakReference weakReference = this.f1664;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4153(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1553);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1096) it.next()).mo4166(activity);
        }
    }
}
