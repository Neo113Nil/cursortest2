package com.inmobi.media;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class Qf {
    public static Pf a;

    public static Qa a() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        return Pa.a(context, "telemetry_once_per_app_version_store");
    }

    public static Pf a(String str) {
        Set linkedHashSet;
        Set a2;
        if (str == null) {
            str = "";
        }
        Pf pf = a;
        if (pf == null) {
            Qa a3 = a();
            String str2 = null;
            if (a3 != null) {
                Intrinsics.checkNotNullParameter("app_version", "key");
                str2 = a3.a.getString("app_version", null);
            }
            Qa a4 = a();
            if (a4 == null || (a2 = a4.a(SetsKt.emptySet())) == null || (linkedHashSet = CollectionsKt.toMutableSet(a2)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            if (Intrinsics.areEqual(str2, str)) {
                Pf pf2 = new Pf(str, linkedHashSet);
                a = pf2;
                pf = pf2;
            } else {
                Qa a5 = a();
                if (a5 != null) {
                    a5.a("app_version");
                }
                Qa a6 = a();
                if (a6 != null) {
                    a6.a("reported_events");
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                pf = new Pf(str, linkedHashSet2);
                a = pf;
                Qa a7 = a();
                if (a7 != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    a7.a("app_version", str, false);
                }
                Qa a8 = a();
                if (a8 != null) {
                    a8.b(linkedHashSet2);
                }
            }
        }
        if (Intrinsics.areEqual(pf.a, str)) {
            return pf;
        }
        Qa a9 = a();
        if (a9 != null) {
            a9.a("app_version");
        }
        Qa a10 = a();
        if (a10 != null) {
            a10.a("reported_events");
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Pf pf3 = new Pf(str, linkedHashSet3);
        a = pf3;
        Qa a11 = a();
        if (a11 != null) {
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            a11.a("app_version", str, false);
        }
        Qa a12 = a();
        if (a12 != null) {
            a12.b(linkedHashSet3);
        }
        return pf3;
    }
}
