package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class c {
    private static final String b = "MraidParser";
    private static final String c = "markup";
    private static final String d = "advDomain";
    private static final String e = "creativeId";
    private static final String f = "content";
    protected JSONObject a;

    public class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;

        public a() {
        }
    }

    public c(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public a a() {
        a aVar = new a();
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("content");
                aVar.a = this.a.getString("creativeId");
                aVar.c = this.a.optString(d, null);
                aVar.d = a(new JSONObject(string));
                Logger.d(b, "mraid Markup (url encoded)=", aVar.d);
                aVar.b = a(aVar.d);
                Logger.d(b, "mraid clickURL = ", aVar.b);
                aVar.e = b(aVar.d);
                Logger.d(b, "mraid videoUrl = ", aVar.e);
            } catch (JSONException e2) {
                Logger.d(b, "mraid error ", e2.getMessage(), " parsing", this.a.toString());
            }
        }
        return aVar;
    }

    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("<a.*?id=\"liftoff-link\".*a>", 2).matcher(str);
        if (matcher.find()) {
            return c(matcher.group(0));
        }
        return null;
    }

    private String b(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("videoSrc:%20%22(.*?)%22", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String c(String str) {
        String e2 = n.e(com.safedk.android.utils.g.a("href=\"([^\"]+)\""), str);
        Logger.d(b, "found click url: ", e2);
        return e2;
    }
}
