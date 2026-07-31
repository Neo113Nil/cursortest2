package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.X3;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4247p0 extends H9 {
    public final Zk b;
    public final C4194n0 c;
    public final Ok d;
    public final C4314rf e;
    public final C4493y9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247p0(String str, Zk zk, C4194n0 metaData, Ok timeoutConfig, C4314rf c4314rf, C4493y9 c4493y9, boolean z) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.b = zk;
        this.c = metaData;
        this.d = timeoutConfig;
        this.e = c4314rf;
        this.f = c4493y9;
    }

    public final Ze a() {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = AbstractC4002fj.c;
        if (str2 == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str2);
        linkedHashMap.putAll(R5.c());
        String str3 = E1.b;
        if (str3 != null) {
        }
        linkedHashMap.put("client-request-id", this.c.a);
        linkedHashMap.put("sdk-flavor", "row");
        this.c.getClass();
        linkedHashMap.put(POBConstants.KEY_FORMAT, "unifiedSdkJson");
        String str4 = this.c.e;
        if (str4 != null) {
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4242ol a = AbstractC4216nl.a();
        String str5 = a.a;
        if (str5 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(a.b));
        long j = this.c.c;
        if (j != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j));
        }
        H9.d(linkedHashMap);
        linkedHashMap.putAll(T2.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(T2.b());
        linkedHashMap.putAll(T2.c());
        C4314rf c4314rf = this.e;
        if (c4314rf != null && (map = c4314rf.a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC3987f4.a);
        linkedHashMap.putAll(hashMap);
        String str6 = this.c.g;
        if (str6 != null) {
        }
        Map map2 = this.c.f;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        this.c.getClass();
        linkedHashMap.put("int-origin", "im");
        H9.c(linkedHashMap);
        H9.e(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Lazy lazy = F0.c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            linkedHashMap.put("u-r-crid", jSONArray);
        }
        linkedHashMap.put("m10n_context", Intrinsics.areEqual("others", this.c.d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        F5.a.getClass();
        if (F5.s()) {
            if (R5.e) {
                str = null;
            } else {
                str = R5.c;
                if (str == null) {
                    Context context = AbstractC4002fj.a;
                    if (context == null) {
                        str = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        Qa a2 = Pa.a(context, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", "key");
                        str = a2.a.getString("gesture_margin", null);
                    }
                    R5.c = str;
                }
            }
            if (str != null) {
                linkedHashMap.put("d-device-gesture-margins", str);
            }
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject = ext.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            linkedHashMap.put("im-ext", jSONObject);
        }
        Map map3 = this.c.b;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str7)) {
                    linkedHashMap.put(str7, str8);
                }
            }
        }
        H9.a(linkedHashMap);
        C4194n0 metaData = this.c;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        String str9 = metaData.e;
        if (str9 != null && H9.a(str9).length() > 0) {
            String jSONObject2 = H9.a(str9).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("audioObject", jSONObject2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str10 = AbstractC4184mh.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str11 = AbstractC4184mh.a;
        if (str11 != null) {
            linkedHashMap2.put("u-nip", str11);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(AbstractC4132kh.a());
        AppSetIdInfo appSetIdInfo = F1.a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        F1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (S4.e() && N3.a(S4.d())) {
            linkedHashMap.put("ik", S4.f);
            linkedHashMap.put("c_data", S4.d());
            Context context2 = AbstractC4002fj.a;
            int i = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                Qa a3 = Pa.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a3.a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) E1.f));
        Zk zk = this.b;
        HashMap a4 = zk != null ? zk.a() : null;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (a4 != null) {
            for (Map.Entry entry2 : a4.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C4277q4 c4277q42 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        if (((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            JSONObject e = C4000fh.a.e();
            if (e.length() > 0) {
                String jSONObject3 = e.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
                linkedHashMap.put(X3.i.l0, jSONObject3);
            }
        }
        H9.b(linkedHashMap);
        boolean z = this.c.h;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(z));
        linkedHashMap.putAll(H8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC3962e7.b();
        if (b != null) {
            String jSONObject4 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject4);
        }
        this.c.getClass();
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            c4493y9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str12 = this.a;
        LinkedHashMap mHttpHeaders = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put("User-Agent", AbstractC4002fj.c());
        return new Ze(str12, mHttpHeaders, this.d, new C4018g7(linkedHashMap), null, 48);
    }
}
