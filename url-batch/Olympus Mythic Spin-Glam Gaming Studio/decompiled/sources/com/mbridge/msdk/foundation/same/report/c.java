package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: EventLibraryCommon.java */
/* loaded from: classes11.dex */
public class c {
    private static final String a = "c";

    /* compiled from: EventLibraryCommon.java */
    class a implements com.mbridge.msdk.tracker.h {
        a() {
        }

        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject i = eVar.i();
            if (i == null) {
                i = new JSONObject();
            }
            try {
                i.put("key", eVar.g());
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                int s = m0.s(d);
                if (!i.has("network_type")) {
                    i.put("network_type", s);
                    i.put("network_str", m0.a(d, s));
                }
                if (!i.has("st")) {
                    i.put("st", System.currentTimeMillis());
                }
                String optString = i.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(optString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.r.get(optString);
                    i.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !i.has("b")) {
                    i.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g) && !i.has(c.a)) {
                    i.put(c.a, com.mbridge.msdk.foundation.same.a.g);
                }
            } catch (Exception e) {
                q0.b(c.a, e.getMessage());
            }
            return i;
        }
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (f == null) {
            return true;
        }
        return b.a(f, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove("ua");
            jSONObject.remove(POBConstants.KEY_LANGUAGE);
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove(CommonUrlParts.OS_VERSION);
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(O6.X0);
        jSONObject.remove("gaid2");
        jSONObject.remove(CommonUrlParts.HUAWEI_OAID);
        jSONObject.remove("az_aid_info");
    }
}
