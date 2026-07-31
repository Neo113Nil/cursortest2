package sg.bigo.ads.at;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.at.a;
import sg.bigo.ads.bh.d;

/* loaded from: classes12.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    private static boolean a = false;
    private static int b = -1;
    private static int c = -1;
    private static Application d;
    private WeakReference<Activity> e;
    private final Map<a, Object> f;

    public interface a {
        void a(Activity activity);
    }

    /* renamed from: sg.bigo.ads.at.b$b, reason: collision with other inner class name */
    static class C1843b {
        private static final b a = new b(0);
    }

    private b() {
        this.f = new WeakHashMap();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static Application a() {
        return d;
    }

    public static synchronized void a(@NonNull Application application) {
        synchronized (b.class) {
            if (a) {
                return;
            }
            a = true;
            b = 0;
            c = 0;
            d = application;
            application.registerActivityLifecycleCallbacks(C1843b.a);
        }
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C1843b.a.f.put(a.this, C1843b.a);
            }
        });
    }

    @Nullable
    public static Activity b() {
        WeakReference<Activity> weakReference = C1843b.a.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C1843b.a.f.remove(a.this);
            }
        });
    }

    public static int c() {
        int i;
        if (!a || (i = c) < 0) {
            return 0;
        }
        return i > 0 ? 1 : 2;
    }

    public static boolean d() {
        return c > 0;
    }

    public static boolean e() {
        return b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull final Activity activity) {
        b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull final Activity activity) {
        this.e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull final Activity activity) {
        this.e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.at.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (c == 0) {
            sg.bigo.ads.at.a a2 = sg.bigo.ads.at.a.a();
            a2.b();
            if (a2.d != null && a2.c()) {
                a2.d.a(a2.b, a2.c);
            }
        }
        c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        int i = c - 1;
        c = i;
        if (i == 0) {
            sg.bigo.ads.at.a a2 = sg.bigo.ads.at.a.a();
            if (a2.d != null && a2.c()) {
                a.InterfaceC1842a interfaceC1842a = a2.d;
                boolean z = a2.a;
                long j = a2.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = a2.c;
                System.currentTimeMillis();
                interfaceC1842a.a(z, j, elapsedRealtime, j2);
            }
            a2.a = false;
        }
    }
}
