package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;
import com.my.target.y3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class y2 {
    private final ei a;
    private final y b;
    private final n c;
    private String d;
    private boolean e = true;

    private y2(y yVar, n nVar) {
        this.b = yVar;
        this.c = nVar;
        this.a = ei.a(yVar, nVar);
    }

    public static y2 a(y yVar, n nVar) {
        return new y2(yVar, nVar);
    }

    private static void c(JSONObject jSONObject, b bVar) {
        boolean optBoolean;
        if (jSONObject != null) {
            try {
                optBoolean = jSONObject.optBoolean("ignoreBannerStatOnCardClick");
            } catch (Throwable unused) {
            }
            bVar.e().a(optBoolean);
        }
        optBoolean = false;
        bVar.e().a(optBoolean);
    }

    private static void d(JSONObject jSONObject, b bVar) {
        boolean optBoolean;
        if (jSONObject != null) {
            try {
                optBoolean = jSONObject.optBoolean("useClickHandlerV2");
            } catch (Throwable unused) {
            }
            bVar.e().b(optBoolean);
        }
        optBoolean = false;
        bVar.e().b(optBoolean);
    }

    public u0 b(JSONObject jSONObject, u uVar, String str) {
        return a(jSONObject, "impression_id", uVar, str);
    }

    public static String a(JSONObject jSONObject, s sVar) {
        return a(jSONObject, sVar, x0.e);
    }

    void b(JSONObject jSONObject, b bVar, x0 x0Var) {
        Disclaimer disclaimer;
        y3 a = y3.a(mg.a(jSONObject, x0Var).a("disclaimerInfo"));
        if (a != null) {
            disclaimer = new Disclaimer(a.a, (String) y2$$ExternalSyntheticBackport0.m(a.c, ""), (String) y2$$ExternalSyntheticBackport0.m(a.b, ""), a.d);
            for (y3.a aVar : a.e) {
                x5 x5Var = aVar.c;
                if (x5Var != null) {
                    disclaimer.images.put(aVar.a, new Disclaimer.ImageInfo(aVar.b, x5Var.a, x5Var.b, x5Var.c));
                }
            }
            bVar.a(disclaimer.disclaimerType);
            bVar.j(disclaimer.text);
        } else {
            String optString = jSONObject.optString(UnifiedMediationParams.KEY_DISCLAIMER);
            if (!TextUtils.isEmpty(optString)) {
                bVar.j(optString);
            }
            if (jSONObject.has("disclaimer_id")) {
                bVar.a(a(jSONObject.optInt("disclaimer_id", -1), x0Var.a("disclaimer_id")));
            } else if (jSONObject.has(UnifiedMediationParams.KEY_DISCLAIMER)) {
                x0Var.a("disclaimer_id").c(3006, "has disclaimer, but has no disclaimer_id");
            }
            disclaimer = bVar.q() == 0 ? null : new Disclaimer(bVar.q(), bVar.o());
        }
        bVar.a(disclaimer);
    }

    public static String a(JSONObject jSONObject, s sVar, x0 x0Var) {
        String str = null;
        if (jSONObject.has("src") || jSONObject.has("source")) {
            String optString = jSONObject.optString("src", "");
            if (!TextUtils.isEmpty(optString) && (str = p4.a(optString)) != null) {
                return str;
            }
            String optString2 = jSONObject.optString("source", "");
            return !TextUtils.isEmpty(optString2) ? ti.a(optString2) : str;
        }
        sVar.b(q.n);
        x0Var.a("src").c(3006);
        x0Var.a("source").c(3006);
        return null;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder(str2);
            if (sb.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int start = matcher.start();
                    sb.delete(start, matcher.end());
                    sb.insert(start, "<script src=\"" + str + "\"></script>");
                    return sb.toString();
                }
            }
        }
        return null;
    }

    private static e a(JSONObject jSONObject, String str, int i, y yVar, boolean z, x0 x0Var) {
        e a = yVar.a();
        if (a == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("adChoices");
            x0 a2 = x0Var.a("adChoices");
            if (optJSONObject != null) {
                e a3 = l.a().a(optJSONObject, str, yVar.a, i, z, a2);
                if (a3 == null) {
                    a2.c(3007, "adChoices element is not parsed");
                }
                return a3;
            }
            if (a2.a()) {
                a2.c(3006);
            }
        }
        return a;
    }

    public u0 a(JSONObject jSONObject, u uVar, String str) {
        return a(jSONObject, "impressionId", uVar, str);
    }

    private u0 a(JSONObject jSONObject, String str, u uVar, String str2) {
        String str3;
        if (jSONObject.has(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an)) {
            String optString = jSONObject.optString(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an);
            if (TextUtils.isEmpty(optString)) {
                uVar.a(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an).a(3007);
            } else {
                str3 = optString;
                return new u0(str3, ya.c(jSONObject, str), ya.c(jSONObject, "padId"), ya.c(jSONObject, "patternId"), ya.a(jSONObject, "dspId"), ya.b(jSONObject, "labels"));
            }
        } else {
            uVar.a(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an).a(3006);
        }
        str3 = str2;
        return new u0(str3, ya.c(jSONObject, str), ya.c(jSONObject, "padId"), ya.c(jSONObject, "patternId"), ya.a(jSONObject, "dspId"), ya.b(jSONObject, "labels"));
    }

    private static void b(JSONObject jSONObject, b bVar) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("featureFlags");
            c(optJSONObject, bVar);
            d(optJSONObject, bVar);
        } catch (Throwable unused) {
        }
    }

    public void a(JSONObject jSONObject, b bVar) {
        a(jSONObject, bVar, x0.e);
    }

    public void a(JSONObject jSONObject, b bVar, x0 x0Var) {
        boolean optBoolean;
        boolean optBoolean2;
        Boolean J = this.b.J();
        if (J != null) {
            this.e = J.booleanValue();
            this.a.a(J);
            bVar.c(this.e);
        } else if (jSONObject.has("logErrors")) {
            boolean optBoolean3 = jSONObject.optBoolean("logErrors", true);
            this.e = optBoolean3;
            this.a.a(Boolean.valueOf(optBoolean3));
            bVar.c(this.e);
        }
        String optString = jSONObject.optString("id");
        this.d = optString;
        if (TextUtils.isEmpty(optString)) {
            if (!jSONObject.has(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an) && x0Var.a()) {
                x0Var.a(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an).a(3006);
            }
            this.d = jSONObject.optString(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an, bVar.x());
        } else {
            x0Var.a("id").c(3004);
        }
        bVar.n(this.d);
        String optString2 = jSONObject.optString("type");
        if (!TextUtils.isEmpty(optString2)) {
            bVar.y(optString2);
        }
        bVar.d(jSONObject.optInt("width", bVar.R()));
        bVar.b(jSONObject.optInt("height", bVar.v()));
        bVar.k(jSONObject.optString("discount", bVar.r()));
        bVar.q(jSONObject.optString("newPrice", bVar.C()));
        bVar.r(jSONObject.optString("oldPrice", bVar.D()));
        String optString3 = jSONObject.optString("ageRestrictions");
        if (!TextUtils.isEmpty(optString3)) {
            bVar.b(optString3);
        }
        String optString4 = jSONObject.optString("erid");
        if (!TextUtils.isEmpty(optString4)) {
            bVar.m(optString4);
        }
        String optString5 = jSONObject.optString("deeplink");
        if (!TextUtils.isEmpty(optString5)) {
            bVar.h(optString5);
        }
        String optString6 = jSONObject.optString("trackingLink");
        if (!TextUtils.isEmpty(optString6)) {
            bVar.x(optString6);
        }
        String optString7 = jSONObject.optString("ctaLink");
        if (!TextUtils.isEmpty(optString7)) {
            bVar.f(optString7);
        }
        String optString8 = jSONObject.optString("bundle_id");
        if (!TextUtils.isEmpty(optString8)) {
            bVar.c(optString8);
        }
        String optString9 = jSONObject.optString("urlscheme");
        if (!TextUtils.isEmpty(optString9)) {
            bVar.z(optString9);
        }
        if (x0Var.a() && TextUtils.isEmpty(optString6) && TextUtils.isEmpty(optString7)) {
            x0Var.a("trackingLink").c(3006);
            x0Var.a("ctaLink").c(3006);
        }
        Boolean z = this.b.z();
        if (z != null) {
            optBoolean = z.booleanValue();
        } else {
            optBoolean = jSONObject.optBoolean("openInBrowser", bVar.V());
        }
        bVar.d(optBoolean);
        Boolean r = this.b.r();
        if (r != null) {
            optBoolean2 = r.booleanValue();
        } else {
            optBoolean2 = jSONObject.optBoolean("directLink", bVar.T());
        }
        bVar.b(optBoolean2);
        bVar.s(jSONObject.optString("paidType", bVar.F()));
        String optString10 = jSONObject.optString("navigationType");
        if (!TextUtils.isEmpty(optString10)) {
            if ("deeplink".equals(optString10)) {
                x0Var.a("navigationType").c(3005, "legacy value " + optString10);
                bVar.p("store");
            } else {
                bVar.p(optString10);
            }
        } else if (x0Var.a()) {
            x0Var.a("navigationType").c(3006);
        }
        String a = za.a(jSONObject, "storeType");
        bVar.u(a);
        if (TextUtils.isEmpty(a) && "store".equals(optString10)) {
            x0Var.a("storeType").c(3006);
        }
        String optString11 = jSONObject.optString("title");
        if (!TextUtils.isEmpty(optString11)) {
            bVar.w(optString11);
        } else if (x0Var.a()) {
            x0Var.a("title").c(3006);
        }
        String optString12 = jSONObject.optString("description");
        if (!TextUtils.isEmpty(optString12)) {
            bVar.i(optString12);
        }
        b(jSONObject, bVar, x0Var);
        if (jSONObject.has("votes")) {
            int optInt = jSONObject.optInt("votes", -1);
            if (optInt < 0) {
                if (x0Var.a()) {
                    x0Var.a("votes").c(3007, String.valueOf(jSONObject.opt("votes")));
                }
            } else {
                bVar.c(optInt);
            }
        }
        String optString13 = jSONObject.optString("category");
        if (!TextUtils.isEmpty(optString13)) {
            bVar.d(optString13);
        }
        String optString14 = jSONObject.optString("subcategory");
        if (!TextUtils.isEmpty(optString14)) {
            bVar.v(optString14);
        }
        String optString15 = jSONObject.optString("domain");
        if (!TextUtils.isEmpty(optString15)) {
            bVar.l(optString15);
        }
        bVar.a((float) jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, bVar.t()));
        if (jSONObject.has("rating")) {
            float optDouble = (float) jSONObject.optDouble("rating", -1.0d);
            double d = optDouble;
            if (d <= 5.0d && d >= 0.0d) {
                bVar.b(optDouble);
            } else {
                x0Var.a("rating").c(3007, Float.toString(optDouble));
            }
        }
        boolean has = jSONObject.has("ctaText");
        bVar.g(jSONObject.optString("ctaText", bVar.l()));
        if (!TextUtils.isEmpty(optString7) && !has) {
            x0Var.a("ctaText").c(3006);
        }
        if (has && TextUtils.isEmpty(optString7) && TextUtils.isEmpty(optString6)) {
            x0Var.a("ctaText").c(3008, "ctaText is not empty, but ctaLink and trackingLink are empty");
        }
        String optString16 = jSONObject.optString("iconLink");
        int optInt2 = jSONObject.optInt("iconWidth");
        int optInt3 = jSONObject.optInt("iconHeight");
        if (!TextUtils.isEmpty(optString16)) {
            bVar.a(ImageData.newImageData(optString16, optInt2, optInt3));
        }
        if (x0Var.a()) {
            if (TextUtils.isEmpty(optString16)) {
                x0Var.a("iconLink").c(3006);
            } else if (!ti.e(optString16)) {
                x0Var.a("iconLink").c(3007, optString16);
            }
        }
        String optString17 = jSONObject.optString("imageLink");
        int optInt4 = jSONObject.optInt("imageWidth");
        int optInt5 = jSONObject.optInt("imageHeight");
        if (!TextUtils.isEmpty(optString17)) {
            bVar.b(ImageData.newImageData(optString17, optInt4, optInt5));
        }
        String optString18 = jSONObject.optString("imageDominantColor");
        if (!TextUtils.isEmpty(optString18)) {
            bVar.o(optString18);
        }
        int n = this.b.n();
        if (n >= 0) {
            bVar.a(e2.a(n));
        } else if (jSONObject.has("clickArea")) {
            int optInt6 = jSONObject.optInt("clickArea");
            if (optInt6 <= 0) {
                x0Var.a("clickArea").c(3007, Integer.toString(optInt6));
            } else {
                bVar.a(e2.a(optInt6));
            }
        } else if (jSONObject.has("extendedClickArea")) {
            x0Var.a("extendedClickArea").c(3004);
            if (jSONObject.optBoolean("extendedClickArea", true)) {
                bVar.a(e2.p);
            } else {
                bVar.a(e2.q);
            }
        }
        String optString19 = jSONObject.optString("advertisingLabel", "");
        if (x0Var.a()) {
            if (!jSONObject.has("advertisingLabel")) {
                x0Var.a("advertisingLabel").c(3006);
            } else if (TextUtils.isEmpty(optString19)) {
                x0Var.a("advertisingLabel").c(3007);
            }
        }
        bVar.a(optString19);
        if (jSONObject.has("url_types")) {
            bVar.a(Arrays.asList(jSONObject.optString("url_types").split(StringUtils.COMMA)));
        }
        bVar.a(a(jSONObject, this.d, this.c.j(), this.b, this.e, x0Var));
        JSONObject optJSONObject = jSONObject.optJSONObject("viewability");
        if (optJSONObject != null) {
            x0 a2 = x0Var.a("viewability");
            lj P = bVar.P();
            if (optJSONObject.has("percent")) {
                int optInt7 = optJSONObject.optInt("percent");
                if (optInt7 >= 5 && optInt7 <= 100) {
                    P.c(optInt7 / 100.0f);
                } else {
                    a2.a("percent").a(3007, Integer.toString(optInt7));
                }
            }
            if (optJSONObject.has("rate")) {
                double optDouble2 = optJSONObject.optDouble("rate");
                if (optDouble2 >= 0.01d) {
                    P.b((float) optDouble2);
                } else {
                    a2.a("rate").a(3007, Double.toString(optDouble2));
                }
            }
            if (!optJSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                a2.a(IronSourceConstants.EVENTS_DURATION).c(3006);
            } else {
                float optDouble3 = (float) optJSONObject.optDouble(IronSourceConstants.EVENTS_DURATION);
                if (!Float.isNaN(optDouble3) && optDouble3 >= 0.0d) {
                    P.a(optDouble3);
                } else {
                    a2.a(IronSourceConstants.EVENTS_DURATION).c(3007, Float.toString(optDouble3));
                }
            }
        }
        bVar.a(jSONObject.optBoolean("isAppInWhitelist", bVar.S()));
        bVar.a(a(this.b.x(), jSONObject.optJSONObject("omdata")));
        this.a.a(bVar.H(), jSONObject, this.d, bVar.t(), (TextUtils.isEmpty(optString6) || bVar.T() || ti.d(optString6)) ? x0Var : x0Var.e());
        b(jSONObject, bVar);
        wh.b(bVar.H(), "load", 0);
    }

    public void a(int i) {
        this.a.a(i);
    }

    private int a(int i, x0 x0Var) {
        if (i == 0 || i == 3 || i == 4 || i == 5 || i == 6) {
            return i;
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return i;
            default:
                x0Var.a(3007, Integer.toString(i));
                return 0;
        }
    }

    private de a(de deVar, JSONObject jSONObject) {
        return jSONObject == null ? deVar : ee.a(this.c, this.b.b, this.e).a(deVar, jSONObject);
    }
}
