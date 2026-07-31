package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class FullScreenActivitiesCollection extends ConcurrentHashMap<String, WeakReference<Activity>> {
    private static final String b = "FullScreenActivitiesCollection";
    Set<WeakReference<Activity>> a = Collections.synchronizedSet(new LinkedHashSet());

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> put(String str, WeakReference<Activity> weakReference) {
        WeakReference<Activity> weakReference2;
        Logger.d(b, "put activity = ", weakReference.get(), " activities : ", keySet());
        weakReference2 = (WeakReference) super.put(str, weakReference);
        if (weakReference2 != null) {
            this.a.remove(weakReference2);
        }
        this.a.add(weakReference);
        return weakReference2;
    }

    public synchronized Activity a(String str) {
        Logger.d(b, "get by activity address, viewAddress = ", str);
        if (str == null) {
            Logger.d(b, "get by activity address, view is null, exiting");
            return null;
        }
        Iterator<String> it = keySet().iterator();
        while (it.hasNext()) {
            WeakReference<Activity> weakReference = get(it.next());
            Logger.d(b, "get by activity address, activity address :  ", weakReference);
            if (weakReference != null && weakReference.get() != null && weakReference.get().toString().endsWith(str)) {
                Logger.d(b, "get by activity address, found by ", str);
                return weakReference.get();
            }
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (String str : keySet()) {
            WeakReference weakReference = (WeakReference) get(str);
            sb.append(str);
            sb.append(" - ");
            sb.append((weakReference == null || weakReference.get() == null) ? "NA" : "alive");
        }
        return sb.toString();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> remove(Object obj) {
        Logger.d(b, "remove key = ", obj, " activities : ", keySet());
        this.a.remove(get(obj));
        return (WeakReference) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        Logger.d(b, "remove activity = ", value, " activities : ", keySet());
        this.a.remove(value);
        return super.remove(key, value);
    }

    public synchronized WeakReference<Activity> b(String str) {
        Logger.d(b, "get activity ref by sdk , viewAddress = ", str);
        if (str == null) {
            Logger.d(b, "get activity ref by sdk, sdk package is null, exiting");
            return null;
        }
        b();
        for (WeakReference<Activity> weakReference : this.a) {
            if (weakReference != null && weakReference.get() != null && SdksMapping.getSdkPackageByClass(weakReference.get().getClass().getName()).equals(str)) {
                Logger.d(b, "get activity ref by sdk, activity found :  ", weakReference.get().toString(), ", activity class name = ", weakReference.get().getClass().getName());
                return weakReference;
            }
        }
        return null;
    }

    private synchronized void b() {
        Iterator<Map.Entry<String, WeakReference<Activity>>> it = entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<Activity> value = it.next().getValue();
            if (value == null || value.get() == null) {
                this.a.remove(value);
                it.remove();
            }
        }
    }

    synchronized String a() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("{ items: ");
        sb.append(keySet());
        sb.append(", by order: [");
        Iterator<WeakReference<Activity>> it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().get());
            sb.append(", ");
        }
        sb.append("] }");
        return sb.toString();
    }
}
