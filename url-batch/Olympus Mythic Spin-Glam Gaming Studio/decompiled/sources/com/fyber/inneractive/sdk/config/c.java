package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.util.z0;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.a.f.hasMessages(123) || this.a.b.get()) {
            return;
        }
        this.a.f.sendEmptyMessageDelayed(123, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.a.f.removeMessages(123);
        e eVar = this.a;
        if (eVar.b.compareAndSet(true, false)) {
            if (eVar.c) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.c = false;
                x0 x0Var = eVar.e;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.a.get(cVar)) != null && gVar.a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.e.d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.e.c.clear();
                }
            }
            v1 v1Var = eVar.d;
            if (v1Var != null) {
                v1Var.d = false;
                v1Var.f = 0L;
                t1 t1Var = v1Var.c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
        for (z0 z0Var : this.a.a) {
            if (z0Var.c) {
                z0Var.c = false;
                e eVar3 = IAConfigManager.N.w.b;
                if (eVar3 != null) {
                    eVar3.a.remove(z0Var);
                }
                String a = com.fyber.inneractive.sdk.util.c0.a(System.currentTimeMillis(), z0Var.b, 0L);
                z0Var.b = 0L;
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.TIME_SPENT_IN_PLAY_STORE;
                com.fyber.inneractive.sdk.flow.x xVar = z0Var.a;
                InneractiveAdRequest inneractiveAdRequest = xVar == null ? null : xVar.a;
                com.fyber.inneractive.sdk.response.e eVar4 = xVar == null ? null : xVar.b;
                JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar4);
                wVar.c = uVar;
                wVar.a = inneractiveAdRequest;
                wVar.d = b;
                wVar.a("appstore_time", a);
                wVar.a((String) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
