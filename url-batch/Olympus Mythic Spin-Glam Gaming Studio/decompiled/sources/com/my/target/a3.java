package com.my.target;

import android.text.TextUtils;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class a3 extends z2 {
    private a3(y yVar, n nVar) {
        super(yVar, nVar, 1);
    }

    public static a3 a(y yVar, n nVar) {
        return new a3(yVar, nVar);
    }

    boolean b(JSONObject jSONObject, hj hjVar, x0 x0Var, sh shVar) {
        f7 a;
        try {
            List a2 = a(jSONObject.getJSONArray("items"), x0Var.a("items"), shVar);
            if (a2 == null || a2.isEmpty() || (a = a(jSONObject.getJSONObject(POBCTAOverlayData.KEY_CTA_HEADER), x0Var.a(POBCTAOverlayData.KEY_CTA_HEADER), shVar)) == null) {
                return false;
            }
            hjVar.a(new g8(a, a2, jSONObject.has(UnifiedMediationParams.KEY_DISCLAIMER) ? c(jSONObject.getJSONObject(UnifiedMediationParams.KEY_DISCLAIMER)) : null));
            return true;
        } catch (JSONException unused) {
        }
        return false;
    }

    e7 c(JSONObject jSONObject) {
        String a = za.a(jSONObject, "text");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new e7(a);
    }

    public boolean a(JSONObject jSONObject, hj hjVar, x0 x0Var, sh shVar) {
        if (a(jSONObject, hjVar, x0Var)) {
            return true;
        }
        float t = hjVar.t();
        if (t <= 0.0f) {
            x0Var.c(3007, "dur=" + t);
            return false;
        }
        hjVar.B(jSONObject.optString("closeActionText", "Close"));
        hjVar.D(jSONObject.optString("replayActionText", hjVar.k0()));
        hjVar.C(jSONObject.optString("closeDelayActionText", hjVar.b0()));
        Boolean k = this.a.k();
        hjVar.l(k != null ? k.booleanValue() : jSONObject.optBoolean("automute", hjVar.u0()));
        hjVar.o(jSONObject.optBoolean("showPlayerControls", hjVar.x0()));
        Boolean l = this.a.l();
        hjVar.m(l != null ? l.booleanValue() : jSONObject.optBoolean("autoplay", hjVar.v0()));
        hjVar.n(jSONObject.optBoolean("hasCtaButton", hjVar.w0()));
        a(jSONObject, hjVar);
        JSONObject optJSONObject = jSONObject.optJSONObject("shoppable");
        if (optJSONObject != null) {
            hjVar.a(g(optJSONObject, hjVar));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (optJSONObject2 != null) {
            hjVar.a(qg.a(this.a, this.b).a(optJSONObject2, hjVar.x()));
        }
        c(jSONObject, hjVar);
        try {
            return b(jSONObject.getJSONObject("videoMotionData"), hjVar, x0Var.a("videoMotionData"), shVar);
        } catch (JSONException e) {
            x0Var.c(3001, "cVMPpB: exception=" + gi.b(e));
            e.printStackTrace();
            return false;
        }
    }

    f7 a(JSONObject jSONObject, x0 x0Var, sh shVar) {
        String a = za.a(jSONObject, "icon");
        if (TextUtils.isEmpty(a)) {
            mi.a("CommonVideoMotionParser: can't parse header, icon is empty");
            return null;
        }
        String a2 = za.a(jSONObject, "title");
        if (TextUtils.isEmpty(a2)) {
            mi.a("CommonVideoMotionParser: can't parse header, title is empty");
            return null;
        }
        String a3 = za.a(jSONObject, "linkText");
        if (TextUtils.isEmpty(a3)) {
            mi.a("CommonVideoMotionParser: can't parse header, link text is empty");
            return null;
        }
        String a4 = za.a(jSONObject, "ageRestrictionText");
        if (TextUtils.isEmpty(a4)) {
            mi.a("CommonVideoMotionParser: can't parse header, age restriction is empty");
            return null;
        }
        String a5 = za.a(jSONObject, "adDisclaimerText");
        if (TextUtils.isEmpty(a5)) {
            mi.a("CommonVideoMotionParser: can't parse header, ad disclaimer text is empty");
            return null;
        }
        if (!jSONObject.has("statistics")) {
            mi.a("CommonVideoMotionParser: can't parse header, hasn't stats key");
            return null;
        }
        ei eiVar = new ei(this.a, this.b);
        th a6 = th.a(x0Var.c(), shVar);
        eiVar.a(a6, jSONObject, "0", 0.0f, x0Var);
        return new f7(a, a2, a3, a4, a5, a6, za.a(jSONObject, "url"), za.a(jSONObject, "deeplink"), za.a(jSONObject, "deeplink_fallback_url"));
    }

    List a(JSONArray jSONArray, x0 x0Var, sh shVar) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length <= 0) {
            mi.a("CommonVideoMotionParser: videoMotionItems size 0");
            return null;
        }
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String a = za.a(jSONObject, "id");
                if (!TextUtils.isEmpty(a)) {
                    String a2 = za.a(jSONObject, "currency");
                    if (!TextUtils.isEmpty(a2)) {
                        String a3 = za.a(jSONObject, "image");
                        if (!TextUtils.isEmpty(a3)) {
                            String a4 = za.a(jSONObject, "text");
                            if (!TextUtils.isEmpty(a4)) {
                                String a5 = za.a(jSONObject, "ctaText");
                                if (!TextUtils.isEmpty(a5) && jSONObject.has("statistics")) {
                                    ei eiVar = new ei(this.a, this.b);
                                    th a6 = th.a(x0Var.c(), shVar);
                                    eiVar.a(a6, jSONObject, a, 0.0f);
                                    arrayList.add(new h8(a, za.a(jSONObject, "price"), za.a(jSONObject, "old_price"), a2, a3, a4, a5, a6, za.a(jSONObject, "url"), za.a(jSONObject, "deeplink"), za.a(jSONObject, "deeplink_fallback_url")));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                x0Var.a(3001, "message=" + e.getMessage(), e);
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
