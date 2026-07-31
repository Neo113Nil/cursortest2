package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class H9 {
    public final String a;

    public H9(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        F5.a.getClass();
        Pair k = F5.k();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (k != null) {
            linkedHashMap.put(k.getFirst(), k.getSecond());
        }
        Pair m = F5.m();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (m != null) {
            linkedHashMap.put(m.getFirst(), m.getSecond());
        }
        Pair pair2 = F5.j;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = AbstractC4002fj.a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent a = N3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (a != null ? a.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair q = F5.q();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (q != null) {
            linkedHashMap.put(q.getFirst(), q.getSecond());
        }
        Pair h = F5.h();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (h != null) {
            linkedHashMap.put(h.getFirst(), h.getSecond());
        }
        Context context2 = AbstractC4002fj.a;
        if (context2 != null) {
            Intent a2 = N3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (a2 == null || a2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair i = F5.i();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (i != null) {
            linkedHashMap.put(i.getFirst(), i.getSecond());
        }
        Pair j = F5.j();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (j != null) {
            linkedHashMap.put(j.getFirst(), j.getSecond());
        }
        Pair f = F5.f();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (f != null) {
            linkedHashMap.put(f.getFirst(), f.getSecond());
        }
        Pair l = F5.l();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (l != null) {
            linkedHashMap.put(l.getFirst(), l.getSecond());
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4521zb c4521zb = C4521zb.a;
        HashMap hashMap = new HashMap();
        Hh hh = AbstractC4477xj.a;
        Location a = (AbstractC4002fj.b() == null || AbstractC4477xj.a().getLocationEnabled()) ? C4521zb.a() : null;
        HashMap a2 = a != null ? C4521zb.a(a, true, AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_FINE_LOCATION") ? C4521zb.a(1, 3) : null) : C4521zb.a(AbstractC4132kh.b(), false, null);
        for (Map.Entry entry : a2.entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(hashMap);
        C4521zb c4521zb2 = C4521zb.a;
        HashMap hashMap2 = new HashMap();
        String str = "DENIED";
        if (C4521zb.d() && C4521zb.e()) {
            str = "AUTHORISED";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = str.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(hashMap2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4187mj c4187mj = C4187mj.a;
        c4187mj.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (C4187mj.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(C4187mj.f));
        }
        if (C4187mj.a(5)) {
            M1 m1 = C4187mj.j;
            KProperty[] kPropertyArr = C4187mj.b;
            if (((Number) m1.getValue(c4187mj, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put(com.safedk.android.analytics.brandsafety.m.R, Integer.valueOf(((Number) m1.getValue(c4187mj, kPropertyArr[0])).intValue()));
            }
        }
        if (C4187mj.a(6)) {
            M1 m12 = C4187mj.k;
            KProperty[] kPropertyArr2 = C4187mj.b;
            if (((Number) m12.getValue(c4187mj, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) m12.getValue(c4187mj, kPropertyArr2[1])).intValue()));
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) C4187mj.g);
        if (!C4187mj.a(1)) {
            mutableList.set(0, -1);
        }
        if (!C4187mj.a(2)) {
            mutableList.set(1, -1);
        }
        if (!C4187mj.a(3)) {
            mutableList.set(2, -1);
        }
        if (!C4187mj.a(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", mutableList);
                    break;
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("sData", jSONObject2);
        }
    }

    public static void a(LinkedHashMap linkedHashMap) {
        boolean z;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (AbstractC4226o5.a(AbstractC4002fj.a) != null) {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getCctEnabled()) {
                z = true;
                linkedHashMap.put("cct-enabled", String.valueOf(z));
            }
        }
        z = false;
        linkedHashMap.put("cct-enabled", String.valueOf(z));
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences a;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str = "";
        if (AbstractC4002fj.a != null && (a = AbstractC4292qj.a()) != null && a.contains("IABGPP_HDR_GppString")) {
            str = String.valueOf(a.getString("IABGPP_HDR_GppString", ""));
        }
        if (N3.a(str)) {
            linkedHashMap.put("gpp", str);
        }
    }

    public static JSONObject a(String str) {
        if (Intrinsics.areEqual(str, "banner")) {
            return C4020g9.c.a();
        }
        if (Intrinsics.areEqual("audio", str)) {
            C3938d9 c3938d9 = C3938d9.c;
            JSONObject jSONObject = new JSONObject();
            long j = c3938d9.a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j));
            }
            int i = c3938d9.b;
            if (i > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i));
            }
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a = Pa.a(context, "audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", "key");
                int i2 = a.a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i2));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
