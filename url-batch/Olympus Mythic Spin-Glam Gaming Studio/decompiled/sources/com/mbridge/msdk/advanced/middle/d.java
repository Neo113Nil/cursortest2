package com.mbridge.msdk.advanced.middle;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativeAdvancedShowListenerImpl.java */
/* loaded from: classes11.dex */
public class d {
    protected NativeAdvancedAdListener a;
    protected CampaignEx b;
    protected c c;

    public d(c cVar, NativeAdvancedAdListener nativeAdvancedAdListener, CampaignEx campaignEx) {
        this.c = cVar;
        this.a = nativeAdvancedAdListener;
        this.b = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds, String str) {
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, mBridgeIds.getUnitId(), str);
    }

    public void b(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClick(mBridgeIds);
        }
    }

    public void c(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClose(mBridgeIds);
            c cVar = this.c;
            if (cVar != null) {
                cVar.E = false;
            }
        }
    }

    public void d(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLeaveApp(mBridgeIds);
        }
    }

    public void e(MBridgeIds mBridgeIds) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.E = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", "0");
            jSONObject.put("allow_skip", this.c.f());
        } catch (JSONException e) {
            q0.b("NativeAdvancedShowListenerImpl", "e:" + e.getMessage());
        }
        j.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, mBridgeIds.getUnitId(), jSONObject.toString());
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLogImpression(mBridgeIds);
        }
    }

    public void f(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.showFullScreen(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.closeFullScreen(mBridgeIds);
        }
    }
}
