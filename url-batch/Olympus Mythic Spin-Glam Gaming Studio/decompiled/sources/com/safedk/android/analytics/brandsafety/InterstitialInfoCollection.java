package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class InterstitialInfoCollection extends ConcurrentHashMap<String, o> {
    private static final String a = "InterstitialInfoCollection";

    public List<o> a(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                o oVar = get(it.next());
                if (oVar != null && !oVar.U && oVar.c() != null && oVar.c().equals(str)) {
                    arrayList.add(oVar);
                }
            }
        }
        return arrayList;
    }

    public o a(String str, boolean z) {
        Logger.d(a, "get by view address, viewAddress = ", str);
        if (str == null) {
            Logger.d(a, "get by view address, view is null, exiting");
            return null;
        }
        if (str.contains("@")) {
            str = str.substring(str.indexOf(64) + 1);
            Logger.d(a, "get by view address, viewAddress cut to ", str);
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                o oVar = get(it.next());
                if (oVar != null) {
                    if (z && oVar.U) {
                        Logger.d(a, "get by view address - skipping ad that was already finished with event id - ", oVar.w());
                    } else {
                        Logger.d(a, "get by view address, searching by viewAddress ", str, ", view hierarchy : ", oVar.x(), " is ad finished? ", Boolean.valueOf(oVar.U));
                        if (oVar.K != null && oVar.K.equals(str)) {
                            Logger.d(a, "get by view address, found. viewAddress = ", str, " with event id: ", oVar.w());
                            return oVar;
                        }
                        if (oVar.x() != null && oVar.x().contains(str)) {
                            Logger.d(a, "get by view address, found in views hierarchy . viewAddress = ", str, " with event id: ", oVar.w());
                            return oVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    public o b(String str) {
        Logger.d(a, "get by activity address, viewAddress = ", str);
        if (str == null) {
            Logger.d(a, "get by activity address, view is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                o oVar = get(it.next());
                if (oVar != null && oVar.ad != null && oVar.ad.endsWith(str)) {
                    Logger.d(a, "get by activity address, found by ", oVar.ad);
                    return oVar;
                }
            }
            return null;
        }
    }

    public boolean c(String str) {
        Logger.d(a, "contains activity address, viewAddress = ", str, ", keys = ", keySet());
        if (str == null) {
            Logger.d(a, "contains activity address, view is null, exiting");
            return false;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                o oVar = get(it.next());
                if (oVar != null && oVar.ad != null && oVar.ad.endsWith(str)) {
                    Logger.d(a, "contains activity address, found by ", oVar.ad);
                    return true;
                }
            }
            return false;
        }
    }

    public o d(String str) {
        if (str == null) {
            Logger.d(a, "get by eventId, eventId is null, exiting");
            return null;
        }
        if (!containsKey(str)) {
            return null;
        }
        Logger.d(a, "get by eventId, found by eventId ", str);
        return get(str);
    }

    public o e(String str) {
        if (str == null) {
            Logger.d(a, "get by adId, adId is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                o oVar = get(it.next());
                if (oVar != null && oVar.j() != null && oVar.j().L().equals(str)) {
                    Logger.d(a, "get by adId, found by adid ", str);
                    return oVar;
                }
            }
            return null;
        }
    }

    public boolean a() {
        Iterator<o> it = values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z = z && it.next().ar;
        }
        return z;
    }

    public String b() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            Iterator<o> it = values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c());
            }
        }
        return hashSet.toString();
    }

    protected int a(boolean z) {
        int i;
        if (!z) {
            return size();
        }
        synchronized (this) {
            i = 0;
            for (o oVar : values()) {
                if (oVar != null && oVar.aq == null) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        return super.size();
    }

    public synchronized List<o> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (o oVar : values()) {
            if (oVar != null && oVar.aq == null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InterstitialInfoCollection : ");
        synchronized (this) {
            for (o oVar : values()) {
                sb.append("[ ");
                if (oVar != null) {
                    if (oVar.v != null) {
                        sb.append("maxSdk=");
                        sb.append(oVar.v);
                    }
                    if (oVar.L != null) {
                        sb.append(",eventId=");
                        sb.append(oVar.L);
                    }
                    if (oVar.aq != null && oVar.aq.get() != null) {
                        sb.append(",interstitialActivity=");
                        sb.append(oVar.aq.get().toString());
                    }
                    if (oVar.K != null) {
                        sb.append(",viewAddress=");
                        sb.append(oVar.K);
                    }
                    sb.append(",isAdFinished=");
                    sb.append(oVar.U);
                }
                sb.append(" ] ");
            }
        }
        return sb.toString();
    }
}
