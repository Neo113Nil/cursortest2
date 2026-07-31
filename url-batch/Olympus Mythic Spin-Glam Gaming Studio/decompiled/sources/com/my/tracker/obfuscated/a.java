package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public final class a {
    final e0 d;
    final y2 e;
    final w1 f;
    final Application g;
    final Map a = new WeakHashMap();
    final Handler b = m.a;
    final AtomicBoolean c = new AtomicBoolean();
    long k = 0;
    long l = 0;
    final Runnable h = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    };
    final Runnable i = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            a.this.c();
        }
    };
    final Runnable j = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            a.this.d();
        }
    };

    /* renamed from: com.my.tracker.obfuscated.a$a, reason: collision with other inner class name */
    protected final class C1685a implements Application.ActivityLifecycleCallbacks {
        protected C1685a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        this.d = e0Var;
        this.e = y2Var;
        this.f = w1Var;
        this.g = application;
    }

    public static a a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        return new a(e0Var, y2Var, w1Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(v2.a(this.e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        p1.a(this.g).d(v2.b(this.k));
    }

    public void e() {
        if (this.c.get()) {
            m.f(this.i);
        }
    }

    void f() {
        x2.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    public void a() {
        this.g.registerActivityLifecycleCallbacks(new C1685a());
    }

    void c(Activity activity) {
        if (this.a.remove(activity) == null || !this.a.isEmpty()) {
            return;
        }
        l2.d().b();
        this.c.set(false);
        this.b.removeCallbacks(this.h);
        this.k = System.currentTimeMillis();
        m.a(this.j);
    }

    public void d(final Activity activity) {
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(activity);
            }
        });
    }

    void a(long j) {
        this.b.removeCallbacks(this.h);
        this.c.set(true);
        this.b.postDelayed(this.h, j);
        this.l = System.currentTimeMillis() + j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) != null || this.a.size() > 1) {
            return;
        }
        l2.d().a();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.k >= v2.a(this.e.i())) {
            this.f.c();
            if (this.e.v()) {
                this.d.g();
                a(v2.a(this.e.e()));
                return;
            }
        }
        long j = this.l - currentTimeMillis;
        if (j > 0) {
            a(j);
        } else {
            f();
        }
    }
}
