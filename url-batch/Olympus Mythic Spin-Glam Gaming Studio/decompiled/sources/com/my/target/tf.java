package com.my.target;

import android.text.TextUtils;
import com.ironsource.X3;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.qrcta.Position;
import com.my.target.common.models.qrcta.QrCta;
import com.my.target.common.models.qrcta.QrIcon;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class tf {
    private static final Position a = Position.newPosition(0, 2);

    public static QrCta a(JSONObject jSONObject) {
        String c;
        ImageData g = g(jSONObject);
        if (g == null) {
            return null;
        }
        QrIcon f = f(jSONObject);
        ImageData b = b(jSONObject);
        String h = h(jSONObject);
        if (h == null || (c = c(jSONObject)) == null) {
            return null;
        }
        return QrCta.a(g, f, b, h, c, e(jSONObject), d(jSONObject));
    }

    private static ImageData b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("additionalImage");
        if (optJSONObject != null) {
            return c6.a(optJSONObject);
        }
        return null;
    }

    private static String c(JSONObject jSONObject) {
        String optString = jSONObject.optString("additionalText");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    private static int d(JSONObject jSONObject) {
        return x2.a(jSONObject.optString("colorScheme"));
    }

    private static Position e(JSONObject jSONObject) {
        Position a2;
        JSONObject optJSONObject = jSONObject.optJSONObject(X3.i.L);
        return (optJSONObject == null || (a2 = pe.a(optJSONObject)) == null) ? a : a2;
    }

    private static QrIcon f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("qrIconImage");
        if (optJSONObject != null) {
            return uf.a(optJSONObject);
        }
        return null;
    }

    private static ImageData g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("qrImage");
        if (optJSONObject != null) {
            return c6.a(optJSONObject);
        }
        return null;
    }

    private static String h(JSONObject jSONObject) {
        String optString = jSONObject.optString("title");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }
}
