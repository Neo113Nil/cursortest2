package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.models.ShareButtonData;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class p0 extends z2 {
    private p0(y yVar, n nVar) {
        super(yVar, nVar, 1);
    }

    public static p0 a(y yVar, n nVar) {
        return new p0(yVar, nVar);
    }

    private boolean c(JSONObject jSONObject, eb ebVar) {
        q0 b;
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            mi.a("AudioBannerParser: Mediafiles array is empty");
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (b = b(optJSONObject, ebVar.x())) != null) {
                ebVar.a(b);
                return true;
            }
        }
        return false;
    }

    public boolean b(JSONObject jSONObject, eb ebVar) {
        if (a(jSONObject, ebVar, x0.e)) {
            return true;
        }
        if (((float) jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d)) <= 0.0f) {
            return false;
        }
        ebVar.m(jSONObject.optBoolean("autoplay", ebVar.v0()));
        ebVar.n(jSONObject.optBoolean("hasCtaButton", ebVar.w0()));
        ebVar.A(jSONObject.optString("adText", ebVar.X()));
        a(jSONObject, ebVar);
        c(jSONObject, (z0) ebVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("shareButtons");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ShareButtonData newData = ShareButtonData.newData();
                    newData.setName(optJSONObject.optString("name"));
                    newData.setUrl(optJSONObject.optString("url"));
                    newData.setImageUrl(optJSONObject.optString(UnifiedMediationParams.KEY_IMAGE_URL));
                    ebVar.a(newData);
                }
            }
        }
        return c(jSONObject, ebVar);
    }

    private void a(JSONObject jSONObject, eb ebVar) {
        a(jSONObject, (z0) ebVar);
        Boolean h = this.a.h();
        ebVar.i(h != null ? h.booleanValue() : jSONObject.optBoolean("allowSeek", ebVar.r0()));
        Boolean i = this.a.i();
        ebVar.j(i != null ? i.booleanValue() : jSONObject.optBoolean("allowSkip", ebVar.s0()));
        Boolean j = this.a.j();
        ebVar.k(j != null ? j.booleanValue() : jSONObject.optBoolean("allowTrackChange", ebVar.t0()));
    }

    q0 b(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString("src");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        q0 a = q0.a(optString, z2.a(jSONObject));
        a.a(jSONObject.optInt(VastAttributes.BITRATE));
        return a;
    }
}
