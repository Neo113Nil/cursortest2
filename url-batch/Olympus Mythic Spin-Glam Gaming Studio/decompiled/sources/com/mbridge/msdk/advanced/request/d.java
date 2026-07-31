package com.mbridge.msdk.advanced.request;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeAdvancedResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String c = "d";
    private int a;
    private String b;

    private void b(List<g> list, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(optInt, jSONObject.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String optString = jSONObject.optString("version");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        CampaignUnit parseV5CampaignUnit = "v5".equals(optString) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(optJSONObject, this.b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.b);
        if (parseV5CampaignUnit != null && parseV5CampaignUnit.getAds() != null && parseV5CampaignUnit.getAds().size() > 0) {
            a(list, parseV5CampaignUnit);
            saveRequestTime(parseV5CampaignUnit.getAds().size());
        } else {
            String msg = parseV5CampaignUnit != null ? parseV5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString("msg");
            }
            a(optInt, msg);
        }
    }

    public abstract void a(int i, String str);

    public void a(String str) {
        this.b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(c, "errorCode = " + aVar.a);
        a(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.b) == null) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            b(aVar.b, eVar.c);
        } else if (i == 1) {
            a(aVar.b, eVar.c);
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(optInt, jSONObject.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit parseV5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.b);
        if (parseV5CampaignUnit != null && parseV5CampaignUnit.getListFrames() != null && parseV5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = parseV5CampaignUnit.getListFrames();
            a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = parseV5CampaignUnit != null ? parseV5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString("msg");
            }
            a(optInt, msg);
        }
    }
}
