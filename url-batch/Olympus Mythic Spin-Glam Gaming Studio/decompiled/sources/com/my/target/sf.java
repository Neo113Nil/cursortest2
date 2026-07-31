package com.my.target;

import com.my.target.common.models.qrcta.QrCta;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class sf {
    public static rf a(JSONObject jSONObject) {
        QrCta a;
        ji b = b(jSONObject);
        if (b == null || (a = tf.a(jSONObject)) == null) {
            return null;
        }
        return rf.a(a, b);
    }

    private static ji b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("timers");
        if (optJSONObject != null) {
            return ki.a(optJSONObject);
        }
        return null;
    }
}
