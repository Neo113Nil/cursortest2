package sg.bigo.ads.db;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes15.dex */
public final class a {
    public int a = 10;
    public int b = 900000;
    public final HashMap<String, C1887a> c;

    /* renamed from: sg.bigo.ads.db.a$a, reason: collision with other inner class name */
    public static class C1887a {
        String a;
        boolean b;
        public boolean c;
        public int d;

        public static C1887a a(String str) {
            C1887a c1887a = new C1887a();
            c1887a.a = str;
            c1887a.b = true;
            c1887a.c = true;
            c1887a.d = BrandSafetyUtils.g;
            return c1887a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.bn.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.a = jSONObject.optString("event_id");
            this.b = jSONObject.optInt("status") == 1;
            this.c = jSONObject.optInt(POBCTAOverlayData.KEY_CTA_DELAY) == 1;
            int optInt = jSONObject.optInt("expired") * 1000;
            this.d = optInt;
            if (optInt == 0) {
                this.d = BrandSafetyUtils.g;
            }
        }
    }

    public a() {
        HashMap<String, C1887a> hashMap = new HashMap<>();
        this.c = hashMap;
        b();
        hashMap.put("06002002", C1887a.a("06002002"));
        hashMap.put("06002007", C1887a.a("06002007"));
    }

    private void b() {
        this.a = 10;
        this.b = 900000;
        this.c.clear();
    }

    public final int a() {
        return Math.round(this.a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.a = jSONObject.optInt("delay_num", 10);
        int optInt = jSONObject.optInt("delay_interval") * 1000;
        this.b = optInt;
        if (optInt == 0) {
            this.b = 900000;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("event_config");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            C1887a c1887a = new C1887a();
            c1887a.a(optJSONArray.optJSONObject(i));
            if (r.b((CharSequence) c1887a.a)) {
                this.c.put(c1887a.a, c1887a);
            }
        }
    }

    public final boolean a(String str) {
        C1887a c1887a = this.c.get(str);
        if (c1887a == null) {
            return false;
        }
        return c1887a.b;
    }
}
