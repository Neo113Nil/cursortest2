package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class e implements r {
    public v1 d;
    public final x0 e;
    public final d g;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean b = new AtomicBoolean(false);
    public boolean c = false;
    public final Handler f = new Handler(Looper.getMainLooper(), new b(this));

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.g = new d(this);
        this.e = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        s sVar = IAConfigManager.N.t;
        if (!sVar.d) {
            sVar.c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, r0.t.b.a("session_duration", 30, 1));
        this.d = v1Var;
        v1Var.e = this.g;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.d;
        if (v1Var != null) {
            v1Var.d = false;
            v1Var.f = 0L;
            t1 t1Var = v1Var.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long a = oVar.a("session_duration", 30, 1);
            long j = this.d.f;
            v1 v1Var2 = new v1(timeUnit, a);
            v1Var2.f = j;
            IAlog.a("Visible time counter init - time %d", Long.valueOf(a));
            this.d = v1Var2;
            v1Var2.e = this.g;
        }
        sVar.c.remove(this);
    }
}
