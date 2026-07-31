package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5500m implements ActivityLifecycleListener {
    public final HashSet a = new HashSet();

    public C5500m(@NonNull C5552o c5552o) {
        c5552o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC5474l interfaceC5474l) {
        this.a.add(interfaceC5474l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C5661s4.l().c.a().execute(new RunnableC5448k(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C5650rj) ((InterfaceC5474l) it.next())).a(activity);
        }
    }
}
