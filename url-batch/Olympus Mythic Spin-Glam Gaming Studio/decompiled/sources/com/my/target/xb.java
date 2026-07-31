package com.my.target;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.my.target.common.MyTargetVersion;
import com.my.target.vf;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class xb {
    xb() {
    }

    private static JSONObject a(a aVar) {
        u3 u3Var = aVar.a;
        Map map = aVar.b;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            t tVar = (t) entry.getKey();
            vf.a aVar2 = (vf.a) entry.getValue();
            if (!aVar2.a.isEmpty()) {
                jSONArray.put(a(tVar, null, aVar2.a));
            }
            for (Map.Entry entry2 : aVar2.b.entrySet()) {
                jSONArray.put(a(tVar, ((w0) entry2.getKey()).b, ((vf.b) entry2.getValue()).a));
            }
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, u3Var);
        jSONObject.put("logs", jSONArray);
        return jSONObject;
    }

    private void b(a aVar) {
        try {
            j5.a().a("https://ad.mail.ru/sdk/log/v2", a(aVar).toString());
        } catch (Throwable unused) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a {
        public final u3 a;
        public final Map b;

        public a(u3 u3Var, t tVar, List list) {
            vf.a aVar = new vf.a();
            aVar.a.addAll(list);
            HashMap hashMap = new HashMap();
            hashMap.put(tVar, aVar);
            this.a = u3Var;
            this.b = hashMap;
        }

        public a(u3 u3Var, t tVar, w0 w0Var, List list) {
            vf.b bVar = new vf.b();
            bVar.a.addAll(list);
            vf.a aVar = new vf.a();
            aVar.b.put(w0Var, bVar);
            HashMap hashMap = new HashMap();
            hashMap.put(tVar, aVar);
            this.a = u3Var;
            this.b = hashMap;
        }
    }

    private static JSONObject a(t tVar, u0 u0Var, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(u0Var, (vf.c) it.next()));
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, tVar);
        jSONObject.put("events", jSONArray);
        return jSONObject;
    }

    private static JSONObject a(u0 u0Var, vf.c cVar) {
        JSONObject jSONObject = new JSONObject();
        if (u0Var != null) {
            jSONObject.put("banner_id", u0Var.a);
            String str = u0Var.b;
            if (str != null) {
                jSONObject.put("impression_id", str);
            }
            String str2 = u0Var.c;
            if (str2 != null) {
                jSONObject.put("pad_id", str2);
            }
            String str3 = u0Var.d;
            if (str3 != null) {
                jSONObject.put("pattern_id", str3);
            }
            Integer num = u0Var.e;
            if (num != null) {
                jSONObject.put("dsp_id", num);
            }
            List list = u0Var.f;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = u0Var.f.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Integer) it.next()).intValue());
                }
                jSONObject.put("labels", jSONArray);
            }
        }
        jSONObject.put(X3.i.q, cVar.b);
        jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, cVar.c);
        jSONObject.put("code", cVar.d);
        if (!TextUtils.isEmpty(cVar.e)) {
            jSONObject.put("message", cVar.e);
        }
        jSONObject.put("client_timestamp", cVar.a);
        if (!TextUtils.isEmpty(cVar.f)) {
            jSONObject.put("add_data", cVar.f);
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, u3 u3Var) {
        Objects.requireNonNull(u3Var);
        jSONObject.put("sdk_version", MyTargetVersion.VERSION);
        jSONObject.put("sdk_version_int", 5047001);
        jSONObject.put("app_bundle_id", u3Var.i);
        jSONObject.put("app_version", u3Var.j);
        jSONObject.put("app_build", u3Var.k);
        jSONObject.put("sdk_instance_id", u3Var.l);
        jSONObject.put("os", "Android");
        String str = u3Var.b;
        if (str == null) {
            str = "";
        }
        jSONObject.put(CommonUrlParts.OS_VERSION, str);
        jSONObject.put("os_version_int", u3Var.c);
        String str2 = u3Var.d;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("device", str2);
        String str3 = u3Var.e;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("model", str3);
        String str4 = u3Var.f;
        jSONObject.put(CommonUrlParts.MANUFACTURER, str4 != null ? str4 : "");
    }

    private static void a(JSONObject jSONObject, t tVar) {
        jSONObject.put("ad_format", tVar.c);
        jSONObject.put("cache_policy", tVar.b());
        jSONObject.put("tag", tVar.d());
        Integer num = tVar.d;
        if (num != null && num.intValue() != -1) {
            jSONObject.put("slot_id", tVar.d.intValue());
        }
        jSONObject.put(CreativeInfo.c, tVar.a);
        String str = tVar.b;
        if (str != null) {
            jSONObject.put("handle_data_id", str);
        }
        jSONObject.put("source_type", tVar.e);
    }

    void a(u3 u3Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            t tVar = (t) entry.getKey();
            vf.a aVar = (vf.a) entry.getValue();
            if (!aVar.a.isEmpty()) {
                b(new a(u3Var, tVar, aVar.a));
            }
            for (Map.Entry entry2 : aVar.b.entrySet()) {
                w0 w0Var = (w0) entry2.getKey();
                vf.b bVar = (vf.b) entry2.getValue();
                if (!bVar.a.isEmpty()) {
                    b(new a(u3Var, tVar, w0Var, bVar.a));
                }
            }
        }
    }
}
