package com.my.target;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.models.ImageData;
import com.yandex.div.storage.database.StorageSchema;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j8 {
    protected final y2 a;
    private final y b;
    private final n c;
    private boolean d = true;

    protected j8(y yVar, n nVar) {
        this.b = yVar;
        this.c = nVar;
        this.a = y2.a(yVar, nVar);
    }

    public static j8 a(y yVar, n nVar) {
        return new j8(yVar, nVar);
    }

    private static void c(JSONObject jSONObject, i8 i8Var) {
        try {
            e(jSONObject.optJSONObject("featureFlags"), i8Var);
        } catch (Throwable unused) {
        }
    }

    private static void d(JSONObject jSONObject, i8 i8Var) {
        boolean optBoolean;
        if (jSONObject != null) {
            try {
                optBoolean = jSONObject.optBoolean("isHitMapEnabled");
            } catch (Throwable unused) {
            }
            i8Var.f().a(optBoolean);
        }
        optBoolean = false;
        i8Var.f().a(optBoolean);
    }

    private static void e(JSONObject jSONObject, i8 i8Var) {
        if (jSONObject == null) {
            return;
        }
        d(jSONObject.optJSONObject("interstitial"), i8Var);
    }

    k8 b(JSONObject jSONObject, i8 i8Var) {
        k8 a = k8.a(i8Var);
        a.a(i8Var.i());
        this.a.a(jSONObject, a);
        if (!jSONObject.has("title")) {
            a.f(true);
        }
        if (TextUtils.isEmpty(a.L()) || a.y() == null) {
            return null;
        }
        a.n(jSONObject.optString("cardID", a.x()));
        return a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        if (r0.equals("banner") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i8 a(JSONObject jSONObject, String str, s sVar, u uVar) {
        String optString = jSONObject.optString("type", "");
        char c = 0;
        u0 a = this.a.a(jSONObject, uVar.a("<banner>").c(0), "<no-banner-id>");
        String str2 = a.b;
        long j = -1;
        if (str2 != null) {
            try {
                Long l = Long.getLong(str2);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (Throwable unused) {
            }
        }
        w0 a2 = this.c.a().a(a);
        a2.a().b(uVar.a());
        optString.getClass();
        switch (optString.hashCode()) {
            case -1396342996:
                break;
            case 3213227:
                if (optString.equals("html")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 106940687:
                if (optString.equals(NotificationCompat.CATEGORY_PROMO)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 110066619:
                if (optString.equals("fullscreen")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 855533378:
                if (optString.equals("playableAds")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 3:
                r8 a3 = r8.a(a2);
                if (!a(jSONObject, a3, sVar)) {
                    return null;
                }
                a3.a(j);
                return a3;
            case 1:
                p8 a4 = p8.a(a2);
                if (!a(jSONObject, a4, str, sVar)) {
                    return null;
                }
                a4.a(j);
                return a4;
            case 2:
                d9 a5 = d9.a(a2);
                if (!a(jSONObject, a5, str, sVar)) {
                    return null;
                }
                a5.a(j);
                return a5;
            case 4:
                u8 h0 = u8.h0();
                if (!a(jSONObject, h0, sVar)) {
                    return null;
                }
                h0.a(j);
                return h0;
            default:
                sVar.b(q.s);
                return null;
        }
    }

    boolean a(JSONObject jSONObject, r8 r8Var, s sVar) {
        a(jSONObject, r8Var);
        return s8.a(this.b, this.c).a(jSONObject, r8Var, sVar);
    }

    boolean a(JSONObject jSONObject, d9 d9Var, String str, s sVar) {
        JSONObject optJSONObject;
        k8 b;
        u a = u.a(this.c.a());
        a(jSONObject, d9Var);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (optJSONObject2 != null) {
            a(optJSONObject2, d9Var.h0());
        }
        int F = this.b.F();
        if (F > 0) {
            d9Var.e(F);
        } else {
            d9Var.e(jSONObject.optInt("style", d9Var.i0()));
        }
        d9Var.i(jSONObject.optBoolean("closeOnClick", d9Var.k0()));
        d9Var.j(jSONObject.optBoolean("videoRequired", d9Var.l0()));
        d9Var.e(jSONObject.optBoolean("isSmartBanner", d9Var.W()));
        d9Var.t(jSONObject.optString("pattern"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StorageSchema.TABLE_CARDS);
        if (optJSONArray != null && qi.d()) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null && (b = b(optJSONObject3, d9Var)) != null) {
                    d9Var.a(b);
                }
            }
        }
        if (d9Var.g0().isEmpty() && (optJSONObject = jSONObject.optJSONObject("video")) != null) {
            eb b2 = eb.b(w0.d, null);
            b2.n(d9Var.x());
            b2.c(d9Var.U());
            if (b3.a(this.b, this.c).a(optJSONObject, b2, x0.e)) {
                th H = b2.H();
                if (!H.f()) {
                    H.b(d9Var.H(), b2.t());
                }
                d9Var.a(b2);
                if (b2.v0()) {
                    d9Var.g(b2.o0());
                    d9Var.c(b2.Y());
                    d9Var.d(b2.Z());
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            if (optJSONObject4 != null) {
                i8 a2 = a(optJSONObject4, str, sVar, a);
                if (a2 != null && a2.x().isEmpty()) {
                    a2.n(d9Var.x());
                }
                d9Var.a(a2);
            }
        }
        String optString = jSONObject.optString("adIconLink");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        d9Var.d(ImageData.newImageData(optString));
        d9Var.A(jSONObject.optString("adIconClickLink"));
        return true;
    }

    boolean a(JSONObject jSONObject, u8 u8Var, s sVar) {
        return v8.b(this.b, this.c).b(jSONObject, u8Var, sVar);
    }

    boolean a(JSONObject jSONObject, p8 p8Var, String str, s sVar) {
        String a;
        a(jSONObject, p8Var);
        String a2 = y2.a(jSONObject, sVar);
        if (TextUtils.isEmpty(a2)) {
            sVar.b(q.q);
            return false;
        }
        if (!TextUtils.isEmpty(str) && (a = y2.a(str, a2)) != null) {
            p8Var.y("mraid");
            a2 = a;
        }
        if (p8Var.E() != null) {
            a2 = fe.a(a2);
        }
        p8Var.i(jSONObject.optBoolean("forceWebMediaPlayback"));
        p8Var.A(a2);
        p8Var.e((float) jSONObject.optDouble("timeToReward", p8Var.f0()));
        return true;
    }

    protected void a(JSONObject jSONObject, lf lfVar) {
        lfVar.c(ya.a(jSONObject, "ctaButtonColor", lfVar.d()));
        lfVar.e(ya.a(jSONObject, "ctaButtonTouchColor", lfVar.f()));
        lfVar.d(ya.a(jSONObject, "ctaButtonTextColor", lfVar.e()));
        lfVar.a(ya.a(jSONObject, "backgroundColor", lfVar.a()));
        lfVar.h(ya.a(jSONObject, "textColor", lfVar.j()));
        lfVar.i(ya.a(jSONObject, "titleTextColor", lfVar.j()));
        lfVar.f(ya.a(jSONObject, "domainTextColor", lfVar.g()));
        lfVar.g(ya.a(jSONObject, "progressBarColor", lfVar.h()));
        lfVar.b(ya.a(jSONObject, "barColor", lfVar.b()));
        float optDouble = (float) jSONObject.optDouble("barOverlayAlpha", lfVar.c());
        if (0.0f <= optDouble && optDouble <= 1.0f) {
            lfVar.a(optDouble);
        }
        String optString = jSONObject.optString("storeIcon");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        lfVar.a(ImageData.newImageData(optString));
    }

    protected void a(JSONObject jSONObject, i8 i8Var) {
        boolean optBoolean;
        this.a.a(jSONObject, i8Var);
        this.d = i8Var.U();
        Boolean c = this.b.c();
        if (c != null) {
            optBoolean = c.booleanValue();
        } else {
            optBoolean = jSONObject.optBoolean("allowBackButton", i8Var.a0());
        }
        i8Var.f(optBoolean);
        i8Var.c((float) jSONObject.optDouble("allowCloseDelay", i8Var.X()));
        i8Var.d((float) jSONObject.optDouble("allowSkipDelay", i8Var.Y()));
        i8Var.h(jSONObject.optBoolean("allowSkip", i8Var.c0()));
        String optString = jSONObject.optString("close_icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            i8Var.c(ImageData.newImageData(optString));
        }
        c(jSONObject, i8Var);
    }
}
