package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CommonDeviceInfo.java */
/* loaded from: classes3.dex */
public class a {
    public static JSONObject a() {
        JSONObject jSONObject;
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        try {
            jSONObject = j.a(d).c();
        } catch (Exception e) {
            q0.b("CommonDeviceInfo", "getCommonProperty error", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                jSONObject.put("c", com.mbridge.msdk.foundation.same.a.g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.S);
            String a = Aa.a();
            if (a == null) {
                a = "";
            }
            jSONObject.put("channel", a);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.b().a());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            JSONObject a2 = a(f);
            if (a2 != null) {
                String jSONObject2 = a2.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    String b = k0.b(jSONObject2);
                    if (!TextUtils.isEmpty(b)) {
                        jSONObject.put("dvi", b);
                    }
                }
            }
            jSONObject.put("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(v0.m(d)));
            String str = "UNKNOWN";
            if (f != null) {
                str = f.k();
                jSONObject.put("a_stid", f.a());
            }
            jSONObject.put("country_code", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(com.mbridge.msdk.setting.g gVar) {
        try {
            return j.a(com.mbridge.msdk.foundation.controller.c.n().d(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
