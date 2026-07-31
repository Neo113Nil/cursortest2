package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import com.yandex.div.storage.database.StorageSchema;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class tc {
    private final y a;
    private final n b;
    private final y2 c;

    private tc(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
        this.c = y2.a(yVar, nVar);
    }

    public static tc a(y yVar, n nVar) {
        return new tc(yVar, nVar);
    }

    public u0 a(JSONObject jSONObject, u uVar, String str) {
        return this.c.a(jSONObject, uVar, str);
    }

    public void a(JSONObject jSONObject, sc scVar, s sVar, x0 x0Var, sh shVar) {
        JSONObject optJSONObject;
        this.c.a(jSONObject, scVar, x0Var);
        JSONArray optJSONArray = jSONObject.optJSONArray(StorageSchema.TABLE_CARDS);
        x0 d = x0Var.a(StorageSchema.TABLE_CARDS).d();
        if (optJSONArray != null && qi.d()) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                x0 b = d.b(i);
                if (optJSONObject2 != null) {
                    uc a = a(optJSONObject2, scVar, b, shVar);
                    if (a != null) {
                        scVar.a(a);
                    }
                } else {
                    b.c(3007);
                }
            }
            return;
        }
        if (jSONObject.has("content")) {
            scVar.A(jSONObject.optString("ctcText", scVar.a0()));
            String optString = jSONObject.optString("ctcIconLink");
            if (!TextUtils.isEmpty(optString)) {
                scVar.c(ImageData.newImageData(optString));
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("content");
            if (optJSONObject3 != null) {
                scVar.a(a(optJSONObject3, scVar, sVar, x0Var.a("content").d()));
            }
        }
        if (jSONObject.has("html") && (optJSONObject = jSONObject.optJSONObject("html")) != null) {
            scVar.a(a(optJSONObject, sVar, x0Var.a("html").d()));
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("video");
        if (optJSONObject4 != null) {
            eb b2 = eb.b(x0Var.c(), shVar);
            b2.n(scVar.x());
            b2.c(scVar.U());
            if (b3.a(this.a, this.b).a(optJSONObject4, b2, x0Var.a("video"))) {
                th H = b2.H();
                if (!H.f()) {
                    H.b(scVar.H(), b2.t());
                }
                scVar.a(b2);
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("collage");
        if (optJSONObject5 != null) {
            c7 a2 = v2.a(this.a, this.b).a(optJSONObject5, x0Var.a("collage"), shVar);
            if (a2 != null) {
                scVar.a(a2);
            }
        }
    }

    uc a(JSONObject jSONObject, sc scVar, x0 x0Var, sh shVar) {
        uc a = uc.a(scVar, shVar);
        this.c.a(jSONObject, a, x0Var);
        String optString = jSONObject.optString("discount");
        if (TextUtils.isEmpty(optString)) {
            x0Var.a("discount").c(3007);
        } else {
            a.k(optString);
        }
        String optString2 = jSONObject.optString("price");
        if (TextUtils.isEmpty(optString2)) {
            x0Var.a("price").c(3007);
        } else {
            a.B(optString2);
        }
        String optString3 = jSONObject.optString("oldPrice");
        if (TextUtils.isEmpty(optString3)) {
            x0Var.a("oldPrice").c(3007);
        } else {
            a.r(optString3);
        }
        String optString4 = jSONObject.optString("currency");
        if (TextUtils.isEmpty(optString4)) {
            x0Var.a("currency").c(3007);
        } else {
            a.A(optString4);
        }
        if (TextUtils.isEmpty(a.L())) {
            x0Var.a("trackingLink").c(3006);
            return null;
        }
        if (a.y() == null) {
            x0Var.a("imageLink").c(3006);
            return null;
        }
        a.n(jSONObject.optString("cardID", a.x()));
        return a;
    }

    wc a(JSONObject jSONObject, sc scVar, s sVar, x0 x0Var) {
        String optString = jSONObject.optString("type");
        if (!"html".equals(optString)) {
            mi.a("NativeAdBannerParser: NativeAdContent banner has type " + optString);
            x0Var.a("type").c(3007, optString);
            return null;
        }
        String a = y2.a(jSONObject, sVar, x0Var);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        wc a2 = wc.a(scVar, a);
        this.c.a(jSONObject, a2, x0Var);
        return a2;
    }

    ad a(JSONObject jSONObject, s sVar, x0 x0Var) {
        String a = y2.a(jSONObject, sVar, x0Var);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        ad A = ad.A(a);
        this.c.a(jSONObject, A, x0Var);
        return A;
    }
}
