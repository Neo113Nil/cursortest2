package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.c;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class d extends c {
    private static final String b = "bundleId";
    private static final String c = "dynamicMarkup";

    public d(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.c
    public c.a a() {
        c.a a = super.a();
        if (this.a.optString("bundleId", null) == null) {
            a.b = a(a.d);
        }
        return a;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.c
    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("ad_click_dest[\\s].*?=[\\s].*?\\\"([\\S].*?)\\\"").matcher(str);
        if (matcher.find() && matcher.groupCount() > 0) {
            return matcher.group(1);
        }
        return null;
    }
}
