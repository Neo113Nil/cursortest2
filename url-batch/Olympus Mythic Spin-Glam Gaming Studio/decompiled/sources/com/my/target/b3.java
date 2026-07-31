package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class b3 extends z2 {
    private b3(y yVar, n nVar) {
        super(yVar, nVar, 2);
    }

    public static b3 a(y yVar, n nVar) {
        return new b3(yVar, nVar);
    }

    public boolean a(JSONObject jSONObject, eb ebVar, x0 x0Var) {
        if (a(jSONObject, (z0) ebVar, x0Var)) {
            return true;
        }
        float t = ebVar.t();
        if (t <= 0.0f) {
            x0Var.a(3007, "wrong parsed getDuration()=" + t);
            return false;
        }
        ebVar.B(jSONObject.optString("closeActionText", "Close"));
        ebVar.D(jSONObject.optString("replayActionText", ebVar.k0()));
        ebVar.C(jSONObject.optString("closeDelayActionText", ebVar.b0()));
        Boolean k = this.a.k();
        ebVar.l(k != null ? k.booleanValue() : jSONObject.optBoolean("automute", ebVar.u0()));
        ebVar.o(jSONObject.optBoolean("showPlayerControls", ebVar.x0()));
        Boolean l = this.a.l();
        ebVar.m(l != null ? l.booleanValue() : jSONObject.optBoolean("autoplay", ebVar.v0()));
        ebVar.n(jSONObject.optBoolean("hasCtaButton", ebVar.w0()));
        ebVar.d((float) jSONObject.optDouble("allowSkipDelay", ebVar.Z()));
        ebVar.j(jSONObject.optBoolean("allowSkip", ebVar.s0()));
        a(jSONObject, ebVar);
        JSONObject optJSONObject = jSONObject.optJSONObject("shoppable");
        if (optJSONObject != null) {
            ebVar.a(g(optJSONObject, ebVar));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (optJSONObject2 != null) {
            ebVar.a(qg.a(this.a, this.b).a(optJSONObject2, ebVar.x()));
        }
        c(jSONObject, ebVar);
        String optString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(optString)) {
            ebVar.c(ImageData.newImageData(optString, jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight")));
        }
        String optString2 = jSONObject.optString("aboutCompany");
        if (!TextUtils.isEmpty(optString2)) {
            ebVar.E(optString2);
        }
        String optString3 = jSONObject.optString("marker");
        if (!TextUtils.isEmpty(optString3)) {
            ebVar.F(optString3);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("cta");
        if (optJSONObject3 != null) {
            ebVar.a(d(optJSONObject3, ebVar));
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("qrCta");
        if (optJSONObject4 != null) {
            ebVar.a(b(optJSONObject4));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("postView");
        if (optJSONObject5 != null) {
            ebVar.a(f(optJSONObject5, ebVar));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        x0 a = x0Var.a("mediafiles");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mi.a("CommonVideoParser: Mediafiles array is empty");
            a.a(3006, "unable to find mediaFiles in MediaBanner");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
            x0 b = a.b(i);
            if (optJSONObject6 != null) {
                dj a2 = a(optJSONObject6, ebVar.x(), b);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } else {
                b.c(3007);
            }
        }
        if (arrayList.size() > 0) {
            dj a3 = dj.a(arrayList, this.b.l());
            if (a3 != null) {
                ebVar.a(a3);
                return true;
            }
            x0Var.c(3007, "Unable to find best video data for q=" + this.b.l());
        }
        x0Var.c(3008, "no video data parsed");
        return false;
    }

    private dj a(JSONObject jSONObject, String str, x0 x0Var) {
        String optString = jSONObject.optString("src");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (!TextUtils.isEmpty(optString) && optInt > 0 && optInt2 > 0) {
            dj a = dj.a(optString, optInt, optInt2, z2.a(jSONObject));
            a.a(jSONObject.optInt(VastAttributes.BITRATE));
            if (!a.getUrl().endsWith(".m3u8") || ib.b()) {
                return a;
            }
            mi.a("CommonVideoParser: HLS Video does not supported, add 'androidx.media3:media3-exoplayer-hls' dependency to play HLS video ");
            x0Var.a(3009, "HLS Video does not supported, add...");
            return null;
        }
        x0Var.a(3007, "bad mediafile object, src = " + optString + ", width = " + optInt + ", height = " + optInt2);
        return null;
    }
}
