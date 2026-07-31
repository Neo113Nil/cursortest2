package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5322f2 implements ActivityLifecycleListener {
    public final ArrayList a = new ArrayList();
    public volatile Q7 b = null;

    public final void a(@NonNull Q7 q7) {
        ArrayList a;
        synchronized (this) {
            this.b = q7;
            a = a();
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5749ve) it.next()).consume(q7);
        }
    }

    public final void b() {
        C5661s4.l().e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C5661s4.l().e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C5271d2());
        String dataString = intent == null ? null : intent.getDataString();
        if (StringUtils.isNullOrEmpty(dataString)) {
            return;
        }
        C5296e2 c5296e2 = new C5296e2(dataString);
        synchronized (this) {
            try {
                Q7 q7 = this.b;
                if (q7 == null) {
                    this.a.add(c5296e2);
                } else {
                    ((U9) C5661s4.l().c.a()).b.post(new RunnableC5245c2(c5296e2, q7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.a);
        this.a.clear();
        return arrayList;
    }
}
