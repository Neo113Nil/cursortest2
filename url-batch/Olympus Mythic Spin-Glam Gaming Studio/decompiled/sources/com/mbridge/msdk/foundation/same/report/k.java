package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: ReportUtilDiff.java */
/* loaded from: classes3.dex */
public class k {
    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String q = m0.q();
            if (!TextUtils.isEmpty(q)) {
                jSONObject.put(CommonUrlParts.MANUFACTURER, q);
            }
            int n = m0.n();
            if (n != -1) {
                jSONObject.put("sdkint", n);
            }
            String y = m0.y(context);
            if (!TextUtils.isEmpty(y)) {
                jSONObject.put("is24H", y);
            }
            String z = m0.z();
            if (!TextUtils.isEmpty(z)) {
                jSONObject.put("totalram", z);
            }
            String z2 = m0.z(context);
            if (!TextUtils.isEmpty(z2)) {
                jSONObject.put("totalmemory", z2);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (gVar.y0() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.e()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.g.e());
        }
        return jSONObject;
    }

    public static void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, Context context) {
    }
}
