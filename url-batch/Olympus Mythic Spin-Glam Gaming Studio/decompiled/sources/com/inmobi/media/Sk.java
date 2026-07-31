package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class Sk {
    public static final void b() {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("networkType", F5.o()), TuplesKt.to("plType", "AB"));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdGetSignalsCalled", hashMapOf, EnumC4530zk.a);
    }

    public static String a(Map map, String str) {
        Map map2;
        String str2;
        C4493y9 a = AbstractC3869ai.a("getToken", "AB");
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("AB", "placementType");
        Map map3 = AbstractC4432w1.a("AB", map).a;
        if (map3 != null) {
            String str3 = (String) map3.get("tp");
            if (!TextUtils.isEmpty(str3)) {
                AbstractC4030gj.b = str3;
            }
            String str4 = (String) map3.get("tp-v");
            if (!TextUtils.isEmpty(str4)) {
                AbstractC4030gj.a = str4;
            }
        }
        a();
        if (!AbstractC4002fj.d()) {
            if (a != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
                a.b("com.inmobi.media.Sk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, currentTimeMillis, a);
            return null;
        }
        Context context = AbstractC4002fj.a;
        C4367tf c4367tf = context != null ? new C4367tf(context, a) : null;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C4277q4 c4277q42 = AbstractC4015g4.a;
        if (((RootConfig) c4277q42.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, currentTimeMillis, a);
            if (a != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
                a.b("com.inmobi.media.Sk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Zk uidMap = new Zk(((AdConfig) c4277q42.a(AdConfig.class)).getIncludeIds());
        Tk metaData = new Tk(str, map3);
        C4314rf a2 = c4367tf != null ? c4367tf.a() : null;
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c4277q42.a(SignalsConfig.class);
        LinkedHashMap payload = new LinkedHashMap();
        String a3 = F8.a();
        if (a3 != null) {
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C4242ol a4 = AbstractC4216nl.a();
        String str5 = a4.a;
        if (str5 != null) {
        }
        payload.put("is-unifid-service-used", String.valueOf(a4.b));
        H9.d(payload);
        payload.put("d-media-volume", String.valueOf(F5.a.a(AbstractC4002fj.a, false)));
        payload.putAll(uidMap.a());
        String str6 = metaData.a;
        if (str6 != null) {
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC3987f4.a);
        payload.putAll(hashMap);
        Map map4 = metaData.b;
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!payload.containsKey(str7)) {
                    payload.put(str7, str8);
                }
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C4277q4 c4277q43 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject = ext.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            payload.put("im-ext", jSONObject);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        F5 f5 = F5.a;
        f5.getClass();
        if (F5.s()) {
            if (R5.e) {
                str2 = null;
            } else {
                str2 = R5.c;
                if (str2 == null) {
                    Context context2 = AbstractC4002fj.a;
                    if (context2 == null) {
                        str2 = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        Qa a5 = Pa.a(context2, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", "key");
                        str2 = a5.a.getString("gesture_margin", null);
                    }
                    R5.c = str2;
                }
            }
            if (str2 != null) {
                payload.put("d-device-gesture-margins", str2);
            }
        }
        H9.c(payload);
        H9.e(payload);
        H9.a(payload);
        H9.b(payload);
        payload.put("h-user-agent", AbstractC4002fj.c());
        Intrinsics.checkNotNullParameter(payload, "<this>");
        String str9 = AbstractC4184mh.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str10 = AbstractC4184mh.a;
        if (str10 != null) {
            linkedHashMap.put("u-nip", str10);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(AbstractC4132kh.a());
        payload.putAll(R5.c());
        payload.putAll(T2.a());
        if (a2 != null && (map2 = a2.a) != null) {
            payload.putAll(map2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Lazy lazy = F0.c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            payload.put("u-r-crid", jSONArray);
        }
        JSONObject a6 = C4020g9.c.a();
        if (a6.length() > 0) {
            String jSONObject2 = a6.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            payload.put("audioObject", jSONObject2);
        }
        AppSetIdInfo appSetIdInfo = F1.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        F1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            Intrinsics.checkNotNullParameter(payload, "<this>");
            JSONObject e = C4000fh.a.e();
            if (e.length() > 0) {
                String jSONObject3 = e.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
                payload.put(X3.i.l0, jSONObject3);
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.put("u-appsecure", String.valueOf((int) E1.f));
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (S4.e() && N3.a(S4.d())) {
            payload.put("ik", S4.f);
            payload.put("c_data", S4.d());
            Context context3 = AbstractC4002fj.a;
            int i = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                Qa a7 = Pa.a(context3, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a7.a.getInt("akv", 1);
            }
            payload.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        JSONObject b = AbstractC3962e7.b();
        if (b != null) {
            String jSONObject4 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
            payload.put("consentObject", jSONObject4);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.putAll(E1.e);
        payload.putAll(f5.a(false));
        payload.putAll(H8.a());
        Intrinsics.checkNotNullParameter(payload, "mHttpHeaders");
        payload.put("User-Agent", AbstractC4002fj.c());
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!AbstractC3962e7.a()) {
            if (a != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
                a.b("com.inmobi.media.Sk", "get Signals failed - GDPR Compliance");
            }
            a(2141, currentTimeMillis, a);
            return null;
        }
        a(currentTimeMillis, a);
        if (a != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
            a.a("com.inmobi.media.Sk", "get signals success");
        }
        byte[] encode = Base64.encode(new Buffer().writeUtf8(N3.a(payload)).readByteArray(), 8);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return new String(encode, Charsets.UTF_8);
    }

    public static void a(final int i, final long j, C4493y9 c4493y9) {
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
            c4493y9.c("com.inmobi.media.Sk", "submitAdGetSignalsFailed - errorCode - " + i + ", startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Sk$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Sk.a(j, i);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
        if (c4493y9 != null) {
            c4493y9.a();
        }
    }

    public static final void a(long j, int i) {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j)), TuplesKt.to("networkType", F5.o()), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), TuplesKt.to("plType", "AB"));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdGetSignalsFailed", hashMapOf, EnumC4530zk.a);
    }

    public static void a(final long j, C4493y9 c4493y9) {
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Sk", "LOG_TAG");
            c4493y9.c("com.inmobi.media.Sk", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Sk$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Sk.a(j);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
        if (c4493y9 != null) {
            c4493y9.a();
        }
    }

    public static final void a(long j) {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j)), TuplesKt.to("networkType", F5.o()), TuplesKt.to("plType", "AB"));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdGetSignalsSucceeded", hashMapOf, EnumC4530zk.a);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Sk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Sk.b();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }
}
