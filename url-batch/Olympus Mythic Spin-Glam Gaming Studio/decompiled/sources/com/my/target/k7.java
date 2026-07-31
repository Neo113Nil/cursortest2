package com.my.target;

import android.text.TextUtils;
import com.ironsource.X3;
import com.my.target.common.models.ImageData;
import com.my.target.internal.api.internalnativead.InternalNativeAdParser;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;
import com.my.target.j7;
import com.my.target.tb;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.yandex.div.storage.database.StorageSchema;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class k7 implements InternalNativeAdParser {
    private k7() {
    }

    public static k7 a() {
        return new k7();
    }

    private List b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("image")) == null || (optJSONArray = optJSONObject.optJSONArray(FileUploadManager.i)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            ImageData a = a(optJSONArray.optJSONObject(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public InternalNativeBanner parse(String str, String str2) {
        return parse(str, null, str2);
    }

    private InternalNativeBanner a(JSONObject jSONObject, JSONObject jSONObject2, y yVar, n nVar, s sVar, u uVar) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        y2 a = y2.a(yVar, nVar);
        w0 a2 = nVar.a().a(a.a(jSONObject, uVar, "<no-banner-id>"));
        x0 a3 = uVar.a(a2);
        j7 a4 = j7.a(nVar, a2, jSONObject2 == null ? null : v.a(jSONObject2, a3));
        a.a(jSONObject, a4, a3);
        a4.c(b(jSONObject));
        long optLong = jSONObject.optLong("impressionID", -1L);
        if (optLong != -1) {
            a4.a(optLong);
        } else if (a3.a()) {
            a3.a("impressionID").c(3006);
        }
        String optString = jSONObject.optString(X3.i.m);
        if (!optString.isEmpty()) {
            a4.A(optString);
        } else if (a3.a()) {
            a3.a(X3.i.m).c(3006);
        }
        if (jSONObject.has("content") && (optJSONObject3 = jSONObject.optJSONObject("content")) != null) {
            a4.a(a(optJSONObject3, a4, sVar, a3.a("content").d(), a));
        }
        if (jSONObject.has("video")) {
            a4.a(a(jSONObject.optJSONObject("video"), a4, yVar, nVar, a3.a("video")));
        }
        if (jSONObject.has("html") && (optJSONObject2 = jSONObject.optJSONObject("html")) != null) {
            a4.a(a(optJSONObject2, sVar, a3.a("html").d(), a));
        }
        if (jSONObject.has(StorageSchema.TABLE_CARDS) && (optJSONArray = jSONObject.optJSONArray(StorageSchema.TABLE_CARDS)) != null) {
            a4.b(a(optJSONArray, a4, a3.a(StorageSchema.TABLE_CARDS).d(), a));
        }
        if (jSONObject.has(CreativeInfo.s) && (optJSONObject = jSONObject.optJSONObject(CreativeInfo.s)) != null) {
            b8 c = t7.a().c(optJSONObject, a3.a(CreativeInfo.s).d());
            if (c != null) {
                a4.a(c);
            }
        }
        return v7.a(a4);
    }

    public InternalNativeBanner parse(String str, Map map, String str2) {
        y b = y.b("");
        n a = n.a(0, "nativeads");
        if (str2 != null) {
            a.d(str2);
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                a.h().setCustomParam(str3, (String) map.get(str3));
            }
        }
        a.a(t.a(UUID.randomUUID().toString(), UUID.randomUUID().toString(), 4, vb.b()));
        u a2 = u.a(a.a());
        s c = s.c();
        tb.a a3 = tb.a(a.j());
        tb a4 = a3.a();
        a2.b(3000);
        JSONObject a5 = v.a(str, a3, a4, null, c, a2);
        if (a5 == null) {
            c.b(q.j);
            throw new JSONException("Banner json is empty");
        }
        JSONObject optJSONObject = a5.optJSONObject("featureFlags");
        JSONObject optJSONObject2 = a5.optJSONObject(a.i());
        if (optJSONObject2 == null) {
            c.b(q.j);
            throw new JSONException("Json doesn't have a section");
        }
        JSONArray optJSONArray = optJSONObject2.optJSONArray("banners");
        if (optJSONArray == null) {
            c.b(q.j);
            throw new JSONException("Json doesn't have banners");
        }
        if (optJSONArray.length() != 0) {
            return a(optJSONArray.getJSONObject(0), optJSONObject, b, a, c, a2);
        }
        c.b(q.j);
        throw new JSONException("Json contains empty banner list");
    }

    private ImageData a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (TextUtils.isEmpty(optString) || optInt <= 0 || optInt2 <= 0) {
            return null;
        }
        return ImageData.newImageData(optString, optInt, optInt2);
    }

    j7.d a(JSONObject jSONObject, j7 j7Var, y yVar, n nVar, x0 x0Var) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("evMovieId");
        String optString2 = jSONObject.optString("previewLink");
        int optInt = jSONObject.optInt("previewWidth");
        int optInt2 = jSONObject.optInt("previewHeight");
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString3 = optJSONObject.optString("src");
                int optInt3 = optJSONObject.optInt("width");
                int optInt4 = optJSONObject.optInt("height");
                int optInt5 = optJSONObject.optInt(VastAttributes.BITRATE);
                String optString4 = optJSONObject.optString(POBConstants.KEY_FORMAT);
                if (!optString3.isEmpty()) {
                    arrayList.add(new j7.e(optString3, optInt3, optInt4, optInt5, optString4));
                }
            }
        }
        j7.d a = j7.d.a(optString, optString2, optInt, optInt2, arrayList);
        y2 a2 = y2.a(yVar, nVar);
        a2.a(2);
        a2.a(jSONObject, a, x0Var.a("video"));
        th H = a.H();
        if (!H.f()) {
            H.b(j7Var.H(), a.t());
        }
        return a;
    }

    j7.c a(JSONObject jSONObject, s sVar, x0 x0Var, y2 y2Var) {
        String a = y2.a(jSONObject, sVar, x0Var);
        if (TextUtils.isEmpty(a)) {
            x0Var.a(3007, "unable to decode src/source property");
            return null;
        }
        j7.c A = j7.c.A(a);
        y2Var.a(jSONObject, A, x0Var);
        return A;
    }

    j7.b a(JSONObject jSONObject, j7 j7Var, s sVar, x0 x0Var, y2 y2Var) {
        String optString = jSONObject.optString("type");
        if (!"html".equals(optString)) {
            mi.a("InternalNativeAdBannerParser: InternalNativeAdContent banner has type " + optString);
            x0Var.a("type").c(3007, optString);
            return null;
        }
        String a = y2.a(jSONObject, sVar, x0Var);
        if (TextUtils.isEmpty(a)) {
            x0Var.a(3007, "unable to decode src/source property");
            return null;
        }
        j7.b a2 = j7.b.a(j7Var, a);
        y2Var.a(jSONObject, a2, x0Var);
        return a2;
    }

    List a(JSONArray jSONArray, j7 j7Var, x0 x0Var, y2 y2Var) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            x0 b = x0Var.b(i);
            if (optJSONObject != null) {
                j7.a a = a(i, optJSONObject, j7Var, b, y2Var);
                if (a != null) {
                    arrayList.add(a);
                }
            } else {
                b.c(3007);
            }
        }
        return arrayList;
    }

    j7.a a(int i, JSONObject jSONObject, j7 j7Var, x0 x0Var, y2 y2Var) {
        j7.a a = j7.a.a(j7Var);
        y2Var.a(jSONObject, a, x0Var);
        if (TextUtils.isEmpty(a.L())) {
            x0Var.a(3008, "required trackingLink is empty");
            return null;
        }
        if (a.y() == null) {
            x0Var.a(3008, "required image is empty");
            return null;
        }
        String str = j7Var.x() + "_" + i;
        String optString = jSONObject.optString("discount");
        String optString2 = jSONObject.optString("price");
        String optString3 = jSONObject.optString("oldPrice");
        String optString4 = jSONObject.optString("currency");
        String optString5 = jSONObject.optString("newPrice");
        a.A(str);
        a.k(optString);
        a.C(optString2);
        a.r(optString3);
        a.B(optString4);
        a.q(optString5);
        if (TextUtils.isEmpty(optString)) {
            mi.a("InternalNativeAdBannerParser: no discount value or the value is empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            mi.a("InternalNativeAdBannerParser: no price value or the value is empty.");
        }
        if (TextUtils.isEmpty(optString3)) {
            mi.a("InternalNativeAdBannerParser: no oldPrice value or the value is empty.");
        }
        if (TextUtils.isEmpty(optString4)) {
            mi.a("InternalNativeAdBannerParser: no currency value or the value is empty.");
        }
        a.n(jSONObject.optString("cardID", a.x()));
        return a;
    }
}
