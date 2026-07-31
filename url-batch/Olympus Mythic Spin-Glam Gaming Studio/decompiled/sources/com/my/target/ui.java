package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import com.my.target.e;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ui {
    private ui() {
    }

    public static ui a() {
        return new ui();
    }

    private e.a b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adId");
        if (optJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adId json object is mandatory");
        }
        String a = za.a(optJSONObject, "text");
        if (TextUtils.isEmpty(a)) {
            throw new JSONException("VastAdChoicesParser: adId:text json field is mandatory");
        }
        String a2 = za.a(optJSONObject, "copyText");
        if (TextUtils.isEmpty(a2)) {
            throw new JSONException("VastAdChoicesParser: adId:copyText json field is mandatory");
        }
        mi.a("VastAdChoicesParser: parsed adId: name = " + a + ", copyText = " + a2);
        return e.a.a(a, "copy", null, null, a2, null, false);
    }

    private e c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adInfo");
        if (optJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adInfo json object is mandatory");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(optJSONObject));
        arrayList.add(b(optJSONObject));
        ImageData e = e(optJSONObject);
        e.a f = f(optJSONObject);
        if (f != null) {
            arrayList.add(f);
        }
        e a = e.a(e, "");
        a.b(arrayList);
        mi.a("VastAdChoicesParser: parsed adInfo");
        return a;
    }

    private e.a d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("advertiserInfo");
        if (optJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo json object is mandatory");
        }
        String a = za.a(optJSONObject, "text");
        if (TextUtils.isEmpty(a)) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo:text json field is mandatory");
        }
        String a2 = za.a(optJSONObject, "url");
        if (!TextUtils.isEmpty(a2) && ti.e(a2)) {
            mi.a("VastAdChoicesParser: parsed advertiserInfo: name = " + a + ", clickLink = " + a2);
            return e.a.a(a, "default", null, a2, null, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + a2 + ") in advertiserInfo:url");
    }

    private ImageData e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: icon json object is mandatory");
        }
        String a = za.a(optJSONObject, "url");
        if (TextUtils.isEmpty(a) || !ti.e(a)) {
            throw new JSONException("VastAdChoicesParser: Invalid iconLink in adChoices = " + a);
        }
        mi.a("VastAdChoicesParser: parsed icon: url = " + a);
        return ImageData.newImageData(a);
    }

    private e.a f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("recommendationInfo");
        if (optJSONObject == null) {
            return null;
        }
        String a = za.a(optJSONObject, "text");
        if (TextUtils.isEmpty(a)) {
            throw new JSONException("VastAdChoicesParser: recommendationInfo:text json field is mandatory");
        }
        String a2 = za.a(optJSONObject, "url");
        if (!TextUtils.isEmpty(a2) && ti.e(a2)) {
            mi.a("VastAdChoicesParser: parsed recommendationInfo: name = " + a + ", clickLink = " + a2);
            return e.a.a(a, "default", null, a2, null, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + a2 + ") in recommendationInfo:url");
    }

    public e a(JSONObject jSONObject) {
        e c = c(jSONObject);
        mi.a("VastAdChoicesParser: parsed adChoices");
        return c;
    }
}
