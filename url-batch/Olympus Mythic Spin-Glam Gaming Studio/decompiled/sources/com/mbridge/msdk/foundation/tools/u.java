package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DomainDeviceInfo.java */
/* loaded from: classes5.dex */
public class u extends e {
    public int w;
    public int x;

    public u(Context context) {
        super(context);
        this.x = m0.x();
        this.w = m0.h();
    }

    @Override // com.mbridge.msdk.foundation.tools.e
    public JSONObject a() {
        JSONObject a = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.x + "");
                jSONObject.put("dmf", this.w);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DomainDeviceInfo", e.getMessage());
            }
        }
        return a;
    }
}
