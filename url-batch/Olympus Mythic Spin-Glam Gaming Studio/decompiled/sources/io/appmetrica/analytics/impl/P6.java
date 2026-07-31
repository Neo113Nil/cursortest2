package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class P6 {
    public final C5471km a = new C5471km();
    public Map b = MapsKt.emptyMap();
    public Map c = MapsKt.emptyMap();
    public IdentifiersResult d;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:29:0x0093, B:30:0x008e, B:33:0x00a6, B:34:0x00bd, B:36:0x00c3, B:40:0x00e5, B:42:0x00e9, B:49:0x00ed, B:51:0x00a2, B:52:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap hashMap;
        Map emptyMap;
        List a;
        try {
            IdentifiersResult identifiersResult2 = this.d;
            String str = identifiersResult2 != null ? identifiersResult2.id : null;
            if (str != null) {
                if (str.length() != 0) {
                    String str2 = identifiersResult.id;
                    if (str2 != null) {
                        if (str2.length() == 0) {
                        }
                    }
                }
            }
            this.d = identifiersResult;
            String str3 = identifiersResult.id;
            if (str3 == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            ArrayList a2 = Cb.a(new JSONArray(jSONObject.optString(next)));
                            if (a2 != null) {
                                hashMap.put(next, a2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (hashMap != null) {
                emptyMap = new LinkedHashMap(MapsKt.mapCapacity(hashMap.size()));
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    emptyMap.put(key, new IdentifiersResult(String.valueOf(Do.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                emptyMap = MapsKt.emptyMap();
            }
            this.c = emptyMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(emptyMap.size()));
            for (Map.Entry entry2 : emptyMap.entrySet()) {
                Object key2 = entry2.getKey();
                String str4 = ((IdentifiersResult) entry2.getValue()).id;
                if (str4 != null) {
                    try {
                        a = Cb.a(new JSONArray(str4));
                    } catch (Throwable unused3) {
                    }
                    if (a != null) {
                        a = CollectionsKt.emptyList();
                    }
                    linkedHashMap.put(key2, a);
                }
                a = null;
                if (a != null) {
                }
                linkedHashMap.put(key2, a);
            }
            this.b = linkedHashMap;
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            C5471km c5471km = this.a;
            String a = Cb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", c5471km.a(new IdentifiersResult(a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
