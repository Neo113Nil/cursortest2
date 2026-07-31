package yads;

import com.ironsource.O6;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class gr1 {
    public static JSONObject a(er1 er1Var, String str, MediatedBannerSize mediatedBannerSize) {
        String str2 = er1Var.b;
        Map map = er1Var.h;
        Map map2 = er1Var.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(O6.G1, str2);
            if (map != null) {
                jSONObject.put("bidding_info", new JSONObject(map));
            }
            jSONObject.put("network_data", new JSONObject(map2));
            jSONObject.put("bidder_token", str);
            if (mediatedBannerSize == null) {
                return jSONObject;
            }
            jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
            return jSONObject;
        } catch (JSONException unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
